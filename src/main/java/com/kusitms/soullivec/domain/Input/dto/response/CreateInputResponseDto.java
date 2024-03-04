package com.kusitms.soullivec.domain.Input.dto.response;

import com.kusitms.soullivec.domain.Input.entity.Gender;
import com.kusitms.soullivec.domain.Input.entity.Input;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateInputResponseDto {

    private Long id;

    private String companyName;

    private String brand;

    private String product;

    private Gender gender;

    private String age;

    public static CreateInputResponseDto of(Input input) {
        return CreateInputResponseDto.builder()
                .id(input.getId())
                .companyName(input.getCompanyName())
                .brand(input.getBrand())
                .product(input.getProduct())
                .gender(input.getGender())
                .age(input.getAge())
                .build();
    }
}