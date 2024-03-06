package com.kusitms.soullivec.domain.Mood.repository;

import com.kusitms.soullivec.domain.Mood.entity.Mood;
import com.kusitms.soullivec.domain.Model.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MoodRepository extends JpaRepository<Mood, Long> {

    Optional<Object> findMoodByModel(Model model);

    List<Mood> findAllByModel(Model model);

}