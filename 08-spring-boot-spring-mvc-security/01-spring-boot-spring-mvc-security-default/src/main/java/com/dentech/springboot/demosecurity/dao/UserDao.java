package com.dentech.springboot.demosecurity.dao;

import com.dentech.springboot.demosecurity.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
