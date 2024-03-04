package com.kusitms.soullivec.domain.Input.service;

import com.kusitms.soullivec.common.error.ApplicationException;
import com.kusitms.soullivec.common.error.ErrorCode;
import com.kusitms.soullivec.domain.Input.dto.request.CreateInputRequestDto;
import com.kusitms.soullivec.domain.Input.dto.request.UpdateInputRequestDto;
import com.kusitms.soullivec.domain.Input.dto.response.CreateInputResponseDto;
import com.kusitms.soullivec.domain.Input.dto.response.UpdateInputResponseDto;
import com.kusitms.soullivec.domain.Input.entity.Input;
import com.kusitms.soullivec.domain.Input.repository.InputRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class InputService {

    private final InputRepository inputRepository;

    //input 생성 dto화
    public CreateInputResponseDto createInput(CreateInputRequestDto inputRequestDto) {
        Input input = saveInput(inputRequestDto);
        return CreateInputResponseDto.of(input);
    }

    //input 수정 dto화
    public UpdateInputResponseDto updateInputDto(Long inputId, UpdateInputRequestDto updateInputRequestDto) {
        Input input = updateInput(inputId, updateInputRequestDto);
        return new UpdateInputResponseDto(input);
    }

    //input 생성
    private Input saveInput(CreateInputRequestDto inputRequestDto) {
        Input input = Input.createInput(inputRequestDto);
        inputRepository.save(input);
        return input;
    }

    //input 수정
    private Input updateInput(Long inputId, UpdateInputRequestDto updateInputRequestDto) {
        Input input = findInputById(inputId);
        input.update(updateInputRequestDto);
        return inputRepository.save(input);
    }

    private Input findInputById(Long id) {
        return inputRepository.findById(id)
                .orElseThrow(() -> new ApplicationException(ErrorCode.ENTITY_NOT_FOUND));
    }

}
