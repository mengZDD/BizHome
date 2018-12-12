package com.zdd.risk.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andPriceidIsNull() {
            addCriterion("priceid is null");
            return (Criteria) this;
        }

        public Criteria andPriceidIsNotNull() {
            addCriterion("priceid is not null");
            return (Criteria) this;
        }

        public Criteria andPriceidEqualTo(Integer value) {
            addCriterion("priceid =", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotEqualTo(Integer value) {
            addCriterion("priceid <>", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidGreaterThan(Integer value) {
            addCriterion("priceid >", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("priceid >=", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidLessThan(Integer value) {
            addCriterion("priceid <", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidLessThanOrEqualTo(Integer value) {
            addCriterion("priceid <=", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidIn(List<Integer> values) {
            addCriterion("priceid in", values, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotIn(List<Integer> values) {
            addCriterion("priceid not in", values, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidBetween(Integer value1, Integer value2) {
            addCriterion("priceid between", value1, value2, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotBetween(Integer value1, Integer value2) {
            addCriterion("priceid not between", value1, value2, "priceid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIsNull() {
            addCriterion("guarantee is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIsNotNull() {
            addCriterion("guarantee is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeEqualTo(Byte value) {
            addCriterion("guarantee =", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotEqualTo(Byte value) {
            addCriterion("guarantee <>", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThan(Byte value) {
            addCriterion("guarantee >", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThanOrEqualTo(Byte value) {
            addCriterion("guarantee >=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThan(Byte value) {
            addCriterion("guarantee <", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThanOrEqualTo(Byte value) {
            addCriterion("guarantee <=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIn(List<Byte> values) {
            addCriterion("guarantee in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotIn(List<Byte> values) {
            addCriterion("guarantee not in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeBetween(Byte value1, Byte value2) {
            addCriterion("guarantee between", value1, value2, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotBetween(Byte value1, Byte value2) {
            addCriterion("guarantee not between", value1, value2, "guarantee");
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

        public Criteria andPicktypeIsNull() {
            addCriterion("picktype is null");
            return (Criteria) this;
        }

        public Criteria andPicktypeIsNotNull() {
            addCriterion("picktype is not null");
            return (Criteria) this;
        }

        public Criteria andPicktypeEqualTo(Integer value) {
            addCriterion("picktype =", value, "picktype");
            return (Criteria) this;
        }

        public Criteria andPicktypeNotEqualTo(Integer value) {
            addCriterion("picktype <>", value, "picktype");
            return (Criteria) this;
        }

        public Criteria andPicktypeGreaterThan(Integer value) {
            addCriterion("picktype >", value, "picktype");
            return (Criteria) this;
        }

        public Criteria andPicktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("picktype >=", value, "picktype");
            return (Criteria) this;
        }

        public Criteria andPicktypeLessThan(Integer value) {
            addCriterion("picktype <", value, "picktype");
            return (Criteria) this;
        }

        public Criteria andPicktypeLessThanOrEqualTo(Integer value) {
            addCriterion("picktype <=", value, "picktype");
            return (Criteria) this;
        }

        public Criteria andPicktypeIn(List<Integer> values) {
            addCriterion("picktype in", values, "picktype");
            return (Criteria) this;
        }

        public Criteria andPicktypeNotIn(List<Integer> values) {
            addCriterion("picktype not in", values, "picktype");
            return (Criteria) this;
        }

        public Criteria andPicktypeBetween(Integer value1, Integer value2) {
            addCriterion("picktype between", value1, value2, "picktype");
            return (Criteria) this;
        }

        public Criteria andPicktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("picktype not between", value1, value2, "picktype");
            return (Criteria) this;
        }

        public Criteria andExpressidIsNull() {
            addCriterion("expressid is null");
            return (Criteria) this;
        }

        public Criteria andExpressidIsNotNull() {
            addCriterion("expressid is not null");
            return (Criteria) this;
        }

        public Criteria andExpressidEqualTo(String value) {
            addCriterion("expressid =", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotEqualTo(String value) {
            addCriterion("expressid <>", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThan(String value) {
            addCriterion("expressid >", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThanOrEqualTo(String value) {
            addCriterion("expressid >=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThan(String value) {
            addCriterion("expressid <", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThanOrEqualTo(String value) {
            addCriterion("expressid <=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLike(String value) {
            addCriterion("expressid like", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotLike(String value) {
            addCriterion("expressid not like", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidIn(List<String> values) {
            addCriterion("expressid in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotIn(List<String> values) {
            addCriterion("expressid not in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidBetween(String value1, String value2) {
            addCriterion("expressid between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotBetween(String value1, String value2) {
            addCriterion("expressid not between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNull() {
            addCriterion("storeid is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeid is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(Integer value) {
            addCriterion("storeid =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(Integer value) {
            addCriterion("storeid <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(Integer value) {
            addCriterion("storeid >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeid >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(Integer value) {
            addCriterion("storeid <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("storeid <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<Integer> values) {
            addCriterion("storeid in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<Integer> values) {
            addCriterion("storeid not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(Integer value1, Integer value2) {
            addCriterion("storeid between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("storeid not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopid is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopid is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopid =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopid <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopid >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopid >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopid <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopid <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopid in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopid not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopid between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopid not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNull() {
            addCriterion("workid is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(Integer value) {
            addCriterion("workid =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(Integer value) {
            addCriterion("workid <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(Integer value) {
            addCriterion("workid >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workid >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(Integer value) {
            addCriterion("workid <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(Integer value) {
            addCriterion("workid <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<Integer> values) {
            addCriterion("workid in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<Integer> values) {
            addCriterion("workid not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(Integer value1, Integer value2) {
            addCriterion("workid between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(Integer value1, Integer value2) {
            addCriterion("workid not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("company_type like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("company_type not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyid is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyid is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyid =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyid <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyid >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyid >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyid <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyid <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyid in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyid not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyid between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyid not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("startdate like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("startdate not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("enddate like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("enddate not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("itemid is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("itemid is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(String value) {
            addCriterion("itemid =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(String value) {
            addCriterion("itemid <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(String value) {
            addCriterion("itemid >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(String value) {
            addCriterion("itemid >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(String value) {
            addCriterion("itemid <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(String value) {
            addCriterion("itemid <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLike(String value) {
            addCriterion("itemid like", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotLike(String value) {
            addCriterion("itemid not like", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<String> values) {
            addCriterion("itemid in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<String> values) {
            addCriterion("itemid not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(String value1, String value2) {
            addCriterion("itemid between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(String value1, String value2) {
            addCriterion("itemid not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andInsuranceidIsNull() {
            addCriterion("insuranceid is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceidIsNotNull() {
            addCriterion("insuranceid is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceidEqualTo(Integer value) {
            addCriterion("insuranceid =", value, "insuranceid");
            return (Criteria) this;
        }

        public Criteria andInsuranceidNotEqualTo(Integer value) {
            addCriterion("insuranceid <>", value, "insuranceid");
            return (Criteria) this;
        }

        public Criteria andInsuranceidGreaterThan(Integer value) {
            addCriterion("insuranceid >", value, "insuranceid");
            return (Criteria) this;
        }

        public Criteria andInsuranceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("insuranceid >=", value, "insuranceid");
            return (Criteria) this;
        }

        public Criteria andInsuranceidLessThan(Integer value) {
            addCriterion("insuranceid <", value, "insuranceid");
            return (Criteria) this;
        }

        public Criteria andInsuranceidLessThanOrEqualTo(Integer value) {
            addCriterion("insuranceid <=", value, "insuranceid");
            return (Criteria) this;
        }

        public Criteria andInsuranceidIn(List<Integer> values) {
            addCriterion("insuranceid in", values, "insuranceid");
            return (Criteria) this;
        }

        public Criteria andInsuranceidNotIn(List<Integer> values) {
            addCriterion("insuranceid not in", values, "insuranceid");
            return (Criteria) this;
        }

        public Criteria andInsuranceidBetween(Integer value1, Integer value2) {
            addCriterion("insuranceid between", value1, value2, "insuranceid");
            return (Criteria) this;
        }

        public Criteria andInsuranceidNotBetween(Integer value1, Integer value2) {
            addCriterion("insuranceid not between", value1, value2, "insuranceid");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNull() {
            addCriterion("activityid is null");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNotNull() {
            addCriterion("activityid is not null");
            return (Criteria) this;
        }

        public Criteria andActivityidEqualTo(Integer value) {
            addCriterion("activityid =", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotEqualTo(Integer value) {
            addCriterion("activityid <>", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThan(Integer value) {
            addCriterion("activityid >", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityid >=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThan(Integer value) {
            addCriterion("activityid <", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThanOrEqualTo(Integer value) {
            addCriterion("activityid <=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidIn(List<Integer> values) {
            addCriterion("activityid in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotIn(List<Integer> values) {
            addCriterion("activityid not in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidBetween(Integer value1, Integer value2) {
            addCriterion("activityid between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotBetween(Integer value1, Integer value2) {
            addCriterion("activityid not between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andCouponidIsNull() {
            addCriterion("couponid is null");
            return (Criteria) this;
        }

        public Criteria andCouponidIsNotNull() {
            addCriterion("couponid is not null");
            return (Criteria) this;
        }

        public Criteria andCouponidEqualTo(Integer value) {
            addCriterion("couponid =", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotEqualTo(Integer value) {
            addCriterion("couponid <>", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidGreaterThan(Integer value) {
            addCriterion("couponid >", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidGreaterThanOrEqualTo(Integer value) {
            addCriterion("couponid >=", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidLessThan(Integer value) {
            addCriterion("couponid <", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidLessThanOrEqualTo(Integer value) {
            addCriterion("couponid <=", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidIn(List<Integer> values) {
            addCriterion("couponid in", values, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotIn(List<Integer> values) {
            addCriterion("couponid not in", values, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidBetween(Integer value1, Integer value2) {
            addCriterion("couponid between", value1, value2, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotBetween(Integer value1, Integer value2) {
            addCriterion("couponid not between", value1, value2, "couponid");
            return (Criteria) this;
        }

        public Criteria andDiscountidIsNull() {
            addCriterion("discountid is null");
            return (Criteria) this;
        }

        public Criteria andDiscountidIsNotNull() {
            addCriterion("discountid is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountidEqualTo(String value) {
            addCriterion("discountid =", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotEqualTo(String value) {
            addCriterion("discountid <>", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidGreaterThan(String value) {
            addCriterion("discountid >", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidGreaterThanOrEqualTo(String value) {
            addCriterion("discountid >=", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLessThan(String value) {
            addCriterion("discountid <", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLessThanOrEqualTo(String value) {
            addCriterion("discountid <=", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLike(String value) {
            addCriterion("discountid like", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotLike(String value) {
            addCriterion("discountid not like", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidIn(List<String> values) {
            addCriterion("discountid in", values, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotIn(List<String> values) {
            addCriterion("discountid not in", values, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidBetween(String value1, String value2) {
            addCriterion("discountid between", value1, value2, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotBetween(String value1, String value2) {
            addCriterion("discountid not between", value1, value2, "discountid");
            return (Criteria) this;
        }

        public Criteria andLeaseIsNull() {
            addCriterion("lease is null");
            return (Criteria) this;
        }

        public Criteria andLeaseIsNotNull() {
            addCriterion("lease is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseEqualTo(Byte value) {
            addCriterion("lease =", value, "lease");
            return (Criteria) this;
        }

        public Criteria andLeaseNotEqualTo(Byte value) {
            addCriterion("lease <>", value, "lease");
            return (Criteria) this;
        }

        public Criteria andLeaseGreaterThan(Byte value) {
            addCriterion("lease >", value, "lease");
            return (Criteria) this;
        }

        public Criteria andLeaseGreaterThanOrEqualTo(Byte value) {
            addCriterion("lease >=", value, "lease");
            return (Criteria) this;
        }

        public Criteria andLeaseLessThan(Byte value) {
            addCriterion("lease <", value, "lease");
            return (Criteria) this;
        }

        public Criteria andLeaseLessThanOrEqualTo(Byte value) {
            addCriterion("lease <=", value, "lease");
            return (Criteria) this;
        }

        public Criteria andLeaseIn(List<Byte> values) {
            addCriterion("lease in", values, "lease");
            return (Criteria) this;
        }

        public Criteria andLeaseNotIn(List<Byte> values) {
            addCriterion("lease not in", values, "lease");
            return (Criteria) this;
        }

        public Criteria andLeaseBetween(Byte value1, Byte value2) {
            addCriterion("lease between", value1, value2, "lease");
            return (Criteria) this;
        }

        public Criteria andLeaseNotBetween(Byte value1, Byte value2) {
            addCriterion("lease not between", value1, value2, "lease");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEndTypeIsNull() {
            addCriterion("end_type is null");
            return (Criteria) this;
        }

        public Criteria andEndTypeIsNotNull() {
            addCriterion("end_type is not null");
            return (Criteria) this;
        }

        public Criteria andEndTypeEqualTo(Byte value) {
            addCriterion("end_type =", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeNotEqualTo(Byte value) {
            addCriterion("end_type <>", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeGreaterThan(Byte value) {
            addCriterion("end_type >", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("end_type >=", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeLessThan(Byte value) {
            addCriterion("end_type <", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeLessThanOrEqualTo(Byte value) {
            addCriterion("end_type <=", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeIn(List<Byte> values) {
            addCriterion("end_type in", values, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeNotIn(List<Byte> values) {
            addCriterion("end_type not in", values, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeBetween(Byte value1, Byte value2) {
            addCriterion("end_type between", value1, value2, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("end_type not between", value1, value2, "endType");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeIsNull() {
            addCriterion("returns_type is null");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeIsNotNull() {
            addCriterion("returns_type is not null");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeEqualTo(Byte value) {
            addCriterion("returns_type =", value, "returnsType");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeNotEqualTo(Byte value) {
            addCriterion("returns_type <>", value, "returnsType");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeGreaterThan(Byte value) {
            addCriterion("returns_type >", value, "returnsType");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("returns_type >=", value, "returnsType");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeLessThan(Byte value) {
            addCriterion("returns_type <", value, "returnsType");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeLessThanOrEqualTo(Byte value) {
            addCriterion("returns_type <=", value, "returnsType");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeIn(List<Byte> values) {
            addCriterion("returns_type in", values, "returnsType");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeNotIn(List<Byte> values) {
            addCriterion("returns_type not in", values, "returnsType");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeBetween(Byte value1, Byte value2) {
            addCriterion("returns_type between", value1, value2, "returnsType");
            return (Criteria) this;
        }

        public Criteria andReturnsTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("returns_type not between", value1, value2, "returnsType");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusIsNull() {
            addCriterion("returns_status is null");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusIsNotNull() {
            addCriterion("returns_status is not null");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusEqualTo(Byte value) {
            addCriterion("returns_status =", value, "returnsStatus");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusNotEqualTo(Byte value) {
            addCriterion("returns_status <>", value, "returnsStatus");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusGreaterThan(Byte value) {
            addCriterion("returns_status >", value, "returnsStatus");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("returns_status >=", value, "returnsStatus");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusLessThan(Byte value) {
            addCriterion("returns_status <", value, "returnsStatus");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("returns_status <=", value, "returnsStatus");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusIn(List<Byte> values) {
            addCriterion("returns_status in", values, "returnsStatus");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusNotIn(List<Byte> values) {
            addCriterion("returns_status not in", values, "returnsStatus");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusBetween(Byte value1, Byte value2) {
            addCriterion("returns_status between", value1, value2, "returnsStatus");
            return (Criteria) this;
        }

        public Criteria andReturnsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("returns_status not between", value1, value2, "returnsStatus");
            return (Criteria) this;
        }

        public Criteria andCashTypeIsNull() {
            addCriterion("cash_type is null");
            return (Criteria) this;
        }

        public Criteria andCashTypeIsNotNull() {
            addCriterion("cash_type is not null");
            return (Criteria) this;
        }

        public Criteria andCashTypeEqualTo(Byte value) {
            addCriterion("cash_type =", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeNotEqualTo(Byte value) {
            addCriterion("cash_type <>", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeGreaterThan(Byte value) {
            addCriterion("cash_type >", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("cash_type >=", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeLessThan(Byte value) {
            addCriterion("cash_type <", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeLessThanOrEqualTo(Byte value) {
            addCriterion("cash_type <=", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeIn(List<Byte> values) {
            addCriterion("cash_type in", values, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeNotIn(List<Byte> values) {
            addCriterion("cash_type not in", values, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeBetween(Byte value1, Byte value2) {
            addCriterion("cash_type between", value1, value2, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("cash_type not between", value1, value2, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashValueIsNull() {
            addCriterion("cash_value is null");
            return (Criteria) this;
        }

        public Criteria andCashValueIsNotNull() {
            addCriterion("cash_value is not null");
            return (Criteria) this;
        }

        public Criteria andCashValueEqualTo(Integer value) {
            addCriterion("cash_value =", value, "cashValue");
            return (Criteria) this;
        }

        public Criteria andCashValueNotEqualTo(Integer value) {
            addCriterion("cash_value <>", value, "cashValue");
            return (Criteria) this;
        }

        public Criteria andCashValueGreaterThan(Integer value) {
            addCriterion("cash_value >", value, "cashValue");
            return (Criteria) this;
        }

        public Criteria andCashValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("cash_value >=", value, "cashValue");
            return (Criteria) this;
        }

        public Criteria andCashValueLessThan(Integer value) {
            addCriterion("cash_value <", value, "cashValue");
            return (Criteria) this;
        }

        public Criteria andCashValueLessThanOrEqualTo(Integer value) {
            addCriterion("cash_value <=", value, "cashValue");
            return (Criteria) this;
        }

        public Criteria andCashValueIn(List<Integer> values) {
            addCriterion("cash_value in", values, "cashValue");
            return (Criteria) this;
        }

        public Criteria andCashValueNotIn(List<Integer> values) {
            addCriterion("cash_value not in", values, "cashValue");
            return (Criteria) this;
        }

        public Criteria andCashValueBetween(Integer value1, Integer value2) {
            addCriterion("cash_value between", value1, value2, "cashValue");
            return (Criteria) this;
        }

        public Criteria andCashValueNotBetween(Integer value1, Integer value2) {
            addCriterion("cash_value not between", value1, value2, "cashValue");
            return (Criteria) this;
        }

        public Criteria andCashStatusIsNull() {
            addCriterion("cash_status is null");
            return (Criteria) this;
        }

        public Criteria andCashStatusIsNotNull() {
            addCriterion("cash_status is not null");
            return (Criteria) this;
        }

        public Criteria andCashStatusEqualTo(Byte value) {
            addCriterion("cash_status =", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusNotEqualTo(Byte value) {
            addCriterion("cash_status <>", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusGreaterThan(Byte value) {
            addCriterion("cash_status >", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("cash_status >=", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusLessThan(Byte value) {
            addCriterion("cash_status <", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusLessThanOrEqualTo(Byte value) {
            addCriterion("cash_status <=", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusIn(List<Byte> values) {
            addCriterion("cash_status in", values, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusNotIn(List<Byte> values) {
            addCriterion("cash_status not in", values, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusBetween(Byte value1, Byte value2) {
            addCriterion("cash_status between", value1, value2, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("cash_status not between", value1, value2, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Byte value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Byte value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Byte value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Byte value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Byte value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Byte> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Byte> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Byte value1, Byte value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Byte value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Byte value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Byte value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Byte value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Byte value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Byte> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Byte> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Byte value1, Byte value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNull() {
            addCriterion("come_from is null");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNotNull() {
            addCriterion("come_from is not null");
            return (Criteria) this;
        }

        public Criteria andComeFromEqualTo(String value) {
            addCriterion("come_from =", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotEqualTo(String value) {
            addCriterion("come_from <>", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThan(String value) {
            addCriterion("come_from >", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThanOrEqualTo(String value) {
            addCriterion("come_from >=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThan(String value) {
            addCriterion("come_from <", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThanOrEqualTo(String value) {
            addCriterion("come_from <=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLike(String value) {
            addCriterion("come_from like", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotLike(String value) {
            addCriterion("come_from not like", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromIn(List<String> values) {
            addCriterion("come_from in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotIn(List<String> values) {
            addCriterion("come_from not in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromBetween(String value1, String value2) {
            addCriterion("come_from between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotBetween(String value1, String value2) {
            addCriterion("come_from not between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNull() {
            addCriterion("lock_date is null");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNotNull() {
            addCriterion("lock_date is not null");
            return (Criteria) this;
        }

        public Criteria andLockDateEqualTo(String value) {
            addCriterion("lock_date =", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotEqualTo(String value) {
            addCriterion("lock_date <>", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThan(String value) {
            addCriterion("lock_date >", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThanOrEqualTo(String value) {
            addCriterion("lock_date >=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThan(String value) {
            addCriterion("lock_date <", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThanOrEqualTo(String value) {
            addCriterion("lock_date <=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLike(String value) {
            addCriterion("lock_date like", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotLike(String value) {
            addCriterion("lock_date not like", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateIn(List<String> values) {
            addCriterion("lock_date in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotIn(List<String> values) {
            addCriterion("lock_date not in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateBetween(String value1, String value2) {
            addCriterion("lock_date between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotBetween(String value1, String value2) {
            addCriterion("lock_date not between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andYmdhms0IsNull() {
            addCriterion("ymdhms0 is null");
            return (Criteria) this;
        }

        public Criteria andYmdhms0IsNotNull() {
            addCriterion("ymdhms0 is not null");
            return (Criteria) this;
        }

        public Criteria andYmdhms0EqualTo(String value) {
            addCriterion("ymdhms0 =", value, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms0NotEqualTo(String value) {
            addCriterion("ymdhms0 <>", value, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms0GreaterThan(String value) {
            addCriterion("ymdhms0 >", value, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms0GreaterThanOrEqualTo(String value) {
            addCriterion("ymdhms0 >=", value, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms0LessThan(String value) {
            addCriterion("ymdhms0 <", value, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms0LessThanOrEqualTo(String value) {
            addCriterion("ymdhms0 <=", value, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms0Like(String value) {
            addCriterion("ymdhms0 like", value, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms0NotLike(String value) {
            addCriterion("ymdhms0 not like", value, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms0In(List<String> values) {
            addCriterion("ymdhms0 in", values, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms0NotIn(List<String> values) {
            addCriterion("ymdhms0 not in", values, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms0Between(String value1, String value2) {
            addCriterion("ymdhms0 between", value1, value2, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms0NotBetween(String value1, String value2) {
            addCriterion("ymdhms0 not between", value1, value2, "ymdhms0");
            return (Criteria) this;
        }

        public Criteria andYmdhms1IsNull() {
            addCriterion("ymdhms1 is null");
            return (Criteria) this;
        }

        public Criteria andYmdhms1IsNotNull() {
            addCriterion("ymdhms1 is not null");
            return (Criteria) this;
        }

        public Criteria andYmdhms1EqualTo(String value) {
            addCriterion("ymdhms1 =", value, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms1NotEqualTo(String value) {
            addCriterion("ymdhms1 <>", value, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms1GreaterThan(String value) {
            addCriterion("ymdhms1 >", value, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms1GreaterThanOrEqualTo(String value) {
            addCriterion("ymdhms1 >=", value, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms1LessThan(String value) {
            addCriterion("ymdhms1 <", value, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms1LessThanOrEqualTo(String value) {
            addCriterion("ymdhms1 <=", value, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms1Like(String value) {
            addCriterion("ymdhms1 like", value, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms1NotLike(String value) {
            addCriterion("ymdhms1 not like", value, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms1In(List<String> values) {
            addCriterion("ymdhms1 in", values, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms1NotIn(List<String> values) {
            addCriterion("ymdhms1 not in", values, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms1Between(String value1, String value2) {
            addCriterion("ymdhms1 between", value1, value2, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms1NotBetween(String value1, String value2) {
            addCriterion("ymdhms1 not between", value1, value2, "ymdhms1");
            return (Criteria) this;
        }

        public Criteria andYmdhms2IsNull() {
            addCriterion("ymdhms2 is null");
            return (Criteria) this;
        }

        public Criteria andYmdhms2IsNotNull() {
            addCriterion("ymdhms2 is not null");
            return (Criteria) this;
        }

        public Criteria andYmdhms2EqualTo(String value) {
            addCriterion("ymdhms2 =", value, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms2NotEqualTo(String value) {
            addCriterion("ymdhms2 <>", value, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms2GreaterThan(String value) {
            addCriterion("ymdhms2 >", value, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms2GreaterThanOrEqualTo(String value) {
            addCriterion("ymdhms2 >=", value, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms2LessThan(String value) {
            addCriterion("ymdhms2 <", value, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms2LessThanOrEqualTo(String value) {
            addCriterion("ymdhms2 <=", value, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms2Like(String value) {
            addCriterion("ymdhms2 like", value, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms2NotLike(String value) {
            addCriterion("ymdhms2 not like", value, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms2In(List<String> values) {
            addCriterion("ymdhms2 in", values, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms2NotIn(List<String> values) {
            addCriterion("ymdhms2 not in", values, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms2Between(String value1, String value2) {
            addCriterion("ymdhms2 between", value1, value2, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms2NotBetween(String value1, String value2) {
            addCriterion("ymdhms2 not between", value1, value2, "ymdhms2");
            return (Criteria) this;
        }

        public Criteria andYmdhms3IsNull() {
            addCriterion("ymdhms3 is null");
            return (Criteria) this;
        }

        public Criteria andYmdhms3IsNotNull() {
            addCriterion("ymdhms3 is not null");
            return (Criteria) this;
        }

        public Criteria andYmdhms3EqualTo(String value) {
            addCriterion("ymdhms3 =", value, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms3NotEqualTo(String value) {
            addCriterion("ymdhms3 <>", value, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms3GreaterThan(String value) {
            addCriterion("ymdhms3 >", value, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms3GreaterThanOrEqualTo(String value) {
            addCriterion("ymdhms3 >=", value, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms3LessThan(String value) {
            addCriterion("ymdhms3 <", value, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms3LessThanOrEqualTo(String value) {
            addCriterion("ymdhms3 <=", value, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms3Like(String value) {
            addCriterion("ymdhms3 like", value, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms3NotLike(String value) {
            addCriterion("ymdhms3 not like", value, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms3In(List<String> values) {
            addCriterion("ymdhms3 in", values, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms3NotIn(List<String> values) {
            addCriterion("ymdhms3 not in", values, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms3Between(String value1, String value2) {
            addCriterion("ymdhms3 between", value1, value2, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms3NotBetween(String value1, String value2) {
            addCriterion("ymdhms3 not between", value1, value2, "ymdhms3");
            return (Criteria) this;
        }

        public Criteria andYmdhms4IsNull() {
            addCriterion("ymdhms4 is null");
            return (Criteria) this;
        }

        public Criteria andYmdhms4IsNotNull() {
            addCriterion("ymdhms4 is not null");
            return (Criteria) this;
        }

        public Criteria andYmdhms4EqualTo(String value) {
            addCriterion("ymdhms4 =", value, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmdhms4NotEqualTo(String value) {
            addCriterion("ymdhms4 <>", value, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmdhms4GreaterThan(String value) {
            addCriterion("ymdhms4 >", value, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmdhms4GreaterThanOrEqualTo(String value) {
            addCriterion("ymdhms4 >=", value, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmdhms4LessThan(String value) {
            addCriterion("ymdhms4 <", value, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmdhms4LessThanOrEqualTo(String value) {
            addCriterion("ymdhms4 <=", value, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmdhms4Like(String value) {
            addCriterion("ymdhms4 like", value, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmdhms4NotLike(String value) {
            addCriterion("ymdhms4 not like", value, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmdhms4In(List<String> values) {
            addCriterion("ymdhms4 in", values, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmdhms4NotIn(List<String> values) {
            addCriterion("ymdhms4 not in", values, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmdhms4Between(String value1, String value2) {
            addCriterion("ymdhms4 between", value1, value2, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmdhms4NotBetween(String value1, String value2) {
            addCriterion("ymdhms4 not between", value1, value2, "ymdhms4");
            return (Criteria) this;
        }

        public Criteria andYmd0IsNull() {
            addCriterion("ymd0 is null");
            return (Criteria) this;
        }

        public Criteria andYmd0IsNotNull() {
            addCriterion("ymd0 is not null");
            return (Criteria) this;
        }

        public Criteria andYmd0EqualTo(String value) {
            addCriterion("ymd0 =", value, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd0NotEqualTo(String value) {
            addCriterion("ymd0 <>", value, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd0GreaterThan(String value) {
            addCriterion("ymd0 >", value, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd0GreaterThanOrEqualTo(String value) {
            addCriterion("ymd0 >=", value, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd0LessThan(String value) {
            addCriterion("ymd0 <", value, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd0LessThanOrEqualTo(String value) {
            addCriterion("ymd0 <=", value, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd0Like(String value) {
            addCriterion("ymd0 like", value, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd0NotLike(String value) {
            addCriterion("ymd0 not like", value, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd0In(List<String> values) {
            addCriterion("ymd0 in", values, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd0NotIn(List<String> values) {
            addCriterion("ymd0 not in", values, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd0Between(String value1, String value2) {
            addCriterion("ymd0 between", value1, value2, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd0NotBetween(String value1, String value2) {
            addCriterion("ymd0 not between", value1, value2, "ymd0");
            return (Criteria) this;
        }

        public Criteria andYmd1IsNull() {
            addCriterion("ymd1 is null");
            return (Criteria) this;
        }

        public Criteria andYmd1IsNotNull() {
            addCriterion("ymd1 is not null");
            return (Criteria) this;
        }

        public Criteria andYmd1EqualTo(String value) {
            addCriterion("ymd1 =", value, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd1NotEqualTo(String value) {
            addCriterion("ymd1 <>", value, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd1GreaterThan(String value) {
            addCriterion("ymd1 >", value, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd1GreaterThanOrEqualTo(String value) {
            addCriterion("ymd1 >=", value, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd1LessThan(String value) {
            addCriterion("ymd1 <", value, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd1LessThanOrEqualTo(String value) {
            addCriterion("ymd1 <=", value, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd1Like(String value) {
            addCriterion("ymd1 like", value, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd1NotLike(String value) {
            addCriterion("ymd1 not like", value, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd1In(List<String> values) {
            addCriterion("ymd1 in", values, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd1NotIn(List<String> values) {
            addCriterion("ymd1 not in", values, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd1Between(String value1, String value2) {
            addCriterion("ymd1 between", value1, value2, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd1NotBetween(String value1, String value2) {
            addCriterion("ymd1 not between", value1, value2, "ymd1");
            return (Criteria) this;
        }

        public Criteria andYmd2IsNull() {
            addCriterion("ymd2 is null");
            return (Criteria) this;
        }

        public Criteria andYmd2IsNotNull() {
            addCriterion("ymd2 is not null");
            return (Criteria) this;
        }

        public Criteria andYmd2EqualTo(String value) {
            addCriterion("ymd2 =", value, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd2NotEqualTo(String value) {
            addCriterion("ymd2 <>", value, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd2GreaterThan(String value) {
            addCriterion("ymd2 >", value, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd2GreaterThanOrEqualTo(String value) {
            addCriterion("ymd2 >=", value, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd2LessThan(String value) {
            addCriterion("ymd2 <", value, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd2LessThanOrEqualTo(String value) {
            addCriterion("ymd2 <=", value, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd2Like(String value) {
            addCriterion("ymd2 like", value, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd2NotLike(String value) {
            addCriterion("ymd2 not like", value, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd2In(List<String> values) {
            addCriterion("ymd2 in", values, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd2NotIn(List<String> values) {
            addCriterion("ymd2 not in", values, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd2Between(String value1, String value2) {
            addCriterion("ymd2 between", value1, value2, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd2NotBetween(String value1, String value2) {
            addCriterion("ymd2 not between", value1, value2, "ymd2");
            return (Criteria) this;
        }

        public Criteria andYmd3IsNull() {
            addCriterion("ymd3 is null");
            return (Criteria) this;
        }

        public Criteria andYmd3IsNotNull() {
            addCriterion("ymd3 is not null");
            return (Criteria) this;
        }

        public Criteria andYmd3EqualTo(String value) {
            addCriterion("ymd3 =", value, "ymd3");
            return (Criteria) this;
        }

        public Criteria andYmd3NotEqualTo(String value) {
            addCriterion("ymd3 <>", value, "ymd3");
            return (Criteria) this;
        }

        public Criteria andYmd3GreaterThan(String value) {
            addCriterion("ymd3 >", value, "ymd3");
            return (Criteria) this;
        }

        public Criteria andYmd3GreaterThanOrEqualTo(String value) {
            addCriterion("ymd3 >=", value, "ymd3");
            return (Criteria) this;
        }

        public Criteria andYmd3LessThan(String value) {
            addCriterion("ymd3 <", value, "ymd3");
            return (Criteria) this;
        }

        public Criteria andYmd3LessThanOrEqualTo(String value) {
            addCriterion("ymd3 <=", value, "ymd3");
            return (Criteria) this;
        }

        public Criteria andYmd3Like(String value) {
            addCriterion("ymd3 like", value, "ymd3");
            return (Criteria) this;
        }

        public Criteria andYmd3NotLike(String value) {
            addCriterion("ymd3 not like", value, "ymd3");
            return (Criteria) this;
        }

        public Criteria andYmd3In(List<String> values) {
            addCriterion("ymd3 in", values, "ymd3");
            return (Criteria) this;
        }

        public Criteria andYmd3NotIn(List<String> values) {
            addCriterion("ymd3 not in", values, "ymd3");
            return (Criteria) this;
        }

        public Criteria andYmd3Between(String value1, String value2) {
            addCriterion("ymd3 between", value1, value2, "ymd3");
            return (Criteria) this;
        }

        public Criteria andYmd3NotBetween(String value1, String value2) {
            addCriterion("ymd3 not between", value1, value2, "ymd3");
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