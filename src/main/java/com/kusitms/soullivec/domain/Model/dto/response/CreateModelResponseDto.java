package com.kusitms.soullivec.domain.Model.dto.response;

import com.kusitms.soullivec.domain.Sample.entity.Sample;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelResponseDto {
    private String text;

    public static CreateModelResponseDto of(Sample sample) {
        return CreateModelResponseDto.builder()
                .text(sample.getText())
                .build();
    }
}