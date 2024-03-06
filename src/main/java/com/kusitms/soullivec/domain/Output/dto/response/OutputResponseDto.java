package com.kusitms.soullivec.domain.Output.dto.response;

import com.kusitms.soullivec.domain.Output.entity.Output;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class OutputResponseDto {

    private Long outputId;

    private int ranking;

    private int fitness;

    private int issue;

    private String negativity;

    private String image;

    private String strategy;

    public static OutputResponseDto of(Output output) {
        return OutputResponseDto.builder()
                .outputId(output.getOutputId())
                .ranking(output.getRanking())
                .fitness(output.getFitness())
                .issue(output.getIssue())
                .negativity(output.getNegativity())
                .image(output.getImage())
                .strategy(output.getStrategy())
                .build();
    }
}
