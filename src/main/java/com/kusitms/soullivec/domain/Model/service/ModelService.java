package com.kusitms.soullivec.domain.Model.service;

import com.kusitms.soullivec.common.error.ApplicationException;
import com.kusitms.soullivec.common.error.ErrorCode;
import com.kusitms.soullivec.domain.Model.dto.response.ModelResponseDto;
import com.kusitms.soullivec.domain.Model.entity.Model;
import com.kusitms.soullivec.domain.Model.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Service
@Transactional
public class ModelService {

    private final ModelRepository modelRepository;

    //model dto화
    public ModelResponseDto getModelResponse(Long modelId) {
        Model model = findModelById(modelId);
        return ModelResponseDto.of(model);
    }

    //model 반환
    private Model findModelById(Long modelId) {
        return modelRepository.findById(modelId)
                .orElseThrow(() -> new ApplicationException(ErrorCode.ENTITY_NOT_FOUND));
    }

}