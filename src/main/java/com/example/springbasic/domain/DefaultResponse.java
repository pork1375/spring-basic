package com.example.springbasic.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class DefaultResponse<T> {

    private final String message;
    private final int code;
    private final T body;

    public DefaultResponse() {
        this.message = null;
        this.code = 200;
        this.body = null;
    }

    public DefaultResponse(final T body) {
        this.message = null;
        this.code = 200;
        this.body = body;
    }

    public DefaultResponse(final String message, final int code) {
        this.message = message;
        this.code = code;
        this.body = null;
    }

}
