package com.kusitms.soullivec.domain.Model.controller;


import com.kusitms.soullivec.common.Response.SuccessCode;
import com.kusitms.soullivec.common.Response.SuccessResponse;
import com.kusitms.soullivec.domain.Model.dto.response.ModelResponseDto;
import com.kusitms.soullivec.domain.Model.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/model")
public class ModelController {

    private final ModelService modelService;

    //model 반환
    @GetMapping("/{modelId}")
    public ResponseEntity<SuccessResponse<ModelResponseDto>> getModelResponse(@PathVariable Long modelId) {
        ModelResponseDto response = modelService.getModelResponse(modelId);
        return SuccessResponse.of(SuccessCode.OK,response);
    }

}
