package com.kusitms.soullivec.domain.Output.repository;

import com.kusitms.soullivec.domain.Output.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OutputRepository extends JpaRepository<Output, Long> {

    Optional<Object> findOutputByInputId(Long inputId);

    List<Output> findAllOutputByInputId(Long inputId);
}