package cn.wblog.service;

import cn.wblog.entity.User;

/**
 * 用户service接口
 */
public interface UserService {

    User getUserByUsername(String username);
}
