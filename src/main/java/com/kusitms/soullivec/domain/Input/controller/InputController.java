package com.kusitms.soullivec.domain.Input.controller;


import com.kusitms.soullivec.common.Response.SuccessCode;
import com.kusitms.soullivec.common.Response.SuccessResponse;
import com.kusitms.soullivec.domain.Input.dto.request.CreateInputRequestDto;
import com.kusitms.soullivec.domain.Input.dto.request.UpdateInputRequestDto;
import com.kusitms.soullivec.domain.Input.dto.response.CreateInputResponseDto;
import com.kusitms.soullivec.domain.Input.dto.response.UpdateInputResponseDto;
import com.kusitms.soullivec.domain.Input.service.InputService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/input")
public class InputController {

    private final InputService inputService;

    //input 받기
    @PostMapping
    public ResponseEntity<SuccessResponse<CreateInputResponseDto>> createInput(@RequestBody CreateInputRequestDto inputRequestDto) {
        CreateInputResponseDto response = inputService.createInput(inputRequestDto);
        return SuccessResponse.of(SuccessCode.CREATED, response);
    }

    @PutMapping("/{inputId}")
    public ResponseEntity<SuccessResponse<UpdateInputResponseDto>> updateInput(@RequestBody UpdateInputRequestDto updateInputRequestDto,
                                                                               @PathVariable Long inputId) {
        UpdateInputResponseDto response = inputService.updateInputDto(inputId, updateInputRequestDto);
        return SuccessResponse.of(SuccessCode.CREATED, response);
    }

}
