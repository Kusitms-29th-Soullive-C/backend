package com.kusitms.soullivec.domain.Bookmark.service;

import com.kusitms.soullivec.common.error.ApplicationException;
import com.kusitms.soullivec.common.error.ErrorCode;
import com.kusitms.soullivec.domain.Bookmark.dto.response.BookmarkResponseDto;
import com.kusitms.soullivec.domain.Bookmark.entity.Bookmark;
import com.kusitms.soullivec.domain.Bookmark.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Transactional
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    //Bookmark List dto화
    public List<BookmarkResponseDto> getBookmarkResponseLIst(Long userId) {
        List<Bookmark> bookmarkList = findAllBookmarkByUserId(userId);
        return bookmarkList.stream()
                .map(BookmarkResponseDto::of)
                .collect(Collectors.toList());
    }

    //bookmark id로 찾기
    public Bookmark findBookmarkById(Long bookmarkId) {
        return bookmarkRepository.findById(bookmarkId)
                .orElseThrow(() -> new ApplicationException(ErrorCode.ENTITY_NOT_FOUND));
    }

    //user에 대한 bookmark List 반환
    private List<Bookmark> findAllBookmarkByUserId(Long userId) {
        return bookmarkRepository.findAllByUserId(userId);
    }

}
