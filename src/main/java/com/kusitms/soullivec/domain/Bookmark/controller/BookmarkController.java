package com.kusitms.soullivec.domain.Bookmark.controller;

import com.kusitms.soullivec.common.Response.SuccessCode;
import com.kusitms.soullivec.common.Response.SuccessResponse;
import com.kusitms.soullivec.domain.Bookmark.dto.request.CreateBookmarkRequestDto;
import com.kusitms.soullivec.domain.Bookmark.dto.response.BookmarkResponseDto;
import com.kusitms.soullivec.domain.Bookmark.dto.response.CreateBookmarkResponseDto;
import com.kusitms.soullivec.domain.Bookmark.service.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/bookmark")
public class BookmarkController {

    private final BookmarkService bookmarkService;

    //bookmark 생성
    @PostMapping
    public ResponseEntity<SuccessResponse<CreateBookmarkResponseDto>> createBookmarkResponse(@RequestBody CreateBookmarkRequestDto request) {
        CreateBookmarkResponseDto response = bookmarkService.createBookmark(request);
        return SuccessResponse.of(SuccessCode.CREATED, response);
    }

    //user에 따른 bookmark list 반환
    @GetMapping("/{userId}/all-bookmarks")
    public ResponseEntity<SuccessResponse<List<BookmarkResponseDto>>> getAllBookmarkResponse(@PathVariable Long userId) {
        List<BookmarkResponseDto> response = bookmarkService.getBookmarkResponseLIst(userId);
        return SuccessResponse.of(SuccessCode.OK, response);
    }

}
