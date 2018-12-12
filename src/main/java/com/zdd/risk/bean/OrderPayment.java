package com.zdd.risk.bean;

public class OrderPayment {
    private Integer seqid;

    private String orderid;

    private Byte periods;

    private Byte periodNum;

    private Integer cost;

    private Byte repayment;

    private String zmOrderid;

    private String transactionid;

    private Integer status;

    private String ymd;

    private String nextYmd;

    private String instalmentTime;

    private String ymdhms;

    private String remark;

    public Integer getSeqid() {
        return seqid;
    }

    public void setSeqid(Integer seqid) {
        this.seqid = seqid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Byte getPeriods() {
        return periods;
    }

    public void setPeriods(Byte periods) {
        this.periods = periods;
    }

    public Byte getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Byte periodNum) {
        this.periodNum = periodNum;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Byte getRepayment() {
        return repayment;
    }

    public void setRepayment(Byte repayment) {
        this.repayment = repayment;
    }

    public String getZmOrderid() {
        return zmOrderid;
    }

    public void setZmOrderid(String zmOrderid) {
        this.zmOrderid = zmOrderid == null ? null : zmOrderid.trim();
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid == null ? null : transactionid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getYmd() {
        return ymd;
    }

    public void setYmd(String ymd) {
        this.ymd = ymd == null ? null : ymd.trim();
    }

    public String getNextYmd() {
        return nextYmd;
    }

    public void setNextYmd(String nextYmd) {
        this.nextYmd = nextYmd == null ? null : nextYmd.trim();
    }

    public String getInstalmentTime() {
        return instalmentTime;
    }

    public void setInstalmentTime(String instalmentTime) {
        this.instalmentTime = instalmentTime == null ? null : instalmentTime.trim();
    }

    public String getYmdhms() {
        return ymdhms;
    }

    public void setYmdhms(String ymdhms) {
        this.ymdhms = ymdhms == null ? null : ymdhms.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}