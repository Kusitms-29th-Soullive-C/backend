package com.kusitms.soullivec.domain.Bookmark.dto.response;

import com.kusitms.soullivec.domain.Bookmark.entity.Bookmark;
import com.kusitms.soullivec.domain.Mood.entity.Mood;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class BookmarkResponseDto {

    private Long bookmarkId;

    private Long userId;

    private Long modelId;

    private String modelName;

    private String job;

    private List<String> mood;

    private Long outputId;

    private static List<String> getMoodList(List<Mood> moods) {
        return moods.stream()
                .map(Mood::getContent)
                .toList();
    }

    public static BookmarkResponseDto of(Bookmark bookmark) {
        return BookmarkResponseDto.builder()
                .bookmarkId(bookmark.getBookmarkId())
                .userId(bookmark.getUser().getUserId())
                .modelId(bookmark.getOutput().getModel().getModelId())
                .modelName(bookmark.getOutput().getModel().getModelName())
                .job(bookmark.getOutput().getModel().getJob())
                .mood(getMoodList(bookmark.getOutput().getModel().getMood()))
                .outputId(bookmark.getOutput().getOutputId())
                .build();
    }
}
