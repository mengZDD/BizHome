package com.zdd.risk.dao;

import com.zdd.risk.bean.AccountAlipay;
import com.zdd.risk.bean.AccountAlipayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

public interface AccountAlipayMapper {
    int countByExample(AccountAlipayExample example);

    int deleteByExample(AccountAlipayExample example);

    int insert(AccountAlipay record);

    int insertSelective(AccountAlipay record);

    List<AccountAlipay> selectByExampleWithBLOBs(AccountAlipayExample example);

    List<AccountAlipay> selectByExample(AccountAlipayExample example);

    int updateByExampleSelective(@Param("record") AccountAlipay record, @Param("example") AccountAlipayExample example);

    int updateByExampleWithBLOBs(@Param("record") AccountAlipay record, @Param("example") AccountAlipayExample example);

    int updateByExample(@Param("record") AccountAlipay record, @Param("example") AccountAlipayExample example);
    @Select(value = "select * from account_alipay where userid=#{userid}")
    List<AccountAlipay> selectByKey(@PathVariable("userid") String userid);
}