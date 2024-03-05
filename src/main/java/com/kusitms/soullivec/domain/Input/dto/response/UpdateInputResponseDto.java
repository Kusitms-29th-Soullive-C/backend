package com.kusitms.soullivec.domain.Input.dto.response;

import com.kusitms.soullivec.domain.Input.entity.Gender;
import com.kusitms.soullivec.domain.Input.entity.Input;
import lombok.Getter;

@Getter
public class UpdateInputResponseDto {

    private Long id;

    private String companyName;

    private String brand;

    private String product;

    private Gender gender;

    private String age;

    public UpdateInputResponseDto(Input input) {
        this.id = input.getId();
        this.companyName = input.getCompanyName();
        this.brand = input.getBrand();
        this.product = input.getProduct();
        this.gender = input.getGender();
        this.age = input.getAge();
    }
}
