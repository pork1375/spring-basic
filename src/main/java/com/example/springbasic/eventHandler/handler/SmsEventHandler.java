package com.example.springbasic.eventHandler.handler;

import com.example.springbasic.eventHandler.dto.User1;
import com.example.springbasic.eventHandler.dto.User2;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SmsEventHandler {

    @EventListener
    @Async
    public void hello1(User1 user1) {
        System.out.println(user1.getName() + "님 환영합니다.");
    }

    @EventListener
    @Async
    public void hello2(User1 user1) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(user1.getName() + "님 계정생성 / time : " + LocalDateTime.now());
    }

    @EventListener
    @Async
    public void hello3(User1 user1) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println(user1.getName() + "님 환영 문자 발송 / time :" + LocalDateTime.now());
    }

    @EventListener
    @Async
    public void hello4(User2 user) {
        System.out.println(user.getName() + "님 반갑습니다./ time :" + LocalDateTime.now());
    }
}
