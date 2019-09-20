package com.vainglory.mapper;

import com.vainglory.pojo.worker;
import com.vainglory.pojo.workerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface workerMapper {
    long countByExample(workerExample example);

    int deleteByExample(workerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(worker record);

    int insertSelective(worker record);

    List<worker> selectByExample(workerExample example);

    worker selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") worker record, @Param("example") workerExample example);

    int updateByExample(@Param("record") worker record, @Param("example") workerExample example);

    int updateByPrimaryKeySelective(worker record);

    int updateByPrimaryKey(worker record);
}