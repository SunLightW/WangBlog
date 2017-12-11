package cn.wblog.service;

import cn.wblog.entity.User;

import java.util.List;

/**
 * 用户service接口
 */
public interface UserService {

    String getUserByUsername(String username);

    List<User> findAllUser();

    void insertUser(User user);
}
