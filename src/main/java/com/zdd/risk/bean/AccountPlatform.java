package com.zdd.risk.bean;

public class AccountPlatform {
    private String userid;

    private String userid1;

    private String userid2;

    private String username;

    private String password;

    private String oauthuid1;

    private String oauthuid2;

    private Byte type;

    private Integer workid;

    private String channel;

    private String comeFrom;

    private Byte status;

    private String ymd;

    private String regtime;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUserid1() {
        return userid1;
    }

    public void setUserid1(String userid1) {
        this.userid1 = userid1 == null ? null : userid1.trim();
    }

    public String getUserid2() {
        return userid2;
    }

    public void setUserid2(String userid2) {
        this.userid2 = userid2 == null ? null : userid2.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getOauthuid1() {
        return oauthuid1;
    }

    public void setOauthuid1(String oauthuid1) {
        this.oauthuid1 = oauthuid1 == null ? null : oauthuid1.trim();
    }

    public String getOauthuid2() {
        return oauthuid2;
    }

    public void setOauthuid2(String oauthuid2) {
        this.oauthuid2 = oauthuid2 == null ? null : oauthuid2.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom == null ? null : comeFrom.trim();
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

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime == null ? null : regtime.trim();
    }
}