package com.zdd.risk.dao;

import com.zdd.risk.bean.UserLife;
import com.zdd.risk.bean.UserLifeExample;
import com.zdd.risk.bean.UserLifeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserLifeMapper {
    int countByExample(UserLifeExample example);

    int deleteByExample(UserLifeExample example);

    int deleteByPrimaryKey(String userid);

    int insert(UserLifeWithBLOBs record);

    int insertSelective(UserLifeWithBLOBs record);

    List<UserLifeWithBLOBs> selectByExampleWithBLOBs(UserLifeExample example);

    List<UserLife> selectByExample(UserLifeExample example);

    UserLifeWithBLOBs selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") UserLifeWithBLOBs record, @Param("example") UserLifeExample example);

    int updateByExampleWithBLOBs(@Param("record") UserLifeWithBLOBs record, @Param("example") UserLifeExample example);

    int updateByExample(@Param("record") UserLife record, @Param("example") UserLifeExample example);

    int updateByPrimaryKeySelective(UserLifeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserLifeWithBLOBs record);

    int updateByPrimaryKey(UserLife record);

    int selectByList(List<String> can1);

    @Select(value = "select count(distinct idcard_no) from user_life where linkdata like #{linktel} ")
    int getInt(@Param("linktel") String linktel);

    @Select(value = "select * from user_life")
    List<UserLife> selectAll();
}