package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class ScoredetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoredetailExample() {
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

        public Criteria andIdApIsNull() {
            addCriterion("id_ap is null");
            return (Criteria) this;
        }

        public Criteria andIdApIsNotNull() {
            addCriterion("id_ap is not null");
            return (Criteria) this;
        }

        public Criteria andIdApEqualTo(Integer value) {
            addCriterion("id_ap =", value, "idAp");
            return (Criteria) this;
        }

        public Criteria andIdApNotEqualTo(Integer value) {
            addCriterion("id_ap <>", value, "idAp");
            return (Criteria) this;
        }

        public Criteria andIdApGreaterThan(Integer value) {
            addCriterion("id_ap >", value, "idAp");
            return (Criteria) this;
        }

        public Criteria andIdApGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_ap >=", value, "idAp");
            return (Criteria) this;
        }

        public Criteria andIdApLessThan(Integer value) {
            addCriterion("id_ap <", value, "idAp");
            return (Criteria) this;
        }

        public Criteria andIdApLessThanOrEqualTo(Integer value) {
            addCriterion("id_ap <=", value, "idAp");
            return (Criteria) this;
        }

        public Criteria andIdApIn(List<Integer> values) {
            addCriterion("id_ap in", values, "idAp");
            return (Criteria) this;
        }

        public Criteria andIdApNotIn(List<Integer> values) {
            addCriterion("id_ap not in", values, "idAp");
            return (Criteria) this;
        }

        public Criteria andIdApBetween(Integer value1, Integer value2) {
            addCriterion("id_ap between", value1, value2, "idAp");
            return (Criteria) this;
        }

        public Criteria andIdApNotBetween(Integer value1, Integer value2) {
            addCriterion("id_ap not between", value1, value2, "idAp");
            return (Criteria) this;
        }

        public Criteria andScoreSdIsNull() {
            addCriterion("score_sd is null");
            return (Criteria) this;
        }

        public Criteria andScoreSdIsNotNull() {
            addCriterion("score_sd is not null");
            return (Criteria) this;
        }

        public Criteria andScoreSdEqualTo(String value) {
            addCriterion("score_sd =", value, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andScoreSdNotEqualTo(String value) {
            addCriterion("score_sd <>", value, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andScoreSdGreaterThan(String value) {
            addCriterion("score_sd >", value, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andScoreSdGreaterThanOrEqualTo(String value) {
            addCriterion("score_sd >=", value, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andScoreSdLessThan(String value) {
            addCriterion("score_sd <", value, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andScoreSdLessThanOrEqualTo(String value) {
            addCriterion("score_sd <=", value, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andScoreSdLike(String value) {
            addCriterion("score_sd like", value, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andScoreSdNotLike(String value) {
            addCriterion("score_sd not like", value, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andScoreSdIn(List<String> values) {
            addCriterion("score_sd in", values, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andScoreSdNotIn(List<String> values) {
            addCriterion("score_sd not in", values, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andScoreSdBetween(String value1, String value2) {
            addCriterion("score_sd between", value1, value2, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andScoreSdNotBetween(String value1, String value2) {
            addCriterion("score_sd not between", value1, value2, "scoreSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdIsNull() {
            addCriterion("time_sd is null");
            return (Criteria) this;
        }

        public Criteria andTimeSdIsNotNull() {
            addCriterion("time_sd is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSdEqualTo(String value) {
            addCriterion("time_sd =", value, "timeSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdNotEqualTo(String value) {
            addCriterion("time_sd <>", value, "timeSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdGreaterThan(String value) {
            addCriterion("time_sd >", value, "timeSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdGreaterThanOrEqualTo(String value) {
            addCriterion("time_sd >=", value, "timeSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdLessThan(String value) {
            addCriterion("time_sd <", value, "timeSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdLessThanOrEqualTo(String value) {
            addCriterion("time_sd <=", value, "timeSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdLike(String value) {
            addCriterion("time_sd like", value, "timeSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdNotLike(String value) {
            addCriterion("time_sd not like", value, "timeSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdIn(List<String> values) {
            addCriterion("time_sd in", values, "timeSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdNotIn(List<String> values) {
            addCriterion("time_sd not in", values, "timeSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdBetween(String value1, String value2) {
            addCriterion("time_sd between", value1, value2, "timeSd");
            return (Criteria) this;
        }

        public Criteria andTimeSdNotBetween(String value1, String value2) {
            addCriterion("time_sd not between", value1, value2, "timeSd");
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