package com.kusitms.soullivec.domain.Input.controller;


import com.kusitms.soullivec.domain.Input.service.InputService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/input")
public class InputController {

    private final InputService inputService;

    //input을 받을 때 하나씩 받는데 그럼 하나씩 받아서 input에 하나씩 추가해나가는 방식?

    //input 받기

}
