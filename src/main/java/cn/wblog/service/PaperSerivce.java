package cn.wblog.service;


import cn.wblog.entity.Paper;

import java.util.List;

/**
 * 文章service interface
 */
public interface PaperSerivce {

    List<Paper> findAllPaper();

}
