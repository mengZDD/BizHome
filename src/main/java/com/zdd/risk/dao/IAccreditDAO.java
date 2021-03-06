package com.zdd.risk.dao;

import com.zdd.risk.bean.Accredit;
import com.zdd.risk.bean.AccreditExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAccreditDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_accredit
     *
     * @mbg.generated Tue Nov 06 15:02:16 CST 2018
     */
    long countByExample(AccreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_accredit
     *
     * @mbg.generated Tue Nov 06 15:02:16 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_accredit
     *
     * @mbg.generated Tue Nov 06 15:02:16 CST 2018
     */
    int insert(Accredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_accredit
     *
     * @mbg.generated Tue Nov 06 15:02:16 CST 2018
     */
    int insertSelective(Accredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_accredit
     *
     * @mbg.generated Tue Nov 06 15:02:16 CST 2018
     */
    List<Accredit> selectByExample(AccreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_accredit
     *
     * @mbg.generated Tue Nov 06 15:02:16 CST 2018
     */
    Accredit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_accredit
     *
     * @mbg.generated Tue Nov 06 15:02:16 CST 2018
     */
    int updateByExampleSelective(@Param("record") Accredit record, @Param("example") AccreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_accredit
     *
     * @mbg.generated Tue Nov 06 15:02:16 CST 2018
     */
    int updateByExample(@Param("record") Accredit record, @Param("example") AccreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_accredit
     *
     * @mbg.generated Tue Nov 06 15:02:16 CST 2018
     */
    int updateByPrimaryKeySelective(Accredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_accredit
     *
     * @mbg.generated Tue Nov 06 15:02:16 CST 2018
     */
    int updateByPrimaryKey(Accredit record);
}