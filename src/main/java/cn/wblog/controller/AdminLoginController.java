package cn.wblog.controller;

import cn.wblog.entity.User;
import cn.wblog.service.UserService;
import cn.wblog.utils.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminLoginController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = MD5Util.MD5Encode(request.getParameter("password"),"utf-8",true);
        User user = userService.getUserByUsername("admin");

        return null;
    }

}
