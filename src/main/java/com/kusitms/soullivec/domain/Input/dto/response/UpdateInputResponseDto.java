package com.kusitms.soullivec.domain.Input.dto.response;

import com.kusitms.soullivec.domain.Input.entity.Gender;
import com.kusitms.soullivec.domain.Input.entity.Input;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UpdateInputResponseDto {

    private Long inputId;

    private String companyName;

    private String brand;

    private String product;

    private Gender gender;

    private String age;

    public static UpdateInputResponseDto of(Input input) {
        return UpdateInputResponseDto.builder()
                .inputId(input.getInputId())
                .companyName(input.getCompanyName())
                .brand(input.getBrand())
                .product(input.getProduct())
                .gender(input.getGender())
                .age(input.getAge())
                .build();
    }
}
