package com.example.springbasic.user.exception;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum LoginExceptionType {

    USER_ID("아이디를 입력하세요.", 1001),
    USER_NAME("이름을 입력하세요.", 1002),
    USER_EMAIL("이메일을 입력하세요.", 1003),
    USER_PASSWORD("비밀번호를 입력하세요.", 1004);

    private final String message;
    private final int code;

    LoginExceptionType(String message, int code) {
        this.message = message;
        this.code = code;
    }
}
