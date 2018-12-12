package com.zdd.risk.bean;

public class ProductInfo {
    private Integer productid;

    private Byte type;

    private String brand;

    private String model;

    private String name;

    private String cover;

    private String coverWeb;

    private String brief;

    private Integer market;

    private Integer monthCost;

    private Byte fineness;

    private Integer sales;

    private Integer priceid;

    private Integer insuranceid;

    private Byte insuranceType;

    private Long orderno;

    private Byte status;

    private String ymdhms0;

    private String ymdhms1;

    private String ymdhms2;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getCoverWeb() {
        return coverWeb;
    }

    public void setCoverWeb(String coverWeb) {
        this.coverWeb = coverWeb == null ? null : coverWeb.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public Integer getMarket() {
        return market;
    }

    public void setMarket(Integer market) {
        this.market = market;
    }

    public Integer getMonthCost() {
        return monthCost;
    }

    public void setMonthCost(Integer monthCost) {
        this.monthCost = monthCost;
    }

    public Byte getFineness() {
        return fineness;
    }

    public void setFineness(Byte fineness) {
        this.fineness = fineness;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getPriceid() {
        return priceid;
    }

    public void setPriceid(Integer priceid) {
        this.priceid = priceid;
    }

    public Integer getInsuranceid() {
        return insuranceid;
    }

    public void setInsuranceid(Integer insuranceid) {
        this.insuranceid = insuranceid;
    }

    public Byte getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(Byte insuranceType) {
        this.insuranceType = insuranceType;
    }

    public Long getOrderno() {
        return orderno;
    }

    public void setOrderno(Long orderno) {
        this.orderno = orderno;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getYmdhms0() {
        return ymdhms0;
    }

    public void setYmdhms0(String ymdhms0) {
        this.ymdhms0 = ymdhms0 == null ? null : ymdhms0.trim();
    }

    public String getYmdhms1() {
        return ymdhms1;
    }

    public void setYmdhms1(String ymdhms1) {
        this.ymdhms1 = ymdhms1 == null ? null : ymdhms1.trim();
    }

    public String getYmdhms2() {
        return ymdhms2;
    }

    public void setYmdhms2(String ymdhms2) {
        this.ymdhms2 = ymdhms2 == null ? null : ymdhms2.trim();
    }
}