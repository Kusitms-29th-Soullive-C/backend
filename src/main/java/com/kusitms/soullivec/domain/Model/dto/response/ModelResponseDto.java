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

    private String modelImg;

    private Long inputId;

    public static ModelResponseDto of(Model model, String modelImg) {
        return ModelResponseDto.builder()
                .modelId(model.getModelId())
                .modelName(model.getModelName())
                .job(model.getJob())
                .modelImg(modelImg)
                .inputId(model.getInput().getInputId())
                .build();
    }
}
