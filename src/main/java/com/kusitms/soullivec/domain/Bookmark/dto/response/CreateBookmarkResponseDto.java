package com.kusitms.soullivec.domain.Bookmark.dto.response;

import com.kusitms.soullivec.domain.Bookmark.entity.Bookmark;
import com.kusitms.soullivec.domain.Output.entity.Output;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookmarkResponseDto {

    private Long bookmarkId;

    private Long userId;

    private Long modelId;

    private Long outputId;

    public static CreateBookmarkResponseDto of(Bookmark bookmark) {
        return CreateBookmarkResponseDto.builder()
                .bookmarkId(bookmark.getBookmarkId())
                .userId(bookmark.getUser().getUserId())
                .modelId(bookmark.getOutput().getModel().getModelId())
                .outputId(bookmark.getOutput().getOutputId())
                .build();
    }
}
