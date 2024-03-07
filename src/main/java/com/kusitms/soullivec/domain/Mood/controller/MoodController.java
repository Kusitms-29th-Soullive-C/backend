package com.kusitms.soullivec.domain.Mood.controller;


import com.kusitms.soullivec.common.Response.SuccessCode;
import com.kusitms.soullivec.common.Response.SuccessResponse;
import com.kusitms.soullivec.domain.Mood.dto.response.MoodResponseDto;
import com.kusitms.soullivec.domain.Mood.service.MoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/mood")
public class MoodController {

    private final MoodService moodService;

    //model에 대한 character List 반환
    @GetMapping("/{modelId}")
    public ResponseEntity<SuccessResponse<List<MoodResponseDto>>> getAllMoodResponse(@PathVariable Long modelId) {
        List<MoodResponseDto> response = moodService.getMoodResponseList(modelId);
        return SuccessResponse.of(SuccessCode.OK, response);
    }

}
