package com.kusitms.soullivec.domain.Input.entity;

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


}
