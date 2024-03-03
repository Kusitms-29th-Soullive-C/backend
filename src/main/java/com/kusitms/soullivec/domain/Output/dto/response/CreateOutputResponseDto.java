package com.kusitms.soullivec.domain.Output.dto.response;

import com.kusitms.soullivec.domain.Sample.entity.Sample;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateOutputResponseDto {
    private String text;

    public static CreateOutputResponseDto of(Sample sample) {
        return CreateOutputResponseDto.builder()
                .text(sample.getText())
                .build();
    }
}