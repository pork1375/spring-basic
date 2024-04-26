package com.example.springbasic.eventHandler.controller;


import com.example.springbasic.eventHandler.dto.User1;
import com.example.springbasic.eventHandler.dto.User2;
import com.example.springbasic.eventHandler.service.EventHandlerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventHandlerController {

    private final EventHandlerService eventHandlerService;

    @RequestMapping("/event")
    public String event() {
        System.out.println("회원가입 신청");
        eventHandlerService.nice(new User1("chan"));
        System.out.println("회원가입 완료");

        return "ok";
    }

    @RequestMapping("/event2")
    public String event2() {
        System.out.println("회원가입 신청 2");
        eventHandlerService.nice2(new User2("chansung"));
        System.out.println("회원가입 완료 2");

        return "ok";
    }

}
