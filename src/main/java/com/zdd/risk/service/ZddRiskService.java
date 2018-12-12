package com.zdd.risk.service;

import com.zdd.risk.bean.OrderInfo;
import com.zdd.risk.common.Result;
import com.zdd.risk.common.ResultW;

/**
 * Created by 孟庆合 on 2018/11/1.
 */

public interface ZddRiskService {

    ResultW getRisk(String userid,String orderid);



}
