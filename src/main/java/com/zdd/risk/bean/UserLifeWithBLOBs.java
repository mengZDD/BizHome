package com.zdd.risk.bean;

public class UserLifeWithBLOBs extends UserLife {
    private String linkdata;

    private String addressList;

    private String remark;

    private String riskResult;

    public String getLinkdata() {
        return linkdata;
    }

    public void setLinkdata(String linkdata) {
        this.linkdata = linkdata == null ? null : linkdata.trim();
    }

    public String getAddressList() {
        return addressList;
    }

    public void setAddressList(String addressList) {
        this.addressList = addressList == null ? null : addressList.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRiskResult() {
        return riskResult;
    }

    public void setRiskResult(String riskResult) {
        this.riskResult = riskResult == null ? null : riskResult.trim();
    }
}