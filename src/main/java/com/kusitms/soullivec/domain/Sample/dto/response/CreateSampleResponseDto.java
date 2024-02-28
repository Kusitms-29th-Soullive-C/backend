package com.kusitms.soullivec.domain.Sample.dto.response;

import com.kusitms.soullivec.domain.Sample.entity.Sample;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateSampleResponseDto {
    private String text;

    public static CreateSampleResponseDto of(Sample sample) {
        return CreateSampleResponseDto.builder()
                .text(sample.getText())
                .build();
    }
}