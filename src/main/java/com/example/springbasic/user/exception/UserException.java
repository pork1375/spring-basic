package com.example.springbasic.user.exception;

import lombok.Getter;

@Getter
public class UserException extends RuntimeException {

    private int code;

    public UserException(String message, int code) {
        super(message);
        this.code = code;
    }

    public UserException(final LoginExceptionType loginExceptionType) {
        super(loginExceptionType.getMessage());
        this.code = loginExceptionType.getCode();
    }

    @Override
    public String toString() {
        return "LoginException{" +
                "message='" + super.getMessage() + '\'' +
                ", code=" + code +
                '}';
    }
}
