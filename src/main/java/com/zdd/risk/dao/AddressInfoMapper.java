package com.zdd.risk.dao;


import java.util.List;

import com.zdd.risk.bean.AddressInfo;
import com.zdd.risk.bean.AddressInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AddressInfoMapper {
    int countByExample(AddressInfoExample example);

    int deleteByExample(AddressInfoExample example);

    int deleteByPrimaryKey(Integer addressid);

    int insert(AddressInfo record);

    int insertSelective(AddressInfo record);

    List<AddressInfo> selectByExample(AddressInfoExample example);

    AddressInfo selectByPrimaryKey(Integer addressid);

    int updateByExampleSelective(@Param("record") AddressInfo record, @Param("example") AddressInfoExample example);

    int updateByExample(@Param("record") AddressInfo record, @Param("example") AddressInfoExample example);

    int updateByPrimaryKeySelective(AddressInfo record);

    int updateByPrimaryKey(AddressInfo record);

    @Select(value = "select * from address_info where userid=#{userid}")
    AddressInfo selectByUserId(@Param("userid") String userId);

    @Select(value = "select * from address_info where tel=#{tel}")
    List<AddressInfo> selectByTel(@Param("tel") String tel);

    @Select(value = "select * from address_info where place=#{place}")
    List<AddressInfo> selectByAddress(@Param("place") String place);
}