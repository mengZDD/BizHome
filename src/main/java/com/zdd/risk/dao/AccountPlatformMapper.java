package com.zdd.risk.dao;

import com.zdd.risk.bean.AccountPlatform;
import com.zdd.risk.bean.AccountPlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountPlatformMapper {
    int countByExample(AccountPlatformExample example);

    int deleteByExample(AccountPlatformExample example);

    int deleteByPrimaryKey(String userid);

    int insert(AccountPlatform record);

    int insertSelective(AccountPlatform record);

    List<AccountPlatform> selectByExample(AccountPlatformExample example);

    AccountPlatform selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") AccountPlatform record, @Param("example") AccountPlatformExample example);

    int updateByExample(@Param("record") AccountPlatform record, @Param("example") AccountPlatformExample example);

    int updateByPrimaryKeySelective(AccountPlatform record);

    int updateByPrimaryKey(AccountPlatform record);
}