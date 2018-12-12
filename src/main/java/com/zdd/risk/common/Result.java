package com.zdd.risk.common;

/**
 * Created by 孟庆合 on 2018/11/14.
 */
public class Result {

    private String message;

    private String  zhi;

    public String getZhi() {
        return zhi;
    }

    public void setZhi(String zhi) {
        this.zhi = zhi;
    }

    public  Result(){};

    public Result(String message, String zhi) {
        this.message = message;
        this.zhi = zhi;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
