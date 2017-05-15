package com.glroy.dbmanager.service.impl;

import com.glory.dbmanager.api.AuthApi;
import com.glory.dbmanager.common.enums.AuthStatus;
import com.glory.dbmanager.common.model.User;
import com.glory.dbmanager.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangch on 2017/5/2 0002.
 */
@Service
public class AuthApiImpl implements AuthApi {
    @Autowired
    private UserMapper userMapper;

    @Override
    public AuthStatus login(String username, String password) {
        User user = userMapper.auth(username);
        if (user == null) {
            return AuthStatus.NOEXIST;
        } else if (password.equals(user.getPassword())) {
            return AuthStatus.NO;
        }
        return AuthStatus.YES;
    }
}
