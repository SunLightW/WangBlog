package cn.wblog.controller;


import cn.wblog.entity.Paper;
import cn.wblog.service.PaperSerivce;
import cn.wblog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台文章Controller
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminPaperController {


    @Resource
    private PaperSerivce paperSerivce;

    /**
     * 查询所有文章
     * @return
     */
    @RequestMapping(value = "/allpaper")
    @ResponseBody
    public List<Paper> findAllPaper(){
        return paperSerivce.findAllPaper();
    }
}
