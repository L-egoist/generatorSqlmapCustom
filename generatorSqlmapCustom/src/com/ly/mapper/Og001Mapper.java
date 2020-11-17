package com.ly.mapper;

import com.ly.model.Og001;
import com.ly.model.Og001Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Og001Mapper {
    int countByExample(Og001Example example);

    int deleteByExample(Og001Example example);

    int insert(Og001 record);

    int insertSelective(Og001 record);

    List<Og001> selectByExample(Og001Example example);

    int updateByExampleSelective(@Param("record") Og001 record, @Param("example") Og001Example example);

    int updateByExample(@Param("record") Og001 record, @Param("example") Og001Example example);
}