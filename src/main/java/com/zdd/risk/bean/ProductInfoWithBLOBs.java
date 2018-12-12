package com.zdd.risk.bean;

public class ProductInfoWithBLOBs extends ProductInfo {
    private String banners;

    private String profiles;

    public String getBanners() {
        return banners;
    }

    public void setBanners(String banners) {
        this.banners = banners == null ? null : banners.trim();
    }

    public String getProfiles() {
        return profiles;
    }

    public void setProfiles(String profiles) {
        this.profiles = profiles == null ? null : profiles.trim();
    }
}