package com.kusitms.soullivec.domain.Output.controller;

import com.kusitms.soullivec.domain.Output.service.OutputService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/output")
public class OutputController {

    private final OutputService outputService;

    //적합도 검사를 마친 output 반환

}
