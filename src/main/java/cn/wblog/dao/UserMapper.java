package cn.wblog.dao;


import cn.wblog.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户dao接口
 */
@Repository
public interface UserMapper {

     /**
      * 根据用户名查找用户
      *
      * @param username
      * @return
      */
     String getUserByUsername(String username);

     /**
      * 查询所有用户
      * @return
      */
     List<User> findAllUser();

     void insertUser(User user);
}
