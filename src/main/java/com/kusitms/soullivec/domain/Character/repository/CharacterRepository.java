package com.kusitms.soullivec.domain.Character.repository;

import com.kusitms.soullivec.domain.Character.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}