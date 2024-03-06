package com.kusitms.soullivec.domain.Output.controller;

import com.kusitms.soullivec.common.Response.SuccessCode;
import com.kusitms.soullivec.common.Response.SuccessResponse;
import com.kusitms.soullivec.domain.Output.dto.response.OutputResponseDto;
import com.kusitms.soullivec.domain.Output.dto.response.OutputSummaryResponseDto;
import com.kusitms.soullivec.domain.Output.service.OutputService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/output")
public class OutputController {

    private final OutputService outputService;

    //적합도 검사를 마친 output 반환
    @GetMapping("/{inputId}")
    public ResponseEntity<SuccessResponse<List<OutputResponseDto>>> getOutputResponse(@PathVariable Long inputId) {
        List<OutputResponseDto> response = outputService.getOutputResponseList(inputId);
        return SuccessResponse.of(SuccessCode.OK, response);
    }

    //output 요약 반환
    @GetMapping("/{inputId}/summary")
    public ResponseEntity<SuccessResponse<List<OutputSummaryResponseDto>>> getOutputSummaryResponse(@PathVariable Long inputId) {
        List<OutputSummaryResponseDto> response = outputService.getOutputSummaryResponseList(inputId);
        return SuccessResponse.of(SuccessCode.OK, response);
    }

}
