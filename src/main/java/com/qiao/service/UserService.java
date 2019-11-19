package com.qiao.service;

import com.qiao.pojo.User;

/**
 * @author Silent
 * @date 2019/11/17 10:32:48
 * @description
 */
public interface UserService {
    public User queryUserByName(String name);
    public void insertUser(User user);
}
