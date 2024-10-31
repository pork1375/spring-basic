package com.example.springbasic.user.controller;

import com.example.springbasic.domain.DefaultResponse;
import com.example.springbasic.user.exception.UserException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class UserAdvice {

    @ExceptionHandler(UserException.class)
    public ResponseEntity<DefaultResponse<Void>> exception(final UserException e) {
        return new ResponseEntity<>(new DefaultResponse<>(e.getMessage(), e.getCode()), HttpStatus.OK);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<DefaultResponse<Void>> exception(final Exception e) {
        return new ResponseEntity<>(new DefaultResponse<>(e.getMessage(), -1), HttpStatus.OK);
    }


}
