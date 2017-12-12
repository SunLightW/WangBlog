package cn.wblog.dao;


import cn.wblog.entity.Paper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 博客文章dao接口
 */
@Repository
public interface PaperMapper {


    List<Paper> findAllPaper();
}