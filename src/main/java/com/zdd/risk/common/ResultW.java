package com.zdd.risk.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 孟庆合 on 2018/11/5.
 */
public class ResultW {

    private String code;

    private String message;

    private Map<String,String> data;

    public ResultW(String code, String message, Map<String, String> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public ResultW(){};

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}
