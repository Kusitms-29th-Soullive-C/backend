package com.kusitms.soullivec.domain.Output.dto.response;

import com.kusitms.soullivec.domain.Output.entity.Output;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateOutputResponseDto {

    private Long outputId;

    private String modelName;

    private int ranking;

    private int fitness;

    private int issue;

    private String negativity;

    private String image;

    private String strategy;

    public static CreateOutputResponseDto of(Output output) {
        return CreateOutputResponseDto.builder()
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