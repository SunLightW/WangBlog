package cn.wblog.service.impl;

import cn.wblog.dao.UserMapper;
import cn.wblog.entity.User;
import cn.wblog.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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
    public String getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> findAllUser() {
        return  userMapper.findAllUser();
    }

    /**
     * 插入用户
     * @param user
     */
    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
