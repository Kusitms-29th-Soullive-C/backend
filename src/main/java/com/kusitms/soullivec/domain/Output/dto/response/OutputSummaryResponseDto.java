package com.kusitms.soullivec.domain.Output.dto.response;


import com.kusitms.soullivec.domain.Mood.entity.Mood;
import com.kusitms.soullivec.domain.Output.entity.Output;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class OutputSummaryResponseDto {

    private Long outputId;

    private Long modelId;

    private String modelName;

    private String job;

    private String modelImg;

    private List<String> mood;

    private static List<String> getMoodList(List<Mood> moods) {
        return moods.stream()
                .map(Mood::getContent)
                .toList();
    }

    public static OutputSummaryResponseDto of(Output output, String modelImg) {
        return OutputSummaryResponseDto.builder()
                .outputId(output.getOutputId())
                .modelId(output.getModel().getModelId())
                .modelName(output.getModel().getModelName())
                .job(output.getModel().getJob())
                .modelImg(modelImg)
                .mood(getMoodList((output.getModel().getMood())))
                .build();
    }
}
