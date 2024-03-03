package com.kusitms.soullivec.domain.FileUpload.repository;

import com.kusitms.soullivec.domain.FileUpload.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {

}