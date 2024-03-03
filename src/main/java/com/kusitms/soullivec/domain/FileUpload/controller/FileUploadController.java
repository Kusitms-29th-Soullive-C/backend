package com.kusitms.soullivec.domain.FileUpload.controller;


import com.kusitms.soullivec.domain.FileUpload.dto.response.FileUploadResponseDto;
import com.kusitms.soullivec.domain.FileUpload.service.FileUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/s3")
public class FileUploadController {

    private final FileUploadService fileUploadService;

    @PostMapping("/upload")
    public FileUploadResponseDto uploadFile(
            @RequestPart(value = "file") List<MultipartFile> images) {
        return fileUploadService.uploadFile(images);
    }

}
