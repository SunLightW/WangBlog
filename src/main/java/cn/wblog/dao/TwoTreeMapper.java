package cn.wblog.dao;

import cn.jasmine.collection.TwoTree;
import cn.jasmine.collection.TwoTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TwoTreeMapper {
    long countByExample(TwoTreeExample example);

    int deleteByExample(TwoTreeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TwoTree record);

    int insertSelective(TwoTree record);

    List<TwoTree> selectByExample(TwoTreeExample example);

    TwoTree selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TwoTree record, @Param("example") TwoTreeExample example);

    int updateByExample(@Param("record") TwoTree record, @Param("example") TwoTreeExample example);

    int updateByPrimaryKeySelective(TwoTree record);

    int updateByPrimaryKey(TwoTree record);
}