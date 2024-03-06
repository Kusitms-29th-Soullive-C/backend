package com.kusitms.soullivec.domain.Character.dto.response;

import com.kusitms.soullivec.domain.Character.entity.Mood;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MoodResponseDto {

    private Long moodId;

    private String content;

    private Long modelId;

    public static MoodResponseDto of(Mood mood) {
        return MoodResponseDto.builder()
                .moodId(mood.getMoodId())
                .content(mood.getContent())
                .modelId(mood.getModelId().getModelId())
                .build();
    }
}
