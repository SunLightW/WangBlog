package cn.wblog.controller;

import cn.wblog.entity.User;
import cn.wblog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/admin")
public class AdminLoginController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public Object login(HttpServletRequest req){
        String username = req.getParameter("username");
        System.out.println(username);
        User password = userService.getUserByUsername(username);
        System.out.println(password.getPassword());
        return password;
    }

}
