package com.kusitms.soullivec.domain.Model.controller;


import com.kusitms.soullivec.domain.Model.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/model")
public class ModelController {

    private final ModelService modelService;

    //model 입력 받기


}
