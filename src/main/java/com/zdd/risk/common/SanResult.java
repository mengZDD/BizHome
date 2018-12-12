package com.zdd.risk.common;

/**
 * Created by 孟庆合 on 2018/12/10.
 */
public class SanResult {

    private String approveCredit;

    private String approveResult;

    private String userId;

    public SanResult(String approveCredit, String approveResult, String userId) {
        this.approveCredit = approveCredit;
        this.approveResult = approveResult;
        this.userId = userId;
    }
public  SanResult(){};
    public String getApproveCredit() {
        return approveCredit;
    }

    public void setApproveCredit(String approveCredit) {
        this.approveCredit = approveCredit;
    }

    public String getApproveResult() {
        return approveResult;
    }

    public void setApproveResult(String approveResult) {
        this.approveResult = approveResult;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
