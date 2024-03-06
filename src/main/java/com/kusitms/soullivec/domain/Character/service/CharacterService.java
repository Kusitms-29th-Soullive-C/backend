package com.kusitms.soullivec.domain.Character.service;

import com.kusitms.soullivec.domain.Character.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class CharacterService {

    private final CharacterRepository characterRepository;


}