package com.glory.dbmanager.dao.mapper;


import com.glory.dbmanager.common.model.User;

/**
 * Created by yangch on 2017/5/15 0015.
 */
public interface UserMapper {
    User get(int id);

    User auth(String username);
}
