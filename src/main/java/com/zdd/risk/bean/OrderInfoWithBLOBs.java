package com.zdd.risk.bean;

public class OrderInfoWithBLOBs extends OrderInfo {
    private String address;

    private String preauthInfo;

    private String priceInfo;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPreauthInfo() {
        return preauthInfo;
    }

    public void setPreauthInfo(String preauthInfo) {
        this.preauthInfo = preauthInfo == null ? null : preauthInfo.trim();
    }

    public String getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(String priceInfo) {
        this.priceInfo = priceInfo == null ? null : priceInfo.trim();
    }
}