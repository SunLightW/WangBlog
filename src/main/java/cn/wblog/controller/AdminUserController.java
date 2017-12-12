package cn.wblog.controller;

import cn.wblog.entity.User;
import cn.wblog.service.UserService;
import cn.wblog.utils.DateUtil;
import cn.wblog.utils.MD5Util;
import cn.wblog.utils.TbIPUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户Controller
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminUserController {

    @Resource
    private UserService userService;

    /**
     * 登录
     * @param request
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(HttpServletRequest request){
        String result= null;
        String username = request.getParameter("username");
        String password = userService.getUserByUsername(username);
        String user_password = MD5Util.MD5Encode(request.getParameter("password").toString(),"utf-8",true);
        if (user_password == password){

        }
        return result;
    }

    /**
     * 查询所有用户信息
     * @return
     */
    @RequestMapping(value = "/alluser")
    @ResponseBody
    public List<User> findAllUser(){
        return userService.findAllUser();
    }


    /**
     * 插入新用户
     * @param request
     * @throws Exception
     */
    @RequestMapping(value = "/insertuser")
    public void insertUser(HttpServletRequest request) throws Exception {
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setRealname(request.getParameter("realname"));
        user.setState(request.getParameter("state"));
        user.setEmail(request.getParameter("email"));
        user.setTel(request.getParameter("tel"));
        user.setCreattime(DateUtil.formatDate_datetime(DateUtil.getNowDate()));
        user.setIsexist("1");
        user.setLastip(request.getRemoteAddr());
        user.setIplocation(TbIPUtil.getAddress(request.getRemoteAddr().toString(),"utf-8"));
        userService.insertUser(user);
    }
}
