package com.kusitms.soullivec.domain.Input.dto.request;

import com.kusitms.soullivec.domain.Input.entity.Gender;
import lombok.Getter;

@Getter
public class CreateInputRequestDto {

    private String companyName;

    private String brand;

    private String product;

    private Gender gender;

}