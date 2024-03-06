package com.kusitms.soullivec.domain.Mood.service;

import com.kusitms.soullivec.common.error.ApplicationException;
import com.kusitms.soullivec.common.error.ErrorCode;
import com.kusitms.soullivec.domain.Mood.dto.response.MoodResponseDto;
import com.kusitms.soullivec.domain.Mood.entity.Mood;
import com.kusitms.soullivec.domain.Mood.repository.MoodRepository;
import com.kusitms.soullivec.domain.Model.entity.Model;
import com.kusitms.soullivec.domain.Model.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Transactional
public class MoodService {

    private final MoodRepository moodRepository;
    private final ModelService modelService;

    //mood dto List
    public List<MoodResponseDto> getMoodResponseList(Long modelId) {
        List<Mood> moodList = findAllMoodByModelId(modelId);
        return moodList.stream()
                .map(MoodResponseDto::of)
                .collect(Collectors.toList());
    }

    //mood dto화
    public MoodResponseDto getMoodResponse(Long modelId) {
        Mood mood = findMoodByModelId(modelId);
        return MoodResponseDto.of(mood);
    }

    //mood 반환
    private Mood findMoodByModelId(Long modelId) {
        Model model = modelService.findModelById(modelId);
        return (Mood) moodRepository.findMoodByModel(model)
                .orElseThrow(() -> new ApplicationException(ErrorCode.ENTITY_NOT_FOUND));
    }

    //moodList 반환
    private List<Mood> findAllMoodByModelId(Long modelId) {
        Model model = modelService.findModelById(modelId);
        return moodRepository.findAllByModel(model);
    }
}