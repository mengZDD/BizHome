package com.zdd.risk.bean;

import java.util.List;

public class AccountAlipay {
    private String oauthuid;

    private String userid;

    private String userid2;

    private String regtime;

    private String authToken;

    private Byte status;

    private String ymd;

    private String userinfo;

    public String getOauthuid() {
        return oauthuid;
    }

    public void setOauthuid(String oauthuid) {
        this.oauthuid = oauthuid == null ? null : oauthuid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUserid2() {
        return userid2;
    }

    public void setUserid2(String userid2) {
        this.userid2 = userid2 == null ? null : userid2.trim();
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime == null ? null : regtime.trim();
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken == null ? null : authToken.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getYmd() {
        return ymd;
    }

    public void setYmd(String ymd) {
        this.ymd = ymd == null ? null : ymd.trim();
    }

    public String getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(String userinfo) {
        this.userinfo = userinfo == null ? null : userinfo.trim();
    }

}