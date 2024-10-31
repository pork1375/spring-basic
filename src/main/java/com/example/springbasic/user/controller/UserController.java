package com.example.springbasic.user.controller;

import com.example.springbasic.domain.DefaultResponse;
import com.example.springbasic.user.dto.UserRequest;
import com.example.springbasic.user.exception.UserException;
import com.example.springbasic.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/login")
public class UserController {

    private final UserService userService;

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

    @PostMapping("/user-add")
    @ResponseBody
    public ResponseEntity<DefaultResponse<Void>> userAdd(@RequestBody UserRequest userRequest) {
        try {
            userService.userAdd(userRequest);
        } catch (UserException e) {
            return new ResponseEntity<>(new DefaultResponse<>(e.getMessage(), e.getCode()), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new DefaultResponse<>(), HttpStatus.OK);
    }

}
