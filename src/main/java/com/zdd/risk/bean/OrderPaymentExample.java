package com.zdd.risk.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderPaymentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSeqidIsNull() {
            addCriterion("seqid is null");
            return (Criteria) this;
        }

        public Criteria andSeqidIsNotNull() {
            addCriterion("seqid is not null");
            return (Criteria) this;
        }

        public Criteria andSeqidEqualTo(Integer value) {
            addCriterion("seqid =", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotEqualTo(Integer value) {
            addCriterion("seqid <>", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThan(Integer value) {
            addCriterion("seqid >", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seqid >=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThan(Integer value) {
            addCriterion("seqid <", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThanOrEqualTo(Integer value) {
            addCriterion("seqid <=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidIn(List<Integer> values) {
            addCriterion("seqid in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotIn(List<Integer> values) {
            addCriterion("seqid not in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidBetween(Integer value1, Integer value2) {
            addCriterion("seqid between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotBetween(Integer value1, Integer value2) {
            addCriterion("seqid not between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andPeriodsIsNull() {
            addCriterion("periods is null");
            return (Criteria) this;
        }

        public Criteria andPeriodsIsNotNull() {
            addCriterion("periods is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodsEqualTo(Byte value) {
            addCriterion("periods =", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotEqualTo(Byte value) {
            addCriterion("periods <>", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsGreaterThan(Byte value) {
            addCriterion("periods >", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsGreaterThanOrEqualTo(Byte value) {
            addCriterion("periods >=", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsLessThan(Byte value) {
            addCriterion("periods <", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsLessThanOrEqualTo(Byte value) {
            addCriterion("periods <=", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsIn(List<Byte> values) {
            addCriterion("periods in", values, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotIn(List<Byte> values) {
            addCriterion("periods not in", values, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsBetween(Byte value1, Byte value2) {
            addCriterion("periods between", value1, value2, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotBetween(Byte value1, Byte value2) {
            addCriterion("periods not between", value1, value2, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodNumIsNull() {
            addCriterion("period_num is null");
            return (Criteria) this;
        }

        public Criteria andPeriodNumIsNotNull() {
            addCriterion("period_num is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodNumEqualTo(Byte value) {
            addCriterion("period_num =", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumNotEqualTo(Byte value) {
            addCriterion("period_num <>", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumGreaterThan(Byte value) {
            addCriterion("period_num >", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("period_num >=", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumLessThan(Byte value) {
            addCriterion("period_num <", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumLessThanOrEqualTo(Byte value) {
            addCriterion("period_num <=", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumIn(List<Byte> values) {
            addCriterion("period_num in", values, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumNotIn(List<Byte> values) {
            addCriterion("period_num not in", values, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumBetween(Byte value1, Byte value2) {
            addCriterion("period_num between", value1, value2, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumNotBetween(Byte value1, Byte value2) {
            addCriterion("period_num not between", value1, value2, "periodNum");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Integer value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Integer value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Integer value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Integer value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Integer value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Integer> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Integer> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Integer value1, Integer value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Integer value1, Integer value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andRepaymentIsNull() {
            addCriterion("repayment is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentIsNotNull() {
            addCriterion("repayment is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentEqualTo(Byte value) {
            addCriterion("repayment =", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotEqualTo(Byte value) {
            addCriterion("repayment <>", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentGreaterThan(Byte value) {
            addCriterion("repayment >", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentGreaterThanOrEqualTo(Byte value) {
            addCriterion("repayment >=", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentLessThan(Byte value) {
            addCriterion("repayment <", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentLessThanOrEqualTo(Byte value) {
            addCriterion("repayment <=", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentIn(List<Byte> values) {
            addCriterion("repayment in", values, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotIn(List<Byte> values) {
            addCriterion("repayment not in", values, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentBetween(Byte value1, Byte value2) {
            addCriterion("repayment between", value1, value2, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotBetween(Byte value1, Byte value2) {
            addCriterion("repayment not between", value1, value2, "repayment");
            return (Criteria) this;
        }

        public Criteria andZmOrderidIsNull() {
            addCriterion("zm_orderid is null");
            return (Criteria) this;
        }

        public Criteria andZmOrderidIsNotNull() {
            addCriterion("zm_orderid is not null");
            return (Criteria) this;
        }

        public Criteria andZmOrderidEqualTo(String value) {
            addCriterion("zm_orderid =", value, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andZmOrderidNotEqualTo(String value) {
            addCriterion("zm_orderid <>", value, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andZmOrderidGreaterThan(String value) {
            addCriterion("zm_orderid >", value, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andZmOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("zm_orderid >=", value, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andZmOrderidLessThan(String value) {
            addCriterion("zm_orderid <", value, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andZmOrderidLessThanOrEqualTo(String value) {
            addCriterion("zm_orderid <=", value, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andZmOrderidLike(String value) {
            addCriterion("zm_orderid like", value, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andZmOrderidNotLike(String value) {
            addCriterion("zm_orderid not like", value, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andZmOrderidIn(List<String> values) {
            addCriterion("zm_orderid in", values, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andZmOrderidNotIn(List<String> values) {
            addCriterion("zm_orderid not in", values, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andZmOrderidBetween(String value1, String value2) {
            addCriterion("zm_orderid between", value1, value2, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andZmOrderidNotBetween(String value1, String value2) {
            addCriterion("zm_orderid not between", value1, value2, "zmOrderid");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNull() {
            addCriterion("transactionid is null");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNotNull() {
            addCriterion("transactionid is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionidEqualTo(String value) {
            addCriterion("transactionid =", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotEqualTo(String value) {
            addCriterion("transactionid <>", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThan(String value) {
            addCriterion("transactionid >", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThanOrEqualTo(String value) {
            addCriterion("transactionid >=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThan(String value) {
            addCriterion("transactionid <", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThanOrEqualTo(String value) {
            addCriterion("transactionid <=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLike(String value) {
            addCriterion("transactionid like", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotLike(String value) {
            addCriterion("transactionid not like", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidIn(List<String> values) {
            addCriterion("transactionid in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotIn(List<String> values) {
            addCriterion("transactionid not in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidBetween(String value1, String value2) {
            addCriterion("transactionid between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotBetween(String value1, String value2) {
            addCriterion("transactionid not between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andYmdIsNull() {
            addCriterion("ymd is null");
            return (Criteria) this;
        }

        public Criteria andYmdIsNotNull() {
            addCriterion("ymd is not null");
            return (Criteria) this;
        }

        public Criteria andYmdEqualTo(String value) {
            addCriterion("ymd =", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdNotEqualTo(String value) {
            addCriterion("ymd <>", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdGreaterThan(String value) {
            addCriterion("ymd >", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdGreaterThanOrEqualTo(String value) {
            addCriterion("ymd >=", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdLessThan(String value) {
            addCriterion("ymd <", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdLessThanOrEqualTo(String value) {
            addCriterion("ymd <=", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdLike(String value) {
            addCriterion("ymd like", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdNotLike(String value) {
            addCriterion("ymd not like", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdIn(List<String> values) {
            addCriterion("ymd in", values, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdNotIn(List<String> values) {
            addCriterion("ymd not in", values, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdBetween(String value1, String value2) {
            addCriterion("ymd between", value1, value2, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdNotBetween(String value1, String value2) {
            addCriterion("ymd not between", value1, value2, "ymd");
            return (Criteria) this;
        }

        public Criteria andNextYmdIsNull() {
            addCriterion("next_ymd is null");
            return (Criteria) this;
        }

        public Criteria andNextYmdIsNotNull() {
            addCriterion("next_ymd is not null");
            return (Criteria) this;
        }

        public Criteria andNextYmdEqualTo(String value) {
            addCriterion("next_ymd =", value, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andNextYmdNotEqualTo(String value) {
            addCriterion("next_ymd <>", value, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andNextYmdGreaterThan(String value) {
            addCriterion("next_ymd >", value, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andNextYmdGreaterThanOrEqualTo(String value) {
            addCriterion("next_ymd >=", value, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andNextYmdLessThan(String value) {
            addCriterion("next_ymd <", value, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andNextYmdLessThanOrEqualTo(String value) {
            addCriterion("next_ymd <=", value, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andNextYmdLike(String value) {
            addCriterion("next_ymd like", value, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andNextYmdNotLike(String value) {
            addCriterion("next_ymd not like", value, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andNextYmdIn(List<String> values) {
            addCriterion("next_ymd in", values, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andNextYmdNotIn(List<String> values) {
            addCriterion("next_ymd not in", values, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andNextYmdBetween(String value1, String value2) {
            addCriterion("next_ymd between", value1, value2, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andNextYmdNotBetween(String value1, String value2) {
            addCriterion("next_ymd not between", value1, value2, "nextYmd");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeIsNull() {
            addCriterion("instalment_time is null");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeIsNotNull() {
            addCriterion("instalment_time is not null");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeEqualTo(String value) {
            addCriterion("instalment_time =", value, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeNotEqualTo(String value) {
            addCriterion("instalment_time <>", value, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeGreaterThan(String value) {
            addCriterion("instalment_time >", value, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("instalment_time >=", value, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeLessThan(String value) {
            addCriterion("instalment_time <", value, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeLessThanOrEqualTo(String value) {
            addCriterion("instalment_time <=", value, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeLike(String value) {
            addCriterion("instalment_time like", value, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeNotLike(String value) {
            addCriterion("instalment_time not like", value, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeIn(List<String> values) {
            addCriterion("instalment_time in", values, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeNotIn(List<String> values) {
            addCriterion("instalment_time not in", values, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeBetween(String value1, String value2) {
            addCriterion("instalment_time between", value1, value2, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andInstalmentTimeNotBetween(String value1, String value2) {
            addCriterion("instalment_time not between", value1, value2, "instalmentTime");
            return (Criteria) this;
        }

        public Criteria andYmdhmsIsNull() {
            addCriterion("ymdhms is null");
            return (Criteria) this;
        }

        public Criteria andYmdhmsIsNotNull() {
            addCriterion("ymdhms is not null");
            return (Criteria) this;
        }

        public Criteria andYmdhmsEqualTo(String value) {
            addCriterion("ymdhms =", value, "ymdhms");
            return (Criteria) this;
        }

        public Criteria andYmdhmsNotEqualTo(String value) {
            addCriterion("ymdhms <>", value, "ymdhms");
            return (Criteria) this;
        }

        public Criteria andYmdhmsGreaterThan(String value) {
            addCriterion("ymdhms >", value, "ymdhms");
            return (Criteria) this;
        }

        public Criteria andYmdhmsGreaterThanOrEqualTo(String value) {
            addCriterion("ymdhms >=", value, "ymdhms");
            return (Criteria) this;
        }

        public Criteria andYmdhmsLessThan(String value) {
            addCriterion("ymdhms <", value, "ymdhms");
            return (Criteria) this;
        }

        public Criteria andYmdhmsLessThanOrEqualTo(String value) {
            addCriterion("ymdhms <=", value, "ymdhms");
            return (Criteria) this;
        }

        public Criteria andYmdhmsLike(String value) {
            addCriterion("ymdhms like", value, "ymdhms");
            return (Criteria) this;
        }

        public Criteria andYmdhmsNotLike(String value) {
            addCriterion("ymdhms not like", value, "ymdhms");
            return (Criteria) this;
        }

        public Criteria andYmdhmsIn(List<String> values) {
            addCriterion("ymdhms in", values, "ymdhms");
            return (Criteria) this;
        }

        public Criteria andYmdhmsNotIn(List<String> values) {
            addCriterion("ymdhms not in", values, "ymdhms");
            return (Criteria) this;
        }

        public Criteria andYmdhmsBetween(String value1, String value2) {
            addCriterion("ymdhms between", value1, value2, "ymdhms");
            return (Criteria) this;
        }

        public Criteria andYmdhmsNotBetween(String value1, String value2) {
            addCriterion("ymdhms not between", value1, value2, "ymdhms");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}