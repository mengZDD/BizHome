package com.zdd;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zdd.risk.dao.*;
import com.zdd.risk.bean.*;
import com.zdd.risk.utils.HttpClient;
import com.zdd.risk.utils.JsonUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by 孟庆合 on 2018/11/2.
 */
@Component
public class Task {

    @Autowired
    private OrderPaymentMapper orderPaymentMapper;
    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private UserLifeMapper userLifeMapper;

    @Autowired
    AddressInfoMapper addressInfoMapper;
    @Autowired
    private AccountAlipayMapper accountAlipayMapper;

    @Value("${riskUrl}")
    private String riskUrl;

    @Scheduled(cron = "0 0 10 * * ?")
    public void addBlack() throws Exception {
//
        //往黑名单里定时添加数据

        //首先的是逾期三十天以上的，先找到预期的订单


        List<OrderPayment> orderPayments = orderPaymentMapper.selectOutPeople();
        //==============================================================================

        if (orderPayments.size() != 0 && orderPayments != null) {


            for (int i = 0; i < orderPayments.size(); i++) {

                OrderPayment orderPayment = orderPayments.get(i);

                String orderid = orderPayment.getOrderid();

                Integer integer = Integer.valueOf(orderid.substring(0, 1));

                String userid = "";
                OrderInfo aa = new OrderInfo();
                if (integer == 1) {
                    aa = orderInfoMapper.selectOrderBy1(orderid);
                }
                if (integer == 2) {
                    aa = orderInfoMapper.selectOrderBy2(orderid);
                }
                if (integer == 3) {
                    aa = orderInfoMapper.selectOrderBy3(orderid);
                }
                if (integer == 4) {
                    aa = orderInfoMapper.selectOrderBy4(orderid);
                }
                if (integer == 5) {
                    aa = orderInfoMapper.selectOrderBy5(orderid);
                }
                if (aa != null && aa instanceof OrderInfo) {
                    userid = aa.getUserid();
                    if (StringUtils.isEmpty(userid)) {
                        continue;
                    }

                } else {
                    continue;

                }


                //这下面也是一个大的问题啊

                String place = "";

                String bbb = aa.getAddress();
                if (!StringUtils.isEmpty(bbb)) {
                    Map<String, String> mpp11 = (Map<String, String>) JSONObject.parse(bbb);

                    if (mpp11.get("place") != null) {
                        place = mpp11.get("place");
                    }
                }

                if ("".equals(place)) {
                    continue;
                }

                //查询用户的生活的信息
                UserLifeWithBLOBs life = userLifeMapper.selectByPrimaryKey(userid);
                List<AccountAlipay> alipays = accountAlipayMapper.selectByKey(life.getUserid());
                //校验的是逾期的时间是不是大于30天
                String ymd = orderPayment.getYmd();
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                Date parse = s.parse(ymd);
                Date data = new Date();
                long l = (data.getTime() - parse.getTime() + 1000000) / (60 * 60 * 24 * 1000);
                if (l > 30) {
                    //这是逾期三十天的数据，获得订单的i的查询订单，在通过userId查询用户的信息让后假如到黑名单当中
                    /**
                     *
                     * 这块得用httpClient来调用我的那个接口
                     */
                    HttpClient h1 = new HttpClient(riskUrl + "count");

                    Map<String, String> map1 = new HashMap<>();
                    map1.put("idcardNo", life.getIdcardNo());
                    map1.put("tel", life.getTel());
                    map1.put("address", place);
                    h1.setParameter(map1);

                    h1.setHttps(true);

                    h1.post();

                    String content = h1.getContent();

                    Map<String, Integer> m = (Map<String, Integer>) JSONObject.parse(content);
                    int i1 = m.get("aa");

                    if (i1 < 1) {
                        Map<String, String> str = new HashMap<>();
                        HttpClient h2 = new HttpClient(riskUrl + "insert");
                        str.put("userid", life.getUserid());

                        if (alipays.size() == 0) {
                            str.put("oauthuid", "还没有数据");
                        } else {
                            str.put("oauthuid", alipays.get(0).getOauthuid());
                        }

                        str.put("tel", life.getTel());
                        str.put("name", life.getRealname());
                        str.put("idcardNo", life.getIdcardNo());
                        str.put("address", place);
                        str.put("ymdhms", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                        str.put("grade", "1");

                        h2.setParameter(str);
                        h2.setHttps(true);
                        h2.post();
                    }
                } else {
                    HttpClient h3 = new HttpClient(riskUrl + "count");

                    Map<String, String> map = new HashMap<>();
                    map.put("idcardNo", life.getIdcardNo());
                    map.put("tel", life.getTel());
                    map.put("address", place);
                    h3.setParameter(map);

                    h3.post();
                    h3.setHttps(true);
                    String content = h3.getContent();

                    Map<String, Integer> m1 = (Map<String, Integer>) JSONObject.parse(content);
                    int i1 = m1.get("aa");
                    if (i1 < 1) {
                        Map<String, String> m2 = new HashMap<>();
                        HttpClient h4 = new HttpClient(riskUrl + "insert");
                        m2.put("userid", life.getUserid());
                        if (alipays.size() == 0) {
                            m2.put("oauthuid", "还没有数据");
                        } else {
                            m2.put("oauthuid", alipays.get(0).getOauthuid());
                        }

                        m2.put("tel", life.getTel());
                        m2.put("name", life.getRealname());
                        m2.put("idcardNo", life.getIdcardNo());
                        m2.put("address", place);
                        m2.put("ymdhms", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                        m2.put("grade", "2");

                        h4.setParameter(m2);
                        h4.setHttps(true);
                        h4.post();

                    }
                }

            }

        }
        //==========================================================================================
        //内部匹配紧急联系人在我司为一级黑名单，先查询所有的紧急联系人的号码

        UserLifeExample example = new UserLifeExample();

        List<UserLifeWithBLOBs> lives = userLifeMapper.selectByExampleWithBLOBs(example);

        if (lives.size() != 0 && lives != null) {
            for (int i = 0; i < lives.size(); i++) {
                UserLifeWithBLOBs userLife = lives.get(i);
                String place = "";
                List<OrderInfo> orderInfos = orderInfoMapper.selectByUserId(userLife.getUserid());
                if (orderInfos != null && orderInfos.size() > 0) {
                    String bbb = orderInfos.get(0).getAddress();
                    if (!StringUtils.isEmpty(bbb)) {
                        Map<String, String> mpp11 = (Map<String, String>) JSONObject.parse(bbb);

                        if (mpp11.get("place") != null) {
                            place = mpp11.get("place");
                        }
                    }
                }
                if ("".equals(place)) {
                    continue;
                }


                /**
                 *
                 * 查询黑名单等级等于1，并且有个条件是紧急联系人的电话
                 */
                String jin = userLife.getLinkdata();
                if (StringUtils.isEmpty(jin)) {
                    continue;

                }
                JSONArray love = JSONObject.parseArray(jin);

                for (int k = 0; k < love.size(); k++) {

                    JSONObject jj = love.getJSONObject(k);


                    HttpClient h5 = new HttpClient(riskUrl + "select");

                    Map<String, String> map3 = new HashMap<>();
                    map3.put("linkTel", jj.getString("linktel"));
                    h5.setParameter(map3);
                    h5.setHttps(true);
                    h5.post();
                    String content = h5.getContent();
                    List<BlacklistInfo> blacklistInfos2 = JSONObject.parseArray(content, BlacklistInfo.class);

                    if (blacklistInfos2.size() != 0 && blacklistInfos2 != null) {

                        HttpClient h6 = new HttpClient(riskUrl + "count");

                        Map<String, String> m4 = new HashMap<>();
                        m4.put("idcardNo", userLife.getIdcardNo());
                        m4.put("tel", userLife.getTel());
                        m4.put("address", place);
                        h6.setParameter(m4);
                        h6.setHttps(true);
                        h6.post();

                        String content1 = h6.getContent();

                        Map<String, Integer> m41 = (Map<String, Integer>) JSONObject.parse(content1);
                        int i1 = m41.get("aa");

                        if (i1 < 1) {
                            List<AccountAlipay> alipays = accountAlipayMapper.selectByKey(userLife.getUserid());

                            Map<String, String> m5 = new HashMap<>();
                            HttpClient h7 = new HttpClient(riskUrl + "insert");
                            m5.put("userid", userLife.getUserid());

                            if (alipays.size() == 0) {
                                m5.put("oauthuid", "还没有数据");
                            } else {
                                m5.put("oauthuid", alipays.get(0).getOauthuid());
                            }
                            m5.put("tel", userLife.getTel());
                            m5.put("name", userLife.getRealname());
                            m5.put("idcardNo", userLife.getIdcardNo());
                            m5.put("address", place);
                            m5.put("ymdhms", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                            m5.put("grade", "2");

                            h7.setParameter(m5);

                            h7.setHttps(true);

                            h7.post();
                        }
                    }
                }
            }
        }

        //===========================================================================================

        //内部匹配紧急联系人在我司状态为逾期,那就是去2级黑名单里面去查一下看看紧急联系人的手机号在没在这里

        UserLifeExample user = new UserLifeExample();

        user.createCriteria();

        List<UserLifeWithBLOBs> userLives = userLifeMapper.selectByExampleWithBLOBs(user);


        if (userLives.size() != 0 && userLives != null) {

            for (int i = 0; i < userLives.size(); i++) {
                UserLifeWithBLOBs info = userLives.get(i);
                //去黑名单里面去查询这个紧急联系人的手机号是不是在里面
                String jin = info.getLinkdata();

                if (StringUtils.isEmpty(jin)) {

                    continue;
                }
                JSONArray love = JSONObject.parseArray(jin);
                for (int k = 0; k < love.size(); k++) {
                    JSONObject jj = love.getJSONObject(k);
                    HttpClient h8 = new HttpClient(riskUrl + "cha");
                    Map<String, String> m6 = new HashMap<>();
                    m6.put("linkTel", jj.getString("linktel"));
                    h8.setParameter(m6);
                    h8.setHttps(true);
                    h8.post();
                    String content = h8.getContent();
                    List<BlacklistInfo> bInfo = JSONObject.parseArray(content, BlacklistInfo.class);
                    //根据用用户订单查询的还款的请款是for有逾期还款的
                    if (bInfo.size() != 0 && bInfo != null) {
                        //证明此联系人有逾期的情况,把这个用户的信息添加到黑名单当中去
                        String place = "";
                        List<OrderInfo> orderInfos = orderInfoMapper.selectByUserId(info.getUserid());
                        if (orderInfos != null && orderInfos.size() > 0) {
                            String bbb = orderInfos.get(0).getAddress();
                            if (!StringUtils.isEmpty(bbb)) {
                                Map<String, String> mpp11 = (Map<String, String>) JSONObject.parse(bbb);

                                if (mpp11.get("place") != null) {
                                    place = mpp11.get("place");
                                }
                            }
                        }
                        if ("".equals(place)) {
                            continue;
                        }
                        HttpClient h9 = new HttpClient(riskUrl + "count");
                        Map<String, String> m7 = new HashMap<>();
                        m7.put("idcardNo", info.getIdcardNo());
                        m7.put("tel", info.getTel());
                        m7.put("address", place);
                        h9.setParameter(m7);
                        h9.setHttps(true);
                        h9.post();

                        String content2 = h9.getContent();

                        Map<String, Integer> m8 = (Map<String, Integer>) JSONObject.parse(content2);
                        int i1 = m8.get("aa");

                        if (i1 < 1) {
                            List<AccountAlipay> alipays = accountAlipayMapper.selectByKey(info.getUserid());
                            Map<String, String> m9 = new HashMap<>();
                            HttpClient h10 = new HttpClient(riskUrl + "insert");
                            m9.put("userid", info.getUserid());

                            if (alipays.size() == 0) {
                                m9.put("oauthuid", "还没有数据");
                            } else {
                                m9.put("oauthuid", alipays.get(0).getOauthuid());
                            }
                            m9.put("tel", info.getTel());
                            m9.put("name", info.getRealname());
                            m9.put("idcardNo", info.getIdcardNo());
                            m9.put("address", place);
                            m9.put("ymdhms", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                            m9.put("grade", "2");

                            h10.setParameter(m9);

                            h10.setHttps(true);

                            h10.post();
                        }
                    }
                }
            }
        }
        //===================================================================
        //内部匹配收获地址与黑名单上的一直


        List<OrderInfo> orderInfos = orderInfoMapper.selectAll();


        if (orderInfos.size() != 0 && orderInfos != null) {

            for (int s = 0; s < orderInfos.size(); s++) {

                OrderInfo w = orderInfos.get(s);

                String place = "";
                String ddd = w.getAddress();
                if (!StringUtils.isEmpty(ddd)) {

                    Map<String, String> mpp11 = (Map<String, String>) JSONObject.parse(ddd);

                    if (mpp11.get("place") != null) {
                        place = mpp11.get("place");

                    }
                }
                if ("".equals(place)) {
                    continue;
                }
                HttpClient h11 = new HttpClient(riskUrl + "address1");

                Map<String, String> map10 = new HashMap<>();
                map10.put("place", place);
                h11.setParameter(map10);
                h11.setHttps(true);
                h11.post();
                String content = h11.getContent();
                List<BlacklistInfo> list1 = JSONObject.parseArray(content, BlacklistInfo.class);
                if (list1.size() != 0 && list1 != null) {
                    //收获的地址与黑名单的地址是一样的，查询用户的信息然后添加到黑名单当中
                    UserLifeWithBLOBs blobs = userLifeMapper.selectByPrimaryKey(w.getUserid());


                    if (blobs != null) {
                        HttpClient h12 = new HttpClient(riskUrl + "count");

                        Map<String, String> map11 = new HashMap<>();
                        map11.put("idcardNo", blobs.getIdcardNo());
                        map11.put("tel", blobs.getTel());
                        map11.put("address", place);
                        h12.setParameter(map11);
                        h12.setHttps(true);
                        h12.post();

                        String content3 = h12.getContent();

                        Map<String, Integer> m12 = (Map<String, Integer>) JSONObject.parse(content3);
                        int i1 = m12.get("aa");


                        if (i1 < 1) {
                            List<AccountAlipay> alipays = accountAlipayMapper.selectByKey(blobs.getUserid());
                            Map<String, String> m13 = new HashMap<>();
                            HttpClient h13 = new HttpClient(riskUrl + "insert");
                            m13.put("userid", blobs.getUserid());

                            if (alipays.size() == 0) {
                                m13.put("oauthuid", "还没有数据");
                            } else {
                                m13.put("oauthuid", alipays.get(0).getOauthuid());
                            }
                            m13.put("tel", blobs.getTel());
                            m13.put("name", blobs.getRealname());
                            m13.put("idcardNo", blobs.getIdcardNo());
                            m13.put("address", place);
                            m13.put("ymdhms", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                            m13.put("grade", "2");

                            h13.setParameter(m13);

                            h13.setHttps(true);

                            h13.post();
                        }
                    }
                }
            }
        }
    }
}

