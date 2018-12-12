package com.zdd.risk.common;

import com.alibaba.fastjson.JSONObject;
import com.zdd.risk.utils.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by 孟庆合 on 2018/11/26.
 */
public class MyResult {
    private static  final Logger log = LoggerFactory.getLogger(MyResult.class);

    public static void CallBack(String userid,String orderid,ResultW resultW){
        Object o = JSONObject.toJSON(resultW);
        JSONObject jsonObject = JSONObject.parseObject(o.toString());
        jsonObject.put("userid",userid);
        jsonObject.put("orderid",orderid);
        Map ii=new HashMap<>();
        ii.put("result",jsonObject);
        log.info("MyResult的入参是："+JSONObject.toJSONString(ii));
        String s1 = HttpUtils.doPostHttp1("http://app.test.17zdd.cn/credit/risk_notice", ii);
        log.info("回调返回回来的数据是:"+s1);
    }
}
