package cn.wblog.service.impl;

import cn.wblog.dao.UserMapper;
import cn.wblog.entity.User;
import cn.wblog.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 用户service实现类
 */
@Service
//@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    /**
     * 根据用户名获得用户信息
     * @param username
     * @return
     */
    @Override
    public User getUserByUsername(String username) {
        System.out.println(username);
        User userByUsername = userMapper.getUserByUsername(username);

        return userByUsername;
    }
}
