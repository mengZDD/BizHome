package com.zdd.risk.bean;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreTotalIsNull() {
            addCriterion("score_total is null");
            return (Criteria) this;
        }

        public Criteria andScoreTotalIsNotNull() {
            addCriterion("score_total is not null");
            return (Criteria) this;
        }

        public Criteria andScoreTotalEqualTo(Integer value) {
            addCriterion("score_total =", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalNotEqualTo(Integer value) {
            addCriterion("score_total <>", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalGreaterThan(Integer value) {
            addCriterion("score_total >", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_total >=", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalLessThan(Integer value) {
            addCriterion("score_total <", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalLessThanOrEqualTo(Integer value) {
            addCriterion("score_total <=", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalIn(List<Integer> values) {
            addCriterion("score_total in", values, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalNotIn(List<Integer> values) {
            addCriterion("score_total not in", values, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalBetween(Integer value1, Integer value2) {
            addCriterion("score_total between", value1, value2, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("score_total not between", value1, value2, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeIsNull() {
            addCriterion("zhima_grade is null");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeIsNotNull() {
            addCriterion("zhima_grade is not null");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeEqualTo(String value) {
            addCriterion("zhima_grade =", value, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeNotEqualTo(String value) {
            addCriterion("zhima_grade <>", value, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeGreaterThan(String value) {
            addCriterion("zhima_grade >", value, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeGreaterThanOrEqualTo(String value) {
            addCriterion("zhima_grade >=", value, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeLessThan(String value) {
            addCriterion("zhima_grade <", value, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeLessThanOrEqualTo(String value) {
            addCriterion("zhima_grade <=", value, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeLike(String value) {
            addCriterion("zhima_grade like", value, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeNotLike(String value) {
            addCriterion("zhima_grade not like", value, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeIn(List<String> values) {
            addCriterion("zhima_grade in", values, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeNotIn(List<String> values) {
            addCriterion("zhima_grade not in", values, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeBetween(String value1, String value2) {
            addCriterion("zhima_grade between", value1, value2, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaGradeNotBetween(String value1, String value2) {
            addCriterion("zhima_grade not between", value1, value2, "zhimaGrade");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeIsNull() {
            addCriterion("zhima_time is null");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeIsNotNull() {
            addCriterion("zhima_time is not null");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeEqualTo(String value) {
            addCriterion("zhima_time =", value, "zhimaTime");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeNotEqualTo(String value) {
            addCriterion("zhima_time <>", value, "zhimaTime");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeGreaterThan(String value) {
            addCriterion("zhima_time >", value, "zhimaTime");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeGreaterThanOrEqualTo(String value) {
            addCriterion("zhima_time >=", value, "zhimaTime");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeLessThan(String value) {
            addCriterion("zhima_time <", value, "zhimaTime");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeLessThanOrEqualTo(String value) {
            addCriterion("zhima_time <=", value, "zhimaTime");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeLike(String value) {
            addCriterion("zhima_time like", value, "zhimaTime");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeNotLike(String value) {
            addCriterion("zhima_time not like", value, "zhimaTime");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeIn(List<String> values) {
            addCriterion("zhima_time in", values, "zhimaTime");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeNotIn(List<String> values) {
            addCriterion("zhima_time not in", values, "zhimaTime");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeBetween(String value1, String value2) {
            addCriterion("zhima_time between", value1, value2, "zhimaTime");
            return (Criteria) this;
        }

        public Criteria andZhimaTimeNotBetween(String value1, String value2) {
            addCriterion("zhima_time not between", value1, value2, "zhimaTime");
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