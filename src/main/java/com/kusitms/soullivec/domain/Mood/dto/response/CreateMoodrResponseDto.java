package com.kusitms.soullivec.domain.Mood.dto.response;

import com.kusitms.soullivec.domain.Model.entity.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateMoodrResponseDto {

    private Long characterId;

    private String content;

    private Model modelId;

}