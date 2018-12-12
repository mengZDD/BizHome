package com.zdd.risk.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zdd.risk.bean.OrderInfo;

import com.zdd.risk.common.Result;
import com.zdd.risk.common.ResultW;
import com.zdd.risk.service.IMyService;
import com.zdd.risk.service.ZddRiskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by 孟庆合 on 2018/11/1.
 */
@RestController
@RequestMapping("/risk")
public class ZddRiskRule {

    private static final Logger log = LoggerFactory.getLogger(ZddRiskRule.class);

    @Autowired
    private ZddRiskService zddRiskService;

    @Autowired
    private IMyService iMyService;
    @RequestMapping(value = "",method= RequestMethod.POST)
    public ResultW getRisk(@RequestBody String parm){
        log.info("风控贷中反欺诈传入的参数是"+parm);
        JSONObject object = JSONObject.parseObject(parm);
        String userid = object.getString("userid");
        String orderid = object.getString("orderid");
        ResultW risk = zddRiskService.getRisk(userid,orderid);
       return risk;
    }
    @RequestMapping(value = "/pre",method = RequestMethod.POST)
    public String pre(@RequestBody String parm){

        log.info("贷前传入的参数是:"+parm);
        String pre = iMyService.pre(parm);
        log.info("返回的结果的是:"+pre);
        return pre;

    }
}
