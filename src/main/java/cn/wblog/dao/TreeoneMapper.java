package cn.wblog.dao;

import cn.wblog.entity.Treeone;
import cn.wblog.entity.TreeoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TreeoneMapper {
    long countByExample(TreeoneExample example);

    int deleteByExample(TreeoneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Treeone record);

    int insertSelective(Treeone record);

    List<Treeone> selectByExample(TreeoneExample example);

    Treeone selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Treeone record, @Param("example") TreeoneExample example);

    int updateByExample(@Param("record") Treeone record, @Param("example") TreeoneExample example);

    int updateByPrimaryKeySelective(Treeone record);

    int updateByPrimaryKey(Treeone record);
}