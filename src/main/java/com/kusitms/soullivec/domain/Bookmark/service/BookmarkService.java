package com.kusitms.soullivec.domain.Bookmark.service;

import com.kusitms.soullivec.common.error.ApplicationException;
import com.kusitms.soullivec.common.error.ErrorCode;
import com.kusitms.soullivec.domain.Bookmark.dto.request.CreateBookmarkRequestDto;
import com.kusitms.soullivec.domain.Bookmark.dto.response.BookmarkResponseDto;
import com.kusitms.soullivec.domain.Bookmark.dto.response.CreateBookmarkResponseDto;
import com.kusitms.soullivec.domain.Bookmark.entity.Bookmark;
import com.kusitms.soullivec.domain.Bookmark.repository.BookmarkRepository;
import com.kusitms.soullivec.domain.Output.entity.Output;
import com.kusitms.soullivec.domain.Output.service.OutputService;
import com.kusitms.soullivec.domain.User.entity.User;
import com.kusitms.soullivec.domain.User.service.UserService;
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
    private final UserService userService;
    private final OutputService outputService;

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

    //bookmark 생성 dto화
    public CreateBookmarkResponseDto createBookmark(CreateBookmarkRequestDto bookmarkRequest) {
        Bookmark bookmark = saveBookmark(bookmarkRequest);
        return CreateBookmarkResponseDto.of(bookmark);
    }

    //user에 대한 bookmark List 반환
    private List<Bookmark> findAllBookmarkByUserId(Long userId) {
        User user = userService.findUserById(userId);
        return bookmarkRepository.findAllByUser(user);
    }

    //bookmark 생성
    private Bookmark saveBookmark(CreateBookmarkRequestDto bookmarkRequest) {
        User user = userService.findUserById(bookmarkRequest.getUserId());
        Output output = outputService.findOutputById(bookmarkRequest.getOutputId());
        Bookmark bookmark = Bookmark.createBookmark(user, output, bookmarkRequest);
        bookmarkRepository.save(bookmark);
        return bookmark;
    }

}
