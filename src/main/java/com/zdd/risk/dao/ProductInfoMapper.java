package com.zdd.risk.dao;

import com.zdd.risk.bean.ProductInfo;
import com.zdd.risk.bean.ProductInfoExample;
import com.zdd.risk.bean.ProductInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInfoMapper {
    int countByExample(ProductInfoExample example);

    int deleteByExample(ProductInfoExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(ProductInfoWithBLOBs record);

    int insertSelective(ProductInfoWithBLOBs record);

    List<ProductInfoWithBLOBs> selectByExampleWithBLOBs(ProductInfoExample example);

    List<ProductInfo> selectByExample(ProductInfoExample example);

    ProductInfoWithBLOBs selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") ProductInfoWithBLOBs record, @Param("example") ProductInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductInfoWithBLOBs record, @Param("example") ProductInfoExample example);

    int updateByExample(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    int updateByPrimaryKeySelective(ProductInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductInfoWithBLOBs record);

    int updateByPrimaryKey(ProductInfo record);
}