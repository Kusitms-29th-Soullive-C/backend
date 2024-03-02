package com.kusitms.soullivec.domain.Strategy.repository;

import com.kusitms.soullivec.domain.Sample.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StrategyRepository extends JpaRepository<Sample, Long> {
    Boolean existsByText(String text);
}