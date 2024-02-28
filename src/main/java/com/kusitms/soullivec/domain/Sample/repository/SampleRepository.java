package com.kusitms.soullivec.domain.Sample.repository;

import com.kusitms.soullivec.domain.Sample.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {
    Boolean existsByText(String text);
}