package com.kusitms.soullivec.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckAPI {
    @GetMapping("/api/health")
    public String healthCheck() {
        return "쏘울라이브C조 성공!";
    }
}
