package com.kusitms.soullivec.domain.Input.entity;

import com.kusitms.soullivec.domain.Input.dto.request.CreateInputRequestDto;
import com.kusitms.soullivec.domain.Input.dto.request.UpdateInputRequestDto;
import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Input {

    @Id
    @Column(name = "input_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "brand")
    private String brand;

    @Column(name = "product")
    private String product;

    @Enumerated(EnumType.STRING)
    @Column(name="gender")
    private Gender gender;

    @Column(name = "age")
    private String age;

    //age에 대한 수정 필요
    public void update(UpdateInputRequestDto updateInputRequestDto) {
        this.companyName = updateInputRequestDto.getCompanyName();
        this.brand = updateInputRequestDto.getBrand();
        this.product = updateInputRequestDto.getProduct();
        this.gender = updateInputRequestDto.getGender();
        this.age= updateInputRequestDto.getAge();
    }

    public static Input createInput(CreateInputRequestDto inputRequestDto) {
        return Input.builder()
                .companyName(inputRequestDto.getCompanyName())
                .brand(inputRequestDto.getBrand())
                .product(inputRequestDto.getProduct())
                .gender(inputRequestDto.getGender())
                .age(inputRequestDto.getAge())
                .build();
    }
}
