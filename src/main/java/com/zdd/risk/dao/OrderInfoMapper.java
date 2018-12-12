package com.zdd.risk.dao;


import java.util.List;

import com.zdd.risk.bean.OrderInfo;
import com.zdd.risk.bean.OrderInfoExample;
import com.zdd.risk.bean.OrderInfoWithBLOBs;
import com.zdd.risk.bean.OrderPayment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderInfoMapper {
    int countByExample(OrderInfoExample example);

    int deleteByExample(OrderInfoExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(OrderInfoWithBLOBs record);

    int insertSelective(OrderInfoWithBLOBs record);

    List<OrderInfoWithBLOBs> selectByExampleWithBLOBs(OrderInfoExample example);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfoWithBLOBs selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") OrderInfoWithBLOBs record, @Param("example") OrderInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderInfoWithBLOBs record, @Param("example") OrderInfoExample example);

    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByPrimaryKeySelective(OrderInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrderInfoWithBLOBs record);

    int updateByPrimaryKey(OrderInfo record);

    @Select(value = "select * from order_info_1 where orderid=#{orderid} and status=4")
    OrderInfo selectOrderBy1(String orderid);
    @Select(value = "select * from order_info_2 where orderid=#{orderid} and status=4")
    OrderInfo selectOrderBy2(String orderid);
    @Select(value = "select * from order_info_3 where orderid=#{orderid} and status=4")
    OrderInfo selectOrderBy3(String orderid);
    @Select(value = "select * from order_info_4 where orderid=#{orderid} and status=4")
    OrderInfo selectOrderBy4(String orderid);
    @Select(value = "select * from order_info_5 where orderid=#{orderid} and status=4")
    OrderInfo selectOrderBy5(String orderid);
    @Select(value = "select * from order_info_1 where orderid=#{orderid} ")
    OrderInfo selectOrderBy11(String orderid);
    @Select(value = "select * from order_info_2 where orderid=#{orderid} ")
    OrderInfo selectOrderBy22(String orderid);
    @Select(value = "select * from order_info_3 where orderid=#{orderid} ")
    OrderInfo selectOrderBy33(String orderid);
    @Select(value = "select * from order_info_4 where orderid=#{orderid} ")
    OrderInfo selectOrderBy44(String orderid);
    @Select(value = "select * from order_info_5 where orderid=#{orderid}")
    OrderInfo selectOrderBy55(String orderid);

    List<OrderInfo> selectByUserId(String userid);

    List<OrderInfo> selectAll();

    List<OrderInfo> selectByUserid4(String userid);
}
