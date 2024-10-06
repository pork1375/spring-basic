package com.example.springbasic.eventHandler.service;

import com.example.springbasic.eventHandler.dto.User1;
import com.example.springbasic.eventHandler.dto.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

;

@Service
public class EventHandlerService {

    @Autowired
    ApplicationEventPublisher publisher;

    public void nice(User1 user) {
        publisher.publishEvent(user);
    }

    public void nice2(User2 user) {
        publisher.publishEvent(user);
    }
}
