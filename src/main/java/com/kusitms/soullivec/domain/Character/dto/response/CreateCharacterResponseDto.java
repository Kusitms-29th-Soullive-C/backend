package com.kusitms.soullivec.domain.Character.dto.response;

import com.kusitms.soullivec.domain.Character.entity.Character;
import com.kusitms.soullivec.domain.Model.entity.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCharacterResponseDto {

    private Long characterId;

    private String content;

    private Model model;

    public static CreateCharacterResponseDto of(Character character) {
        return CreateCharacterResponseDto.builder()

                .build();
    }
}