package com.kusitms.soullivec.domain.Output.dto.response;


import com.kusitms.soullivec.domain.Output.entity.Output;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class OutputSummaryResponseDto {

    private Long outputId;

    public static OutputSummaryResponseDto of(Output output) {
        return OutputSummaryResponseDto.builder()
                .outputId(output.getOutputId())
                .build();
    }
}
