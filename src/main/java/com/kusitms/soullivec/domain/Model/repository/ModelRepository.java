package com.kusitms.soullivec.domain.Model.repository;

import com.kusitms.soullivec.domain.Sample.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Sample, Long> {
    Boolean existsByText(String text);
}