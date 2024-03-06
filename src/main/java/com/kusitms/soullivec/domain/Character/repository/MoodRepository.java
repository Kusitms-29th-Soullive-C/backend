package com.kusitms.soullivec.domain.Character.repository;

import com.kusitms.soullivec.domain.Character.entity.Mood;
import com.kusitms.soullivec.domain.Model.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MoodRepository extends JpaRepository<Mood, Long> {
    Optional<Object> findMoodByModelId(Model modelId);

    List<Mood> findAllByModelId(Model modelId);
}