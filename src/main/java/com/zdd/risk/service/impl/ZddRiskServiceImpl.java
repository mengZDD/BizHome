package com.zdd.risk.service.impl;

import com.zdd.risk.common.ResultW;
import com.zdd.risk.dao.*;
import com.zdd.risk.exception.BusinessException;
import com.zdd.risk.bean.*;
import com.zdd.risk.service.IMyService;
import com.zdd.risk.service.ZddRiskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 孟庆合 on 2018/11/1.
 */
@Component
@Transactional(rollbackFor = BusinessException.class)
public class ZddRiskServiceImpl implements ZddRiskService {

    private static final Logger log = LoggerFactory.getLogger(ZddRiskServiceImpl.class);
    @Autowired
    private UserLifeMapper userLifeMapper;
    @Autowired
    private IMyService iMyService;

    @Override
    public ResultW getRisk(String userid, String orderid) {


        /*long l = System.currentTimeMillis();*/
        //传过来的是生成订单号的用户的id，根据id查询用户的生活表
        if (orderid.equals("") || userid.equals("")) {

            return new ResultW("100001", "参数传的不全", null);
        }
        UserLifeWithBLOBs userLifeWithBLOBs = userLifeMapper.selectByPrimaryKey(userid);

        if (userLifeWithBLOBs == null || userLifeWithBLOBs.equals("")) {

            return new ResultW("100001", "传入的参数不是已经下单的用户的Id,参数错误", null);
        }

        ExecutorService executorService = Executors.newFixedThreadPool(20);

        executorService.execute(new Runnable() {
            @Override
            public void run() {


                iMyService.ser(userid, orderid);


            }
        });
        return new ResultW("100000", "参数接受成功", null);
    }
}
