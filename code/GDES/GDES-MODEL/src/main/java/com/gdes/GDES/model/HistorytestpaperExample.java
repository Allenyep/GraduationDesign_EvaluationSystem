package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class HistorytestpaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistorytestpaperExample() {
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

        public Criteria andIdTIsNull() {
            addCriterion("id_t is null");
            return (Criteria) this;
        }

        public Criteria andIdTIsNotNull() {
            addCriterion("id_t is not null");
            return (Criteria) this;
        }

        public Criteria andIdTEqualTo(String value) {
            addCriterion("id_t =", value, "idT");
            return (Criteria) this;
        }

        public Criteria andIdTNotEqualTo(String value) {
            addCriterion("id_t <>", value, "idT");
            return (Criteria) this;
        }

        public Criteria andIdTGreaterThan(String value) {
            addCriterion("id_t >", value, "idT");
            return (Criteria) this;
        }

        public Criteria andIdTGreaterThanOrEqualTo(String value) {
            addCriterion("id_t >=", value, "idT");
            return (Criteria) this;
        }

        public Criteria andIdTLessThan(String value) {
            addCriterion("id_t <", value, "idT");
            return (Criteria) this;
        }

        public Criteria andIdTLessThanOrEqualTo(String value) {
            addCriterion("id_t <=", value, "idT");
            return (Criteria) this;
        }

        public Criteria andIdTLike(String value) {
            addCriterion("id_t like", value, "idT");
            return (Criteria) this;
        }

        public Criteria andIdTNotLike(String value) {
            addCriterion("id_t not like", value, "idT");
            return (Criteria) this;
        }

        public Criteria andIdTIn(List<String> values) {
            addCriterion("id_t in", values, "idT");
            return (Criteria) this;
        }

        public Criteria andIdTNotIn(List<String> values) {
            addCriterion("id_t not in", values, "idT");
            return (Criteria) this;
        }

        public Criteria andIdTBetween(String value1, String value2) {
            addCriterion("id_t between", value1, value2, "idT");
            return (Criteria) this;
        }

        public Criteria andIdTNotBetween(String value1, String value2) {
            addCriterion("id_t not between", value1, value2, "idT");
            return (Criteria) this;
        }

        public Criteria andIdSIsNull() {
            addCriterion("id_s is null");
            return (Criteria) this;
        }

        public Criteria andIdSIsNotNull() {
            addCriterion("id_s is not null");
            return (Criteria) this;
        }

        public Criteria andIdSEqualTo(String value) {
            addCriterion("id_s =", value, "idS");
            return (Criteria) this;
        }

        public Criteria andIdSNotEqualTo(String value) {
            addCriterion("id_s <>", value, "idS");
            return (Criteria) this;
        }

        public Criteria andIdSGreaterThan(String value) {
            addCriterion("id_s >", value, "idS");
            return (Criteria) this;
        }

        public Criteria andIdSGreaterThanOrEqualTo(String value) {
            addCriterion("id_s >=", value, "idS");
            return (Criteria) this;
        }

        public Criteria andIdSLessThan(String value) {
            addCriterion("id_s <", value, "idS");
            return (Criteria) this;
        }

        public Criteria andIdSLessThanOrEqualTo(String value) {
            addCriterion("id_s <=", value, "idS");
            return (Criteria) this;
        }

        public Criteria andIdSLike(String value) {
            addCriterion("id_s like", value, "idS");
            return (Criteria) this;
        }

        public Criteria andIdSNotLike(String value) {
            addCriterion("id_s not like", value, "idS");
            return (Criteria) this;
        }

        public Criteria andIdSIn(List<String> values) {
            addCriterion("id_s in", values, "idS");
            return (Criteria) this;
        }

        public Criteria andIdSNotIn(List<String> values) {
            addCriterion("id_s not in", values, "idS");
            return (Criteria) this;
        }

        public Criteria andIdSBetween(String value1, String value2) {
            addCriterion("id_s between", value1, value2, "idS");
            return (Criteria) this;
        }

        public Criteria andIdSNotBetween(String value1, String value2) {
            addCriterion("id_s not between", value1, value2, "idS");
            return (Criteria) this;
        }

        public Criteria andIdErIsNull() {
            addCriterion("id_er is null");
            return (Criteria) this;
        }

        public Criteria andIdErIsNotNull() {
            addCriterion("id_er is not null");
            return (Criteria) this;
        }

        public Criteria andIdErEqualTo(String value) {
            addCriterion("id_er =", value, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdErNotEqualTo(String value) {
            addCriterion("id_er <>", value, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdErGreaterThan(String value) {
            addCriterion("id_er >", value, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdErGreaterThanOrEqualTo(String value) {
            addCriterion("id_er >=", value, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdErLessThan(String value) {
            addCriterion("id_er <", value, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdErLessThanOrEqualTo(String value) {
            addCriterion("id_er <=", value, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdErLike(String value) {
            addCriterion("id_er like", value, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdErNotLike(String value) {
            addCriterion("id_er not like", value, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdErIn(List<String> values) {
            addCriterion("id_er in", values, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdErNotIn(List<String> values) {
            addCriterion("id_er not in", values, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdErBetween(String value1, String value2) {
            addCriterion("id_er between", value1, value2, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdErNotBetween(String value1, String value2) {
            addCriterion("id_er not between", value1, value2, "idEr");
            return (Criteria) this;
        }

        public Criteria andIdQIsNull() {
            addCriterion("id_q is null");
            return (Criteria) this;
        }

        public Criteria andIdQIsNotNull() {
            addCriterion("id_q is not null");
            return (Criteria) this;
        }

        public Criteria andIdQEqualTo(String value) {
            addCriterion("id_q =", value, "idQ");
            return (Criteria) this;
        }

        public Criteria andIdQNotEqualTo(String value) {
            addCriterion("id_q <>", value, "idQ");
            return (Criteria) this;
        }

        public Criteria andIdQGreaterThan(String value) {
            addCriterion("id_q >", value, "idQ");
            return (Criteria) this;
        }

        public Criteria andIdQGreaterThanOrEqualTo(String value) {
            addCriterion("id_q >=", value, "idQ");
            return (Criteria) this;
        }

        public Criteria andIdQLessThan(String value) {
            addCriterion("id_q <", value, "idQ");
            return (Criteria) this;
        }

        public Criteria andIdQLessThanOrEqualTo(String value) {
            addCriterion("id_q <=", value, "idQ");
            return (Criteria) this;
        }

        public Criteria andIdQLike(String value) {
            addCriterion("id_q like", value, "idQ");
            return (Criteria) this;
        }

        public Criteria andIdQNotLike(String value) {
            addCriterion("id_q not like", value, "idQ");
            return (Criteria) this;
        }

        public Criteria andIdQIn(List<String> values) {
            addCriterion("id_q in", values, "idQ");
            return (Criteria) this;
        }

        public Criteria andIdQNotIn(List<String> values) {
            addCriterion("id_q not in", values, "idQ");
            return (Criteria) this;
        }

        public Criteria andIdQBetween(String value1, String value2) {
            addCriterion("id_q between", value1, value2, "idQ");
            return (Criteria) this;
        }

        public Criteria andIdQNotBetween(String value1, String value2) {
            addCriterion("id_q not between", value1, value2, "idQ");
            return (Criteria) this;
        }

        public Criteria andScoreHtpIsNull() {
            addCriterion("score_htp is null");
            return (Criteria) this;
        }

        public Criteria andScoreHtpIsNotNull() {
            addCriterion("score_htp is not null");
            return (Criteria) this;
        }

        public Criteria andScoreHtpEqualTo(String value) {
            addCriterion("score_htp =", value, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andScoreHtpNotEqualTo(String value) {
            addCriterion("score_htp <>", value, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andScoreHtpGreaterThan(String value) {
            addCriterion("score_htp >", value, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andScoreHtpGreaterThanOrEqualTo(String value) {
            addCriterion("score_htp >=", value, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andScoreHtpLessThan(String value) {
            addCriterion("score_htp <", value, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andScoreHtpLessThanOrEqualTo(String value) {
            addCriterion("score_htp <=", value, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andScoreHtpLike(String value) {
            addCriterion("score_htp like", value, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andScoreHtpNotLike(String value) {
            addCriterion("score_htp not like", value, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andScoreHtpIn(List<String> values) {
            addCriterion("score_htp in", values, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andScoreHtpNotIn(List<String> values) {
            addCriterion("score_htp not in", values, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andScoreHtpBetween(String value1, String value2) {
            addCriterion("score_htp between", value1, value2, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andScoreHtpNotBetween(String value1, String value2) {
            addCriterion("score_htp not between", value1, value2, "scoreHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpIsNull() {
            addCriterion("timeconsuming_htp is null");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpIsNotNull() {
            addCriterion("timeconsuming_htp is not null");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpEqualTo(String value) {
            addCriterion("timeconsuming_htp =", value, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpNotEqualTo(String value) {
            addCriterion("timeconsuming_htp <>", value, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpGreaterThan(String value) {
            addCriterion("timeconsuming_htp >", value, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpGreaterThanOrEqualTo(String value) {
            addCriterion("timeconsuming_htp >=", value, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpLessThan(String value) {
            addCriterion("timeconsuming_htp <", value, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpLessThanOrEqualTo(String value) {
            addCriterion("timeconsuming_htp <=", value, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpLike(String value) {
            addCriterion("timeconsuming_htp like", value, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpNotLike(String value) {
            addCriterion("timeconsuming_htp not like", value, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpIn(List<String> values) {
            addCriterion("timeconsuming_htp in", values, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpNotIn(List<String> values) {
            addCriterion("timeconsuming_htp not in", values, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpBetween(String value1, String value2) {
            addCriterion("timeconsuming_htp between", value1, value2, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeconsumingHtpNotBetween(String value1, String value2) {
            addCriterion("timeconsuming_htp not between", value1, value2, "timeconsumingHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpIsNull() {
            addCriterion("timeproportion_htp is null");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpIsNotNull() {
            addCriterion("timeproportion_htp is not null");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpEqualTo(String value) {
            addCriterion("timeproportion_htp =", value, "timeproportionHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpNotEqualTo(String value) {
            addCriterion("timeproportion_htp <>", value, "timeproportionHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpGreaterThan(String value) {
            addCriterion("timeproportion_htp >", value, "timeproportionHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpGreaterThanOrEqualTo(String value) {
            addCriterion("timeproportion_htp >=", value, "timeproportionHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpLessThan(String value) {
            addCriterion("timeproportion_htp <", value, "timeproportionHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpLessThanOrEqualTo(String value) {
            addCriterion("timeproportion_htp <=", value, "timeproportionHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpLike(String value) {
            addCriterion("timeproportion_htp like", value, "timeproportionHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpNotLike(String value) {
            addCriterion("timeproportion_htp not like", value, "timeproportionHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpIn(List<String> values) {
            addCriterion("timeproportion_htp in", values, "timeproportionHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpNotIn(List<String> values) {
            addCriterion("timeproportion_htp not in", values, "timeproportionHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpBetween(String value1, String value2) {
            addCriterion("timeproportion_htp between", value1, value2, "timeproportionHtp");
            return (Criteria) this;
        }

        public Criteria andTimeproportionHtpNotBetween(String value1, String value2) {
            addCriterion("timeproportion_htp not between", value1, value2, "timeproportionHtp");
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