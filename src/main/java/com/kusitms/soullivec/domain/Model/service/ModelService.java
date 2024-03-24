package com.kusitms.soullivec.domain.Model.service;

import com.amazonaws.services.s3.AmazonS3;
import com.kusitms.soullivec.common.error.ApplicationException;
import com.kusitms.soullivec.common.error.ErrorCode;
import com.kusitms.soullivec.domain.FileUpload.entity.Image;
import com.kusitms.soullivec.domain.Model.dto.response.ModelResponseDto;
import com.kusitms.soullivec.domain.Model.entity.Model;
import com.kusitms.soullivec.domain.Model.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.URL;


@RequiredArgsConstructor
@Service
@Transactional
public class ModelService {

    @Value("${cloud.aws.s3.bucket}")
    private String bucketName;
    private final AmazonS3 amazonS3;
    private final ModelRepository modelRepository;

    //model dto화
    public ModelResponseDto getModelResponse(Long modelId) {
        Model model = findModelById(modelId);
        return ModelResponseDto.of(model, getModelImgUrl(model));
    }

    //model 반환
    public Model findModelById(Long modelId) {
        return modelRepository.findById(modelId)
                .orElseThrow(() -> new ApplicationException(ErrorCode.ENTITY_NOT_FOUND));
    }

    private String getUrl(Image image) {
        URL url = amazonS3.getUrl(bucketName, image.getImageUrl());
        return "" + url;
    }

    private String getModelImgUrl(Model model) {
        return getUrl(model.getModelImage());
    }
}