package com.zdd.risk.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductInfoExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverWebIsNull() {
            addCriterion("cover_web is null");
            return (Criteria) this;
        }

        public Criteria andCoverWebIsNotNull() {
            addCriterion("cover_web is not null");
            return (Criteria) this;
        }

        public Criteria andCoverWebEqualTo(String value) {
            addCriterion("cover_web =", value, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andCoverWebNotEqualTo(String value) {
            addCriterion("cover_web <>", value, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andCoverWebGreaterThan(String value) {
            addCriterion("cover_web >", value, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andCoverWebGreaterThanOrEqualTo(String value) {
            addCriterion("cover_web >=", value, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andCoverWebLessThan(String value) {
            addCriterion("cover_web <", value, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andCoverWebLessThanOrEqualTo(String value) {
            addCriterion("cover_web <=", value, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andCoverWebLike(String value) {
            addCriterion("cover_web like", value, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andCoverWebNotLike(String value) {
            addCriterion("cover_web not like", value, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andCoverWebIn(List<String> values) {
            addCriterion("cover_web in", values, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andCoverWebNotIn(List<String> values) {
            addCriterion("cover_web not in", values, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andCoverWebBetween(String value1, String value2) {
            addCriterion("cover_web between", value1, value2, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andCoverWebNotBetween(String value1, String value2) {
            addCriterion("cover_web not between", value1, value2, "coverWeb");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("brief is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("brief is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("brief =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("brief <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("brief >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("brief >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("brief <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("brief <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("brief like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("brief not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("brief in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("brief not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("brief between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("brief not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andMarketIsNull() {
            addCriterion("market is null");
            return (Criteria) this;
        }

        public Criteria andMarketIsNotNull() {
            addCriterion("market is not null");
            return (Criteria) this;
        }

        public Criteria andMarketEqualTo(Integer value) {
            addCriterion("market =", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotEqualTo(Integer value) {
            addCriterion("market <>", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThan(Integer value) {
            addCriterion("market >", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThanOrEqualTo(Integer value) {
            addCriterion("market >=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThan(Integer value) {
            addCriterion("market <", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThanOrEqualTo(Integer value) {
            addCriterion("market <=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketIn(List<Integer> values) {
            addCriterion("market in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotIn(List<Integer> values) {
            addCriterion("market not in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketBetween(Integer value1, Integer value2) {
            addCriterion("market between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotBetween(Integer value1, Integer value2) {
            addCriterion("market not between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andMonthCostIsNull() {
            addCriterion("month_cost is null");
            return (Criteria) this;
        }

        public Criteria andMonthCostIsNotNull() {
            addCriterion("month_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMonthCostEqualTo(Integer value) {
            addCriterion("month_cost =", value, "monthCost");
            return (Criteria) this;
        }

        public Criteria andMonthCostNotEqualTo(Integer value) {
            addCriterion("month_cost <>", value, "monthCost");
            return (Criteria) this;
        }

        public Criteria andMonthCostGreaterThan(Integer value) {
            addCriterion("month_cost >", value, "monthCost");
            return (Criteria) this;
        }

        public Criteria andMonthCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_cost >=", value, "monthCost");
            return (Criteria) this;
        }

        public Criteria andMonthCostLessThan(Integer value) {
            addCriterion("month_cost <", value, "monthCost");
            return (Criteria) this;
        }

        public Criteria andMonthCostLessThanOrEqualTo(Integer value) {
            addCriterion("month_cost <=", value, "monthCost");
            return (Criteria) this;
        }

        public Criteria andMonthCostIn(List<Integer> values) {
            addCriterion("month_cost in", values, "monthCost");
            return (Criteria) this;
        }

        public Criteria andMonthCostNotIn(List<Integer> values) {
            addCriterion("month_cost not in", values, "monthCost");
            return (Criteria) this;
        }

        public Criteria andMonthCostBetween(Integer value1, Integer value2) {
            addCriterion("month_cost between", value1, value2, "monthCost");
            return (Criteria) this;
        }

        public Criteria andMonthCostNotBetween(Integer value1, Integer value2) {
            addCriterion("month_cost not between", value1, value2, "monthCost");
            return (Criteria) this;
        }

        public Criteria andFinenessIsNull() {
            addCriterion("fineness is null");
            return (Criteria) this;
        }

        public Criteria andFinenessIsNotNull() {
            addCriterion("fineness is not null");
            return (Criteria) this;
        }

        public Criteria andFinenessEqualTo(Byte value) {
            addCriterion("fineness =", value, "fineness");
            return (Criteria) this;
        }

        public Criteria andFinenessNotEqualTo(Byte value) {
            addCriterion("fineness <>", value, "fineness");
            return (Criteria) this;
        }

        public Criteria andFinenessGreaterThan(Byte value) {
            addCriterion("fineness >", value, "fineness");
            return (Criteria) this;
        }

        public Criteria andFinenessGreaterThanOrEqualTo(Byte value) {
            addCriterion("fineness >=", value, "fineness");
            return (Criteria) this;
        }

        public Criteria andFinenessLessThan(Byte value) {
            addCriterion("fineness <", value, "fineness");
            return (Criteria) this;
        }

        public Criteria andFinenessLessThanOrEqualTo(Byte value) {
            addCriterion("fineness <=", value, "fineness");
            return (Criteria) this;
        }

        public Criteria andFinenessIn(List<Byte> values) {
            addCriterion("fineness in", values, "fineness");
            return (Criteria) this;
        }

        public Criteria andFinenessNotIn(List<Byte> values) {
            addCriterion("fineness not in", values, "fineness");
            return (Criteria) this;
        }

        public Criteria andFinenessBetween(Byte value1, Byte value2) {
            addCriterion("fineness between", value1, value2, "fineness");
            return (Criteria) this;
        }

        public Criteria andFinenessNotBetween(Byte value1, Byte value2) {
            addCriterion("fineness not between", value1, value2, "fineness");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Integer value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Integer value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Integer value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Integer value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Integer value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Integer> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Integer> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Integer value1, Integer value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("sales not between", value1, value2, "sales");
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

        public Criteria andInsuranceTypeIsNull() {
            addCriterion("insurance_type is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIsNotNull() {
            addCriterion("insurance_type is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeEqualTo(Byte value) {
            addCriterion("insurance_type =", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotEqualTo(Byte value) {
            addCriterion("insurance_type <>", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeGreaterThan(Byte value) {
            addCriterion("insurance_type >", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("insurance_type >=", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLessThan(Byte value) {
            addCriterion("insurance_type <", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLessThanOrEqualTo(Byte value) {
            addCriterion("insurance_type <=", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIn(List<Byte> values) {
            addCriterion("insurance_type in", values, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotIn(List<Byte> values) {
            addCriterion("insurance_type not in", values, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeBetween(Byte value1, Byte value2) {
            addCriterion("insurance_type between", value1, value2, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("insurance_type not between", value1, value2, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderno is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderno is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(Long value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(Long value) {
            addCriterion("orderno <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(Long value) {
            addCriterion("orderno >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(Long value) {
            addCriterion("orderno >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(Long value) {
            addCriterion("orderno <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(Long value) {
            addCriterion("orderno <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<Long> values) {
            addCriterion("orderno in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<Long> values) {
            addCriterion("orderno not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(Long value1, Long value2) {
            addCriterion("orderno between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(Long value1, Long value2) {
            addCriterion("orderno not between", value1, value2, "orderno");
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