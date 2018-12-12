package com.zdd.risk.bean;

public class UserInfo {
    private String userid;

    private String tel;

    private String nickname;

    private String avatar;

    private Integer score;

    private Integer scoreTotal;

    private String zhimaGrade;



    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScoreTotal() {
        return scoreTotal;
    }

    public void setScoreTotal(Integer scoreTotal) {
        this.scoreTotal = scoreTotal;
    }

    public String getZhimaGrade() {
        return zhimaGrade;
    }

    public void setZhimaGrade(String zhimaGrade) {
        this.zhimaGrade = zhimaGrade == null ? null : zhimaGrade.trim();
    }


}