package com.example.springbasic.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class UserController {

    /** 로그인 */
    @GetMapping("")
    public String loginView() {
        return "login/login";
    }

    /** 회원가입 */
    @GetMapping("/user-add")
    public String loginAddView() {
        return "login/loginInsert";
    }

}
