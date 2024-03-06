package com.kusitms.soullivec.domain.User.controller;

import com.kusitms.soullivec.common.Response.SuccessResponse;
import com.kusitms.soullivec.domain.User.dto.response.UserSignUpRequestDto;
import com.kusitms.soullivec.domain.User.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/sign-up")
    public ResponseEntity<SuccessResponse> userSignUp(@RequestBody UserSignUpRequestDto userSignUpRequestDto) {
        return null;
    }
}
