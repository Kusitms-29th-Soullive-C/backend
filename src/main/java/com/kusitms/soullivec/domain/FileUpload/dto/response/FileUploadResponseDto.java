package com.kusitms.soullivec.domain.FileUpload.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class FileUploadResponseDto {
    List<String> fileUrls = new ArrayList<>();

    public FileUploadResponseDto(List<String> fileUrls){
        this.fileUrls=fileUrls;
    }

}