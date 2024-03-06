package com.kusitms.soullivec.domain.Character.controller;


import com.kusitms.soullivec.domain.Character.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    private final CharacterService characterService;

}
