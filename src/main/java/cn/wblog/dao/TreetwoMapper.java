package cn.wblog.dao;

import cn.wblog.entity.Treetwo;
import cn.wblog.entity.TreetwoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TreetwoMapper {
    long countByExample(TreetwoExample example);

    int deleteByExample(TreetwoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Treetwo record);

    int insertSelective(Treetwo record);

    List<Treetwo> selectByExample(TreetwoExample example);

    Treetwo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Treetwo record, @Param("example") TreetwoExample example);

    int updateByExample(@Param("record") Treetwo record, @Param("example") TreetwoExample example);

    int updateByPrimaryKeySelective(Treetwo record);

    int updateByPrimaryKey(Treetwo record);
}