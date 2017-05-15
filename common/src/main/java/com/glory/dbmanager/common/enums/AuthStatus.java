package com.glory.dbmanager.common.enums;

/**
 * Created by yangch on 2017/5/15 0015.
 */
public enum AuthStatus {
    NOEXIST(0, "用户不存在"), YES(1, "登入"), NO(2, "用户名或密码错误");
    private int status;
    private String msg;

    AuthStatus(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
