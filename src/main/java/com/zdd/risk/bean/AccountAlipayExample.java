package com.zdd.risk.bean;

import java.util.ArrayList;
import java.util.List;

public class AccountAlipayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountAlipayExample() {
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

        public Criteria andOauthuidIsNull() {
            addCriterion("oauthuid is null");
            return (Criteria) this;
        }

        public Criteria andOauthuidIsNotNull() {
            addCriterion("oauthuid is not null");
            return (Criteria) this;
        }

        public Criteria andOauthuidEqualTo(String value) {
            addCriterion("oauthuid =", value, "oauthuid");
            return (Criteria) this;
        }

        public Criteria andOauthuidNotEqualTo(String value) {
            addCriterion("oauthuid <>", value, "oauthuid");
            return (Criteria) this;
        }

        public Criteria andOauthuidGreaterThan(String value) {
            addCriterion("oauthuid >", value, "oauthuid");
            return (Criteria) this;
        }

        public Criteria andOauthuidGreaterThanOrEqualTo(String value) {
            addCriterion("oauthuid >=", value, "oauthuid");
            return (Criteria) this;
        }

        public Criteria andOauthuidLessThan(String value) {
            addCriterion("oauthuid <", value, "oauthuid");
            return (Criteria) this;
        }

        public Criteria andOauthuidLessThanOrEqualTo(String value) {
            addCriterion("oauthuid <=", value, "oauthuid");
            return (Criteria) this;
        }

        public Criteria andOauthuidLike(String value) {
            addCriterion("oauthuid like", value, "oauthuid");
            return (Criteria) this;
        }

        public Criteria andOauthuidNotLike(String value) {
            addCriterion("oauthuid not like", value, "oauthuid");
            return (Criteria) this;
        }

        public Criteria andOauthuidIn(List<String> values) {
            addCriterion("oauthuid in", values, "oauthuid");
            return (Criteria) this;
        }

        public Criteria andOauthuidNotIn(List<String> values) {
            addCriterion("oauthuid not in", values, "oauthuid");
            return (Criteria) this;
        }

        public Criteria andOauthuidBetween(String value1, String value2) {
            addCriterion("oauthuid between", value1, value2, "oauthuid");
            return (Criteria) this;
        }

        public Criteria andOauthuidNotBetween(String value1, String value2) {
            addCriterion("oauthuid not between", value1, value2, "oauthuid");
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

        public Criteria andUserid2IsNull() {
            addCriterion("userid2 is null");
            return (Criteria) this;
        }

        public Criteria andUserid2IsNotNull() {
            addCriterion("userid2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserid2EqualTo(String value) {
            addCriterion("userid2 =", value, "userid2");
            return (Criteria) this;
        }

        public Criteria andUserid2NotEqualTo(String value) {
            addCriterion("userid2 <>", value, "userid2");
            return (Criteria) this;
        }

        public Criteria andUserid2GreaterThan(String value) {
            addCriterion("userid2 >", value, "userid2");
            return (Criteria) this;
        }

        public Criteria andUserid2GreaterThanOrEqualTo(String value) {
            addCriterion("userid2 >=", value, "userid2");
            return (Criteria) this;
        }

        public Criteria andUserid2LessThan(String value) {
            addCriterion("userid2 <", value, "userid2");
            return (Criteria) this;
        }

        public Criteria andUserid2LessThanOrEqualTo(String value) {
            addCriterion("userid2 <=", value, "userid2");
            return (Criteria) this;
        }

        public Criteria andUserid2Like(String value) {
            addCriterion("userid2 like", value, "userid2");
            return (Criteria) this;
        }

        public Criteria andUserid2NotLike(String value) {
            addCriterion("userid2 not like", value, "userid2");
            return (Criteria) this;
        }

        public Criteria andUserid2In(List<String> values) {
            addCriterion("userid2 in", values, "userid2");
            return (Criteria) this;
        }

        public Criteria andUserid2NotIn(List<String> values) {
            addCriterion("userid2 not in", values, "userid2");
            return (Criteria) this;
        }

        public Criteria andUserid2Between(String value1, String value2) {
            addCriterion("userid2 between", value1, value2, "userid2");
            return (Criteria) this;
        }

        public Criteria andUserid2NotBetween(String value1, String value2) {
            addCriterion("userid2 not between", value1, value2, "userid2");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("regtime is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("regtime is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(String value) {
            addCriterion("regtime =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(String value) {
            addCriterion("regtime <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(String value) {
            addCriterion("regtime >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(String value) {
            addCriterion("regtime >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(String value) {
            addCriterion("regtime <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(String value) {
            addCriterion("regtime <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLike(String value) {
            addCriterion("regtime like", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotLike(String value) {
            addCriterion("regtime not like", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<String> values) {
            addCriterion("regtime in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<String> values) {
            addCriterion("regtime not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(String value1, String value2) {
            addCriterion("regtime between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(String value1, String value2) {
            addCriterion("regtime not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andAuthTokenIsNull() {
            addCriterion("auth_token is null");
            return (Criteria) this;
        }

        public Criteria andAuthTokenIsNotNull() {
            addCriterion("auth_token is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTokenEqualTo(String value) {
            addCriterion("auth_token =", value, "authToken");
            return (Criteria) this;
        }

        public Criteria andAuthTokenNotEqualTo(String value) {
            addCriterion("auth_token <>", value, "authToken");
            return (Criteria) this;
        }

        public Criteria andAuthTokenGreaterThan(String value) {
            addCriterion("auth_token >", value, "authToken");
            return (Criteria) this;
        }

        public Criteria andAuthTokenGreaterThanOrEqualTo(String value) {
            addCriterion("auth_token >=", value, "authToken");
            return (Criteria) this;
        }

        public Criteria andAuthTokenLessThan(String value) {
            addCriterion("auth_token <", value, "authToken");
            return (Criteria) this;
        }

        public Criteria andAuthTokenLessThanOrEqualTo(String value) {
            addCriterion("auth_token <=", value, "authToken");
            return (Criteria) this;
        }

        public Criteria andAuthTokenLike(String value) {
            addCriterion("auth_token like", value, "authToken");
            return (Criteria) this;
        }

        public Criteria andAuthTokenNotLike(String value) {
            addCriterion("auth_token not like", value, "authToken");
            return (Criteria) this;
        }

        public Criteria andAuthTokenIn(List<String> values) {
            addCriterion("auth_token in", values, "authToken");
            return (Criteria) this;
        }

        public Criteria andAuthTokenNotIn(List<String> values) {
            addCriterion("auth_token not in", values, "authToken");
            return (Criteria) this;
        }

        public Criteria andAuthTokenBetween(String value1, String value2) {
            addCriterion("auth_token between", value1, value2, "authToken");
            return (Criteria) this;
        }

        public Criteria andAuthTokenNotBetween(String value1, String value2) {
            addCriterion("auth_token not between", value1, value2, "authToken");
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