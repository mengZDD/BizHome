package com.zdd;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zdd.risk.bean.BlacklistInfo;
import com.zdd.risk.bean.OrderInfo;
import com.zdd.risk.bean.OrderPayment;
import com.zdd.risk.dao.OrderInfoMapper;
import com.zdd.risk.dao.OrderPaymentMapper;
import com.zdd.risk.utils.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 孟庆合 on 2018/11/19.
 */
@Component
public class Task1 {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private OrderPaymentMapper orderPaymentMapper;

    @Value("${riskUrl}")
    private String riskUrl;

    private static final Logger log = LoggerFactory.getLogger(Task1.class);

    @Scheduled(cron = "0 0 10 * * ?")
    public void white() {

        HttpClient sb = new HttpClient(riskUrl+"select2");

        sb.setHttps(true);

        String content = "";

        try {
            sb.get();

            content = sb.getContent();
        } catch (Exception e) {

            e.printStackTrace();
        }

        List<BlacklistInfo> list = JSONObject.parseArray(content, BlacklistInfo.class);

        log.info("查询出来的所有的二级的黑名单是:" + JSON.toJSONString(list));

        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            BlacklistInfo aa = list.get(i);
            List<OrderInfo> qn = orderInfoMapper.selectByUserid4(aa.getUserid());//status=4的用户来查询
            if (qn.size() == 0) {

                continue;
            }
            for (int j = 0; j < qn.size(); j++) {

                OrderInfo orderInfo = qn.get(j);

                List<OrderPayment> list2 = orderPaymentMapper.selectByOrderId(orderInfo.getOrderid());
                if (list2.size() != 0) {
                    a = a + 1;
                }

            }
            if (a == 0) {
                //证明已经还款了，然后就根据用户的id去删除一波
                HttpClient h2 = new HttpClient(riskUrl+"white");
                Map<String, String> map4 = new HashMap<>();
                map4.put("userId", aa.getUserid());
                h2.setParameter(map4);
                h2.setHttps(true);
                try {
                    h2.post();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            a = 0;
        }
    }
}
