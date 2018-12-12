package com.zdd.risk.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by 孟庆合 on 2018/11/26.
 */
public interface IMyService {
    String pre(String userid);

    void ser(String userid, String orderid);
}
