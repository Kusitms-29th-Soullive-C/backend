package com.kusitms.soullivec.domain.Character.dto.request;

import com.kusitms.soullivec.domain.Model.entity.Model;
import lombok.Getter;

@Getter
public class CreateMoodRequestDto {

    private Long characterId;

    private String content;

    private Model modelId;
}