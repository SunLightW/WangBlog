package cn.wblog.service.impl;

import cn.wblog.dao.PaperMapper;
import cn.wblog.entity.Paper;
import cn.wblog.service.PaperSerivce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 文章Service实现类
 */
@Service
public class PaperServiceImpl implements PaperSerivce {

    @Resource
    private PaperMapper paperMapper;

    @Override
    public List<Paper> findAllPaper() {
        return paperMapper.findAllPaper();
    }
}
