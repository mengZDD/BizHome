package com.zdd.risk.common;

import com.alibaba.fastjson.JSONObject;
import com.zdd.risk.utils.HttpClient;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 孟庆合 on 2018/11/19.
 */
public class Button {

    public static String selectState(String i)  {
        Map<String,String> map=new HashMap<>();
        HttpClient h=new HttpClient("http://localhost:8082/button");
        map.put("i",i);
        h.setHttps(true);
        h.setParameter(map);
        String content="";
        try {
            h.post();
           content= h.getContent();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String,String> aaa= (Map<String, String>) JSONObject.parse(content);
        return aaa.get("button");
    }
}
