package com.kusitms.soullivec.domain.Model.dto.response;

import com.kusitms.soullivec.domain.Model.entity.Model;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ModelResponseDto {

    private Long modelId;

    private String modelName;

    private String job;

    private Long inputId;

    public static ModelResponseDto of(Model model) {
        return ModelResponseDto.builder()
                .modelId(model.getModelId())
                .modelName(model.getModelName())
                .job(model.getJob())
                .inputId(model.getInput())
                .build();
    }
}
