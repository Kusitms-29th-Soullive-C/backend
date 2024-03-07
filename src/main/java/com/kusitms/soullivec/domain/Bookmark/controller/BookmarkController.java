package com.kusitms.soullivec.domain.Bookmark.controller;

import com.kusitms.soullivec.common.Response.SuccessCode;
import com.kusitms.soullivec.common.Response.SuccessResponse;
import com.kusitms.soullivec.domain.Bookmark.dto.response.BookmarkResponseDto;
import com.kusitms.soullivec.domain.Bookmark.service.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/bookmark")
public class BookmarkController {

    private final BookmarkService bookmarkService;

    //user에 따른 bookmark list 반환
    @GetMapping("/{userId}/all-bookmarks")
    public ResponseEntity<SuccessResponse<List<BookmarkResponseDto>>> getAllBookmarkResponse(@PathVariable Long userId) {
        List<BookmarkResponseDto> response = bookmarkService.getBookmarkResponseLIst(userId);
        return SuccessResponse.of(SuccessCode.OK, response);

    }

}
