package com.zdd.risk.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zdd.risk.bean.*;
import com.zdd.risk.common.*;
import com.zdd.risk.dao.*;
import com.zdd.risk.service.IMyService;
import com.zdd.risk.utils.AgeUtil;
import com.zdd.risk.utils.HttpClient;
import com.zdd.risk.utils.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 孟庆合 on 2018/11/26.
 */
@Service
public class MyServiceImpl implements IMyService {

    private static final Logger log = LoggerFactory.getLogger(MyServiceImpl.class);
    @Autowired
    private UserLifeMapper userLifeMapper;
    @Autowired
    private AddressInfoMapper addressInfoMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Autowired
    private AccountPlatformMapper accountPlatformMapper;
    @Autowired
    private IOrderCostDAO iOrderCostDAO;
    @Autowired
    private IProductPriceDAO iProductPriceDAO;

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Value("${modelUrl}")
    private String modelUrl;

    @Value("${premodelUrl}")
    private String premodelUrl;

    @Value("${backUrl}")
    private String backUrl;

    @Value("${riskUrl}")
    private String riskUrl;

    private static final String[] snowflake = {"套现", "贷款", "信用卡", "代办", "中介", "口子", "借钱"};

    private static final String[] familys = {"爸", "父", "妈", "母", "爹", "爷爷", "奶奶", "外公", "外婆", "姥姥", "姥爷", "老公", "老婆", "媳妇", "爱人", "丈夫", "舅", "叔", "婶", "姑", "表姐", "表弟", "表妹", "表哥", "堂哥", "堂姐", "堂妹", "堂弟", "儿子", "女儿", "姨", "伯"};

    @Override
    public String pre(String userid) {
        UserLifeWithBLOBs userLifeWithBLOBs = userLifeMapper.selectByPrimaryKey(userid);
        double age1 = 0.0;
        GetAge2 gg = new GetAge2();
        try {
            age1 = gg.getAgeByCardId1(userLifeWithBLOBs.getIdcardNo());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> map666 = new HashMap<>();
        map666.put("idcardNo", userLifeWithBLOBs.getIdcardNo());
        String post1 = HttpUtils.post(riskUrl + "wang", JSON.toJSONString(map666));
        JSONObject jsonObject1 = JSONObject.parseObject(post1);
        if (jsonObject1 == null || "".equals(jsonObject1)) {
            log.info("在网时长没有验证");
            return JSON.toJSONString(new SanResult("0", "E", userid));
        }
        JSONObject certificationresult = jsonObject1.getJSONObject("certificationresult");
        String post2 = HttpUtils.post(riskUrl + "san", JSON.toJSONString(map666));
        JSONObject jsonObject2 = JSONObject.parseObject(post2);

        if (jsonObject2 == null || "".equals(jsonObject2)) {
            log.info("三要素没有验证");
            return JSON.toJSONString(new SanResult("0", "E", userid));
        }
        JSONObject certificationresult2 = jsonObject2.getJSONObject("certificationresult");
        Map<String, Object> map520 = new HashMap<>();
        map520.put("zmscore", userLifeWithBLOBs.getZhimaGrade());
        map520.put("idcard_no", userLifeWithBLOBs.getIdcardNo());
        map520.put("realname", userLifeWithBLOBs.getRealname());
        map520.put("tel", userLifeWithBLOBs.getTel());
        map520.put("zaiwang", certificationresult.getString("duration"));
        map520.put("san", certificationresult2.getString("success"));
        map520.put("age", age1);
        String post = HttpUtils.post(premodelUrl, JSONObject.toJSONString(map520));
        log.info("模型返回的结果是" + post);
        JSONObject jsonObject = JSONObject.parseObject(post);

        if (jsonObject.getString("code").equals("100001")) {

            return JSON.toJSONString(new SanResult("0", "E", userid));
        }
        JSONObject data = jsonObject.getJSONObject("data");
        String level = data.getString("level");
        String approveCredit = "";
        Map sb = new HashMap();
        if (level.equals("A")) {
            approveCredit = data.getString("approveCredit");
            sb.put("approveCredit", Double.valueOf(approveCredit).intValue());
        } else {
            sb.put("approveCredit", 0);
        }
        sb.put("approveResult", level);
        sb.put("userId", userid);
        log.info("返回成功的结果事" + JSON.toJSONString(sb));
        return JSON.toJSONString(sb);
    }
    @Override
    public void ser(String userid, String orderid) {
        UserLifeWithBLOBs userLifeWithBLOBs = userLifeMapper.selectByPrimaryKey(userid);
        Integer integer = Integer.valueOf(orderid.substring(0, 1));
        OrderInfo aa = new OrderInfo();
        if (integer == 1) {
            aa = orderInfoMapper.selectOrderBy11(orderid);
        }
        if (integer == 2) {
            aa = orderInfoMapper.selectOrderBy22(orderid);
        }
        if (integer == 3) {
            aa = orderInfoMapper.selectOrderBy33(orderid);
        }
        if (integer == 4) {
            aa = orderInfoMapper.selectOrderBy44(orderid);
        }
        if (integer == 5) {
            aa = orderInfoMapper.selectOrderBy55(orderid);
        }
        log.info("订单的信息是" + JSON.toJSONString(aa));
        OrderCost orderCost = iOrderCostDAO.selectByOrderid(orderid);

        log.info("订单价格详情是" + JSON.toJSONString(orderCost));

        ProductInfoWithBLOBs productInfoWithBLOBs = productInfoMapper.selectByPrimaryKey(aa.getProductid());

        log.info("商品详情的信息" + JSON.toJSONString(productInfoWithBLOBs));
        ProductPrice productPrice = null;
        int a = productInfoWithBLOBs.getType();
        if (a == 1) {
            productPrice = iProductPriceDAO.selectByProductIdAndPriceid1(aa.getProductid(), aa.getPriceid());
        }
        if (a == 2) {
            productPrice = iProductPriceDAO.selectByProductIdAndPriceid2(aa.getProductid(), aa.getPriceid());
        }
        if (a == 3) {
            productPrice = iProductPriceDAO.selectByProductIdAndPriceid3(aa.getProductid(), aa.getPriceid());
        }
        if (a == 4) {
            productPrice = iProductPriceDAO.selectByProductIdAndPriceid4(aa.getProductid(), aa.getPriceid());
        }
        log.info("传入的商品价格表的参数是" + JSON.toJSONString(productPrice));
        Integer pick = aa.getPicktype();
        //===========================================================
        String idcardNo = userLifeWithBLOBs.getIdcardNo();

        AccountPlatform ssf = accountPlatformMapper.selectByPrimaryKey(userid);

        String tel = userLifeWithBLOBs.getTel();

        String addressList = userLifeWithBLOBs.getAddressList();

        String lnkTel = userLifeWithBLOBs.getLinkdata();
        JSONArray love = new JSONArray();
        if (!StringUtils.isEmpty(lnkTel)) {

            love = JSONObject.parseArray(lnkTel);
        }
        String address222 = aa.getAddress();
        /**
         *
         * 查身份证条件是身份证号
         */
        HttpClient h = new HttpClient(riskUrl + "idcardNo");
        Map<String, String> map = new HashMap<>();
        map.put("idcardNo", idcardNo);
        h.setParameter(map);
        h.setHttps(true);
        String content = "";
        try {
            h.post();
            content = h.getContent();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<BlacklistInfo> blacklistInfos = JSONObject.parseArray(content, BlacklistInfo.class);
        if (blacklistInfos.size() != 0 && blacklistInfos != null) {
            Map<String, String> map1 = new HashMap<>();
            map1.put("level", "F");
            map1.put("recommend", "高风险的用户建议拒绝");
            MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功", map1));
            log.info("身份证号在黑名单中");
            return;
        }
        //============================================================
        /**
         *
         * 用户年龄大于45周岁或者小于18周岁的然后拒绝
         */
        AgeUtil ageUtil = new AgeUtil();
        int age = 0;
        try {
            age = ageUtil.getAgeByCardId(idcardNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (age > 45 || age < 18) {
            Map<String, String> pp = new HashMap<>();
            pp.put("code", "E");
            pp.put("recommend", "高风险用户建议拒绝,年龄不符合");
            MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功", pp));
            log.info("年龄不符合要求");
            return;
        }
        //=======================================================
        /**
         *
         * 查询的是手机号在黑名单的表里
         */
        HttpClient h2 = new HttpClient(riskUrl + "tel");
        Map<String, String> map4 = new HashMap<>();
        map4.put("tel", tel);
        h2.setParameter(map4);
        h2.setHttps(true);
        String content2 = "";
        try {
            h2.post();
            content2 = h2.getContent();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<BlacklistInfo> blacklistInfos2 = JSONObject.parseArray(content2, BlacklistInfo.class);
        if (blacklistInfos2.size() != 0 && blacklistInfos2 != null) {
            Map<String, String> map5 = new HashMap<>();
            map5.put("level", "F");
            map5.put("recommend", "高风险的用户建拒绝");
            MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", map5));
            log.info("手机号在黑名单中");
            return;
        }
        //==================================================================
        /**
         *
         * 查的条件是用户的收货的地址
         */
        if (pick == 1) {
            if (!StringUtils.isEmpty(address222)) {
                log.info("和收货信息相关的参数是"+address222);
                Map<String, String> tt = (Map<String, String>) JSONObject.parse(address222);
                String place22 = tt.get("place");
                HttpClient h1 = new HttpClient(riskUrl + "address");
                Map<String, String> map2 = new HashMap<>();
                map2.put("place", place22);
                h1.setParameter(map2);
                h1.setHttps(true);
                String content1 = "";
                try {
                    h1.post();
                    content1 = h1.getContent();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                List<BlacklistInfo> blacklistInfos1 = JSONObject.parseArray(content1, BlacklistInfo.class);
                if (blacklistInfos1.size() != 0 && blacklistInfos1 != null) {
                    Map<String, String> map3 = new HashMap<>();
                    map3.put("level", "F");
                    map3.put("recmmend", "高风险的用户建议拒绝");
                    MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", map3));
                    log.info("收货地址在黑名单中");
                    return;
                }
                //===================================================
                //收货手机号关联的身份证的数量不唯一，首先查收货的手机号对应的id,全表扫描判断数量是不是大于一
                /**
                 *
                 * 首先查出来的是收货的手机号
                 */
                String tel11 = tt.get("tel");
                List<OrderInfo> list22 = orderInfoMapper.selectAll();
                List<String> can = new ArrayList<>();
                for (int i = 0; i < list22.size(); i++) {
                    OrderInfo orderInfott = list22.get(i);
                    String wode = orderInfott.getAddress();
                    if (StringUtils.isEmpty(wode)) {
                        continue;
                    }
                    Map<String, String> ooo = (Map<String, String>) JSONObject.parse(wode);
                    if (ooo.get("tel").equals(tel11)) {
                        can.add(orderInfott.getUserid());
                    }
                }
                log.info("这个集合里面的参数是" + can);
                int i1 = userLifeMapper.selectByList(can);
                if (i1 > 1) {
                    Map<String, String> map9 = new HashMap<>();
                    map9.put("level", "D");
                    map9.put("recommend", "高风险的用户,建议人工审核");
                    MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", map9));
                    log.info("收货的手机号关联的身份证数量不唯一");
                    return;
                }
                //=========================================================================
                /**
                 *
                 * 收货的手机号与本单的紧急联系人的手机号一致
                 */
                if (love.size() != 0) {
                    for (int x = 0; x < love.size(); x++) {
                        JSONObject jsonObject = love.getJSONObject(x);
                        if (tel11.equals(jsonObject.getString("linktel"))) {
                            Map<String, String> map60 = new HashMap<>();
                            map60.put("level", "D");
                            map60.put("recommend", "高风险的用户建议人工审核，收货手机号和本单的紧急联系人一致");
                            MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", map60));
                            log.info("收货的手机号与本单的紧急联系人的手机号一致");
                            return;
                        }
                    }
                }
                //================================================================================
                String s = Button.selectState("1");
                if (s.equals("启用")) {
                    //注册手机号与收获手机号不一致
                    if (!tel11.equals(ssf.getUsername())) {
                        Map<String, String> map6 = new HashMap<>();
                        map6.put("level", "D");
                        map6.put("recommend", "高风险的用户建议人工审核，注册手机号与收货手机号不一样");
                        MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", map6));
                        log.info("注册手机号与收获手机号不一致");
                        return;
                    }
                }
//=====================================================================================
                //收货地址关联的身份证的号码不唯一
                List<String> can1 = new ArrayList<>();
                for (int i = 0; i < list22.size(); i++) {
                    OrderInfo orderInfo99 = list22.get(i);
                    String wo = orderInfo99.getAddress();
                    if (StringUtils.isEmpty(wo)) {
                        continue;
                    }
                    Map<String, String> ooo1 = (Map<String, String>) JSONObject.parse(wo);
                    if (ooo1.get("place").equals(place22)) {
                        can1.add(orderInfo99.getUserid());
                    }
                }
                log.info("这个是第二个的参数然后是这个样子的" + can1);
                int i11 = userLifeMapper.selectByList(can1);
                if (i11 > 1) {
                    Map<String, String> map10 = new HashMap<>();
                    map10.put("level", "D");
                    map10.put("recommend", "高风险的用户,建议人工审核，收货地址关联的身份证的数量不唯一");
                    MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", map10));
                    log.info("收货地址关联的身份证的号码不唯一");
                    return;
                }
            }
            log.info("紧急联系人的相关信息"+love.toJSONString());
            String s5 = Button.selectState("6");
            if (s5.equals("启用")) {
                if (love.size() != 0) {
                    for (int x = 0; x < love.size(); x++) {
                        JSONObject jsonObject = love.getJSONObject(x);
                        //紧急联系人关联的身份证的数量不唯一
                        int anInt = userLifeMapper.getInt("%" + jsonObject.getString("linktel") + "%");
                        if (anInt > 1) {
                            Map<String, String> map7 = new HashMap<>();
                            map7.put("level", "D");
                            map7.put("recommend", "高风险的用户建议人工审核，紧急联系人关联的身份证的数量不唯一");
                            MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", map7));
                            log.info("紧急联系人关联的身份证的数量不唯一");
                            return;
                        }
                    }
                }
            }
        }
        if (pick == 3) {
            if (!StringUtils.isEmpty(address222)) {
                Map<String, String> tt = (Map<String, String>) JSONObject.parse(address222);
                String place22 = tt.get("place");
                HttpClient h1 = new HttpClient(riskUrl + "address");
                Map<String, String> map2 = new HashMap<>();
                map2.put("place", place22);
                h1.setParameter(map2);
                h1.setHttps(true);
                String content1 = "";
                try {
                    h1.post();
                    content1 = h1.getContent();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                List<BlacklistInfo> blacklistInfos1 = JSONObject.parseArray(content1, BlacklistInfo.class);
                if (blacklistInfos1.size() != 0 && blacklistInfos1 != null) {
                    Map<String, String> map3 = new HashMap<>();
                    map3.put("level", "F");
                    map3.put("recmmend", "高风险的用户建议拒绝");
                    MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", map3));
                    return;
                }
            }
        }
        //==============================================以下是通讯录中的一系列的校验
        /**
         *
         * 通讯录中联系人数查询的是通讯录中联系人的数量是多少
         */
        if (!StringUtils.isEmpty(addressList)) {
            int count = 0;
            int min = 0;
            int qin = 0;
            List<Map<String, String>> phoneList = (List<Map<String, String>>) JSONObject.parse(addressList);
            String s1 = Button.selectState("2");
            if (s1.equals("启用")) {
                if (phoneList.size() < 20) {
                    Map<String, String> pp1 = new HashMap<>();
                    pp1.put("code", "E");
                    pp1.put("recommend", "高风险用户建议拒绝，通讯录中联系人较少");
                    MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功", pp1));
                    log.info("通讯录中联系人较少");
                    return;
                }
            }
            /**
             *
             * 紧急联系人在通讯录中
             */
            String s2 = Button.selectState("3");
            if (s2.equals("启用")) {
                if (love.size() != 0) {
                    for (int f = 0; f < love.size(); f++) {
                        JSONObject jsonObject = love.getJSONObject(f);
                        for (int i = 0; i < phoneList.size(); i++) {
                            Map<String, String> stringMap = phoneList.get(i);
                            String tong = stringMap.get("tel");
                            if (tong.equals(jsonObject.getString("linktel"))) {
                                count++;
                            }
                        }
                        log.info("count的数量是" + count);
                        if (count == 0) {
                            Map<String, String> qw = new HashMap<>();
                            qw.put("code", "E");
                            qw.put("recommend", "高风险用户建议拒绝，紧急联系人没有在通讯录中");
                            MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", qw));
                            log.info("紧急联系人没有在通讯录中");
                            return;
                        }
                        count = 0;
                    }
                }
            }
            /**
             *
             * 敏感的联系人,通讯录中敏感联系人的数量大于三的话就拒绝
             */
            String s3 = Button.selectState("4");
            if (s3.equals("启用")) {
                for (int i = 0; i < snowflake.length; i++) {
                    for (int j = 0; j < phoneList.size(); j++) {
                        Map<String, String> stringMap = phoneList.get(j);
                        String tong = stringMap.get("name");
                        if (!StringUtils.isEmpty(tong)) {
                            if (tong.indexOf(snowflake[i]) != -1) {
                                min++;
                            }
                        }
                    }
                }
                if (min > 3) {
                    Map<String, String> qw = new HashMap<>();
                    qw.put("code", "E");
                    qw.put("recommend", "高风险用户建议拒绝，敏感联系人过多");
                    MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", qw));
                    log.info("敏感联系人过多");
                    return;
                }
            }
            /**
             *
             * 通讯录中亲属的联系人小于1的直接拒绝
             */
            String s4 = Button.selectState("5");
            if (s4.equals("启用")) {
                for (int s = 0; s < familys.length; s++) {
                    for (int q = 0; q < phoneList.size(); q++) {
                        Map<String, String> stringMap = phoneList.get(q);
                        String tong = stringMap.get("name");
                        if (!StringUtils.isEmpty(tong)) {
                            if (tong.indexOf(familys[s]) != -1) {
                                qin++;
                            }
                        }
                    }
                }
                if (qin < 1) {
                    Map<String, String> qw = new HashMap<>();
                    qw.put("code", "E");
                    qw.put("recommend", "高风险用户建议拒绝，通讯录中亲属联系人没有");
                    MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", qw));
                    log.info("通讯录中亲属联系人没有");
                    return;
                }
            }
        }
//=====================================================================================
        //芝麻分数小于600的直接就拒绝了,根据用户的id查询用户的详情表
        Map<String, String> map666 = new HashMap<>();
        map666.put("idcardNo", idcardNo);
        String userInfo = userLifeWithBLOBs.getZhimaGrade();
        if (!StringUtils.isEmpty(userInfo)) {
            if ("Z5".equals(userInfo)) {
                Map<String, String> map99 = new HashMap<>();
                map99.put("level", "E");
                map99.put("recommend", "高风险的用户建议拒绝，芝麻分小于600");
                MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", map99));
                log.info("芝麻分小于600");
                return;
            }
        } else {
            String post123 = HttpUtils.post(riskUrl + "fen", JSON.toJSONString(map666));
            JSONObject jsonObject1 = JSONObject.parseObject(post123);
            if (jsonObject1 != null && !"".equals(jsonObject1)) {
                String sd = jsonObject1.getJSONObject("wealth_info").getJSONObject("totalssets").getString("taobao_zmscore");
                int anInt = Integer.parseInt(sd);
                if (!StringUtils.isEmpty(sd)) {
                    if (anInt < 600) {
                        Map<String, String> map99 = new HashMap<>();
                        map99.put("level", "E");
                        map99.put("recommend", "高风险的用户建议拒绝，芝麻分小于600");
                        MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", map99));
                        log.info("芝麻分小于600");
                        return;
                    }
                }
            }
        }
//=======================================================================
        if (aa.getSource() != 2 && aa.getSource() != 3) {
            if (aa.getGuarantee() != 5) {
                double age1 = 0.0;
                GetAge2 gg = new GetAge2();
                try {
                    age1 = gg.getAgeByCardId1(idcardNo);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String post1 = HttpUtils.post(riskUrl + "wang", JSON.toJSONString(map666));
                JSONObject jsonObject1 = JSONObject.parseObject(post1);
                log.info("在网的时长数据是" + jsonObject1.toJSONString());
                JSONObject certificationresult = jsonObject1.getJSONObject("certificationresult");
                String post2 = HttpUtils.post(riskUrl + "san", JSON.toJSONString(map666));
                JSONObject jsonObject2 = JSONObject.parseObject(post2);
                log.info("三要素的结果是" + jsonObject2.toJSONString());
                JSONObject certificationresult2 = jsonObject2.getJSONObject("certificationresult");
                Map<String, Object> map520 = new HashMap<>();
                map520.put("market", productPrice.getMarket() / 100);
                map520.put("ymdhms0", aa.getYmdhms0());
                map520.put("total_deposit", orderCost.getTotal_deposit() / 100);
                map520.put("credit_cost", orderCost.getCredit_cost() / 100);
                map520.put("zm_jianmian", orderCost.getCredit_cost() / 100);
                map520.put("zmscore", userLifeWithBLOBs.getZhimaGrade());
                map520.put("orderid", orderid);
                map520.put("idcard_no", idcardNo);
                map520.put("realname", userLifeWithBLOBs.getRealname());
                map520.put("tel", tel);
                map520.put("zaiwang", certificationresult.getString("duration"));
                map520.put("san", certificationresult2.getString("success"));
                map520.put("age", age1);
                String post = HttpUtils.post(modelUrl, JSONObject.toJSONString(map520));
                JSONObject jsonObject555 = JSONObject.parseObject(post);
                jsonObject555.put("userid", userid);
                jsonObject555.put("orderid", orderid);
                log.info("返回成功的结果事" + jsonObject555.toJSONString());
                Map dnf = new HashMap<>();
                dnf.put("result", jsonObject555);
                String post22 = HttpUtils.doPostHttp1(backUrl, dnf);
                log.info(post22);
                return;
            }
        }
        Map<String, String> map521 = new HashMap<>();
        map521.put("level", "A");
        map521.put("recommend", "低风险用户");
        MyResult.CallBack(userid, orderid, new ResultW("100000", "查询成功了", map521));
    }
}
