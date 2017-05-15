package com.glory.dbmanager.api;

import com.glory.dbmanager.common.enums.AuthStatus;

/**
 * Created by yangch on 2017/5/15 0015.
 */
public interface AuthApi {
    AuthStatus login(String username, String password);
}
