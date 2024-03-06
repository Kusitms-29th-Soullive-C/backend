package com.kusitms.soullivec.domain.Output.dto.request;

import lombok.Getter;

@Getter
public class CreateOutputRequestDto {

    private Long outputId;

    private int rank;

    private int fitness;

    private int issue;

    private String negativity;

    private String image;

    private String strategy;

}