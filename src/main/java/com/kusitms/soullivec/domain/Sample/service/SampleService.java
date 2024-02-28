package com.kusitms.soullivec.domain.Sample.service;

import com.kusitms.soullivec.common.error.ApplicationException;
import com.kusitms.soullivec.domain.Sample.dto.response.CreateSampleResponseDto;
import com.kusitms.soullivec.domain.Sample.entity.Sample;
import com.kusitms.soullivec.domain.Sample.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.kusitms.soullivec.common.error.ErrorCode.DUPLICATE_SAMPLE_TEXT;

@RequiredArgsConstructor
@Service
@Transactional
public class SampleService {

    private final SampleRepository sampleRepository;

    public CreateSampleResponseDto createSample(String text) {
        validateDuplicateText(text);
        Sample sample = saveText(text);
        return CreateSampleResponseDto.of(sample);
    }

    private void validateDuplicateText(String text) {
        if(sampleRepository.existsByText(text)) {
            throw new ApplicationException(DUPLICATE_SAMPLE_TEXT);
        }
    }
    private Sample saveText(String text) {
        Sample sample = Sample.createSample(text);
        sampleRepository.save(sample);
        return sample;
    }
}