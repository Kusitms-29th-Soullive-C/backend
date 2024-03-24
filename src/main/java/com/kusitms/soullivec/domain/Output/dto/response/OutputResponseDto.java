package com.kusitms.soullivec.domain.Output.dto.response;

import com.kusitms.soullivec.domain.Mood.entity.Mood;
import com.kusitms.soullivec.domain.Output.entity.Output;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class OutputResponseDto {

    private Long outputId;

    private Long modelId;

    private String modelName;

    private String job;

    private String modelImg;

    private List<String> mood;

    private int ranking;

    private int fitness;

    private int issue;

    private String negativity;

    private String image;

    private String strategy;

    private static List<String> getMoodList(List<Mood> moods) {
        return moods.stream()
                .map(Mood::getContent)
                .toList();
    }

    public static OutputResponseDto of(Output output, String modelImg) {
        return OutputResponseDto.builder()
                .outputId(output.getOutputId())
                .modelId(output.getModel().getModelId())
                .modelName(output.getModel().getModelName())
                .job(output.getModel().getJob())
                .modelImg(modelImg)
                .mood(getMoodList((output.getModel().getMood())))
                .ranking(output.getRanking())
                .fitness(output.getFitness())
                .issue(output.getIssue())
                .negativity(output.getNegativity())
                .image(output.getImage())
                .strategy(output.getStrategy())
                .build();
    }
}
