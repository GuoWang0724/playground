package com.ymj.mapper;

import com.ymj.domain.PgUser;
import com.ymj.domain.PgUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgUserMapper {
    int countByExample(PgUserExample example);

    int deleteByExample(PgUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PgUser record);

    int insertSelective(PgUser record);

    List<PgUser> selectByExample(PgUserExample example);

    PgUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PgUser record, @Param("example") PgUserExample example);

    int updateByExample(@Param("record") PgUser record, @Param("example") PgUserExample example);

    int updateByPrimaryKeySelective(PgUser record);

    int updateByPrimaryKey(PgUser record);
}