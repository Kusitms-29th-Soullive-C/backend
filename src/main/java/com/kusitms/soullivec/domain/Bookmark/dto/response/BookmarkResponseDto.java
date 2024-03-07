package com.kusitms.soullivec.domain.Bookmark.dto.response;

import com.kusitms.soullivec.domain.Bookmark.entity.Bookmark;
import com.kusitms.soullivec.domain.Output.entity.Output;
import com.kusitms.soullivec.domain.User.entity.User;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BookmarkResponseDto {

    private Long bookmarkId;

    private User userId;

    private Long outputId;

    public static BookmarkResponseDto of(Bookmark bookmark) {
        return BookmarkResponseDto.builder()
                .bookmarkId(bookmark.getBookmarkId())
                .userId(bookmark.getUser())
                .outputId(bookmark.getOutput().getOutputId())
                .build();
    }
}
