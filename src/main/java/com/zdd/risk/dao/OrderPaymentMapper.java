package com.zdd.risk.dao;


import java.util.List;

import com.zdd.risk.bean.OrderPayment;
import com.zdd.risk.bean.OrderPaymentExample;
import org.apache.ibatis.annotations.Param;

public interface OrderPaymentMapper {
    int countByExample(OrderPaymentExample example);

    int deleteByExample(OrderPaymentExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(OrderPayment record);

    int insertSelective(OrderPayment record);

    List<OrderPayment> selectByExampleWithBLOBs(OrderPaymentExample example);

    List<OrderPayment> selectByExample(OrderPaymentExample example);

    OrderPayment selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") OrderPayment record, @Param("example") OrderPaymentExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderPayment record, @Param("example") OrderPaymentExample example);

    int updateByExample(@Param("record") OrderPayment record, @Param("example") OrderPaymentExample example);

    int updateByPrimaryKeySelective(OrderPayment record);

    int updateByPrimaryKeyWithBLOBs(OrderPayment record);

    int updateByPrimaryKey(OrderPayment record);

    List<OrderPayment> selectOutPeople();

    List<OrderPayment> selectByOrderId(String orderid);
}