package com.glory.dbmanager.web.controller;

import com.glory.dbmanager.api.AuthApi;
import com.glory.dbmanager.common.enums.AuthStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangch on 2017/5/2 0002.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    private AuthApi authApi;

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public AuthStatus login(String username, String password) {
        logger.info("username=" + username + ",password=" + password);
        return authApi.login(username, password);
    }
}
