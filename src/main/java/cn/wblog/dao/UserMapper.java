package cn.wblog.dao;

import cn.jasmine.collection.User;
import cn.jasmine.collection.UserExample;
import java.util.List;

import cn.wblog.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

     User getUserByUsername(String username);
}