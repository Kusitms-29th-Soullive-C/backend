package com.kusitms.soullivec.domain.Output.repository;

import com.kusitms.soullivec.domain.Sample.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutputRepository extends JpaRepository<Sample, Long> {
    Boolean existsByText(String text);
}