package com.zdd.risk.bean;

import java.util.ArrayList;
import java.util.List;

public class AccountPlatformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountPlatformExample() {
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

        public Criteria andUserid1IsNull() {
            addCriterion("userid1 is null");
            return (Criteria) this;
        }

        public Criteria andUserid1IsNotNull() {
            addCriterion("userid1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserid1EqualTo(String value) {
            addCriterion("userid1 =", value, "userid1");
            return (Criteria) this;
        }

        public Criteria andUserid1NotEqualTo(String value) {
            addCriterion("userid1 <>", value, "userid1");
            return (Criteria) this;
        }

        public Criteria andUserid1GreaterThan(String value) {
            addCriterion("userid1 >", value, "userid1");
            return (Criteria) this;
        }

        public Criteria andUserid1GreaterThanOrEqualTo(String value) {
            addCriterion("userid1 >=", value, "userid1");
            return (Criteria) this;
        }

        public Criteria andUserid1LessThan(String value) {
            addCriterion("userid1 <", value, "userid1");
            return (Criteria) this;
        }

        public Criteria andUserid1LessThanOrEqualTo(String value) {
            addCriterion("userid1 <=", value, "userid1");
            return (Criteria) this;
        }

        public Criteria andUserid1Like(String value) {
            addCriterion("userid1 like", value, "userid1");
            return (Criteria) this;
        }

        public Criteria andUserid1NotLike(String value) {
            addCriterion("userid1 not like", value, "userid1");
            return (Criteria) this;
        }

        public Criteria andUserid1In(List<String> values) {
            addCriterion("userid1 in", values, "userid1");
            return (Criteria) this;
        }

        public Criteria andUserid1NotIn(List<String> values) {
            addCriterion("userid1 not in", values, "userid1");
            return (Criteria) this;
        }

        public Criteria andUserid1Between(String value1, String value2) {
            addCriterion("userid1 between", value1, value2, "userid1");
            return (Criteria) this;
        }

        public Criteria andUserid1NotBetween(String value1, String value2) {
            addCriterion("userid1 not between", value1, value2, "userid1");
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andOauthuid1IsNull() {
            addCriterion("oauthuid1 is null");
            return (Criteria) this;
        }

        public Criteria andOauthuid1IsNotNull() {
            addCriterion("oauthuid1 is not null");
            return (Criteria) this;
        }

        public Criteria andOauthuid1EqualTo(String value) {
            addCriterion("oauthuid1 =", value, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid1NotEqualTo(String value) {
            addCriterion("oauthuid1 <>", value, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid1GreaterThan(String value) {
            addCriterion("oauthuid1 >", value, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid1GreaterThanOrEqualTo(String value) {
            addCriterion("oauthuid1 >=", value, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid1LessThan(String value) {
            addCriterion("oauthuid1 <", value, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid1LessThanOrEqualTo(String value) {
            addCriterion("oauthuid1 <=", value, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid1Like(String value) {
            addCriterion("oauthuid1 like", value, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid1NotLike(String value) {
            addCriterion("oauthuid1 not like", value, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid1In(List<String> values) {
            addCriterion("oauthuid1 in", values, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid1NotIn(List<String> values) {
            addCriterion("oauthuid1 not in", values, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid1Between(String value1, String value2) {
            addCriterion("oauthuid1 between", value1, value2, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid1NotBetween(String value1, String value2) {
            addCriterion("oauthuid1 not between", value1, value2, "oauthuid1");
            return (Criteria) this;
        }

        public Criteria andOauthuid2IsNull() {
            addCriterion("oauthuid2 is null");
            return (Criteria) this;
        }

        public Criteria andOauthuid2IsNotNull() {
            addCriterion("oauthuid2 is not null");
            return (Criteria) this;
        }

        public Criteria andOauthuid2EqualTo(String value) {
            addCriterion("oauthuid2 =", value, "oauthuid2");
            return (Criteria) this;
        }

        public Criteria andOauthuid2NotEqualTo(String value) {
            addCriterion("oauthuid2 <>", value, "oauthuid2");
            return (Criteria) this;
        }

        public Criteria andOauthuid2GreaterThan(String value) {
            addCriterion("oauthuid2 >", value, "oauthuid2");
            return (Criteria) this;
        }

        public Criteria andOauthuid2GreaterThanOrEqualTo(String value) {
            addCriterion("oauthuid2 >=", value, "oauthuid2");
            return (Criteria) this;
        }

        public Criteria andOauthuid2LessThan(String value) {
            addCriterion("oauthuid2 <", value, "oauthuid2");
            return (Criteria) this;
        }

        public Criteria andOauthuid2LessThanOrEqualTo(String value) {
            addCriterion("oauthuid2 <=", value, "oauthuid2");
            return (Criteria) this;
        }

        public Criteria andOauthuid2Like(String value) {
            addCriterion("oauthuid2 like", value, "oauthuid2");
            return (Criteria) this;
        }

        public Criteria andOauthuid2NotLike(String value) {
            addCriterion("oauthuid2 not like", value, "oauthuid2");
            return (Criteria) this;
        }

        public Criteria andOauthuid2In(List<String> values) {
            addCriterion("oauthuid2 in", values, "oauthuid2");
            return (Criteria) this;
        }

        public Criteria andOauthuid2NotIn(List<String> values) {
            addCriterion("oauthuid2 not in", values, "oauthuid2");
            return (Criteria) this;
        }

        public Criteria andOauthuid2Between(String value1, String value2) {
            addCriterion("oauthuid2 between", value1, value2, "oauthuid2");
            return (Criteria) this;
        }

        public Criteria andOauthuid2NotBetween(String value1, String value2) {
            addCriterion("oauthuid2 not between", value1, value2, "oauthuid2");
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

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
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