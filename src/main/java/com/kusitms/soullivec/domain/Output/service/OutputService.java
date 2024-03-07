package com.kusitms.soullivec.domain.Output.service;

import com.kusitms.soullivec.common.error.ApplicationException;
import com.kusitms.soullivec.common.error.ErrorCode;
import com.kusitms.soullivec.domain.Output.dto.response.OutputResponseDto;
import com.kusitms.soullivec.domain.Output.dto.response.OutputSummaryResponseDto;
import com.kusitms.soullivec.domain.Output.entity.Output;
import com.kusitms.soullivec.domain.Output.repository.OutputRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Transactional
public class OutputService {

    private final OutputRepository outputRepository;

    //output dto List
    public List<OutputResponseDto> getOutputResponseList(Long inputId) {
        List<Output> outputList = findAllOutputByInputId(inputId);

        return outputList.stream()
                .map(OutputResponseDto::of)
                .collect(Collectors.toList());
    }

    //output summary dto List
    public List<OutputSummaryResponseDto> getOutputSummaryResponseList(Long inputId) {
        List<Output> outputList = findAllOutputByInputId(inputId);

        return outputList.stream()
                .map(OutputSummaryResponseDto::of)
                .collect(Collectors.toList());
    }

    //output id에 대한 output dto화
    public OutputResponseDto getOutputResponseDto(Long outputId) {
        Output output = findOutputById(outputId);
        return OutputResponseDto.of(output);
    }

    //input id에 대한 output dto화
    public OutputResponseDto createOutputResponseDto(Long inputId) {
        Output output = findOutputByInputId(inputId);
        return OutputResponseDto.of(output);
    }

    //output summary dto화
    public OutputSummaryResponseDto createOutputSummaryDto(Long outputId) {
        Output output = findOutputByInputId(outputId);
        return OutputSummaryResponseDto.of(output);
    }

    //output 반환
    private Output findOutputById(Long outputId) {
        return outputRepository.findById(outputId)
                .orElseThrow(() -> new ApplicationException(ErrorCode.ENTITY_NOT_FOUND));
    }

    //input과 model에 대한 적합도 검사 후 output 반환
    private Output findOutputByInputId(Long inputId) {
        return (Output) outputRepository.findOutputByInputId(inputId)
                .orElseThrow(() -> new ApplicationException(ErrorCode.ENTITY_NOT_FOUND));
    }

    private List<Output> findAllOutputByInputId(Long inputId) {
        return outputRepository.findAllOutputByInputId(inputId);
    }

}