package com.example.springbasic.user.service;

import com.example.springbasic.user.dto.UserRequest;
import com.example.springbasic.user.exception.LoginExceptionType;
import com.example.springbasic.user.exception.UserException;
import com.example.springbasic.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public void userAdd(UserRequest userRequest) {

        if (userRequest.getUserId().isEmpty()) {
            throw new UserException(LoginExceptionType.USER_ID);
        }

        if (userRequest.getUserName().isEmpty()) {
            throw new UserException(LoginExceptionType.USER_NAME);
        }

    }
}
