package com.example.springbasic.google.login.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/google")
public class GoogleLoginController {

    @GetMapping("/login")
    public String googleLogin() {
        return "/google/login";
    }

}
