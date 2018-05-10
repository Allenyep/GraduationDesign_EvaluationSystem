package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class StudentpostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentpostExample() {
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

        public Criteria andIdPIsNull() {
            addCriterion("id_p is null");
            return (Criteria) this;
        }

        public Criteria andIdPIsNotNull() {
            addCriterion("id_p is not null");
            return (Criteria) this;
        }

        public Criteria andIdPEqualTo(Integer value) {
            addCriterion("id_p =", value, "idP");
            return (Criteria) this;
        }

        public Criteria andIdPNotEqualTo(Integer value) {
            addCriterion("id_p <>", value, "idP");
            return (Criteria) this;
        }

        public Criteria andIdPGreaterThan(Integer value) {
            addCriterion("id_p >", value, "idP");
            return (Criteria) this;
        }

        public Criteria andIdPGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_p >=", value, "idP");
            return (Criteria) this;
        }

        public Criteria andIdPLessThan(Integer value) {
            addCriterion("id_p <", value, "idP");
            return (Criteria) this;
        }

        public Criteria andIdPLessThanOrEqualTo(Integer value) {
            addCriterion("id_p <=", value, "idP");
            return (Criteria) this;
        }

        public Criteria andIdPIn(List<Integer> values) {
            addCriterion("id_p in", values, "idP");
            return (Criteria) this;
        }

        public Criteria andIdPNotIn(List<Integer> values) {
            addCriterion("id_p not in", values, "idP");
            return (Criteria) this;
        }

        public Criteria andIdPBetween(Integer value1, Integer value2) {
            addCriterion("id_p between", value1, value2, "idP");
            return (Criteria) this;
        }

        public Criteria andIdPNotBetween(Integer value1, Integer value2) {
            addCriterion("id_p not between", value1, value2, "idP");
            return (Criteria) this;
        }

        public Criteria andScoreSpIsNull() {
            addCriterion("score_sp is null");
            return (Criteria) this;
        }

        public Criteria andScoreSpIsNotNull() {
            addCriterion("score_sp is not null");
            return (Criteria) this;
        }

        public Criteria andScoreSpEqualTo(String value) {
            addCriterion("score_sp =", value, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andScoreSpNotEqualTo(String value) {
            addCriterion("score_sp <>", value, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andScoreSpGreaterThan(String value) {
            addCriterion("score_sp >", value, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andScoreSpGreaterThanOrEqualTo(String value) {
            addCriterion("score_sp >=", value, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andScoreSpLessThan(String value) {
            addCriterion("score_sp <", value, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andScoreSpLessThanOrEqualTo(String value) {
            addCriterion("score_sp <=", value, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andScoreSpLike(String value) {
            addCriterion("score_sp like", value, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andScoreSpNotLike(String value) {
            addCriterion("score_sp not like", value, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andScoreSpIn(List<String> values) {
            addCriterion("score_sp in", values, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andScoreSpNotIn(List<String> values) {
            addCriterion("score_sp not in", values, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andScoreSpBetween(String value1, String value2) {
            addCriterion("score_sp between", value1, value2, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andScoreSpNotBetween(String value1, String value2) {
            addCriterion("score_sp not between", value1, value2, "scoreSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpIsNull() {
            addCriterion("time_sp is null");
            return (Criteria) this;
        }

        public Criteria andTimeSpIsNotNull() {
            addCriterion("time_sp is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSpEqualTo(String value) {
            addCriterion("time_sp =", value, "timeSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpNotEqualTo(String value) {
            addCriterion("time_sp <>", value, "timeSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpGreaterThan(String value) {
            addCriterion("time_sp >", value, "timeSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpGreaterThanOrEqualTo(String value) {
            addCriterion("time_sp >=", value, "timeSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpLessThan(String value) {
            addCriterion("time_sp <", value, "timeSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpLessThanOrEqualTo(String value) {
            addCriterion("time_sp <=", value, "timeSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpLike(String value) {
            addCriterion("time_sp like", value, "timeSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpNotLike(String value) {
            addCriterion("time_sp not like", value, "timeSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpIn(List<String> values) {
            addCriterion("time_sp in", values, "timeSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpNotIn(List<String> values) {
            addCriterion("time_sp not in", values, "timeSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpBetween(String value1, String value2) {
            addCriterion("time_sp between", value1, value2, "timeSp");
            return (Criteria) this;
        }

        public Criteria andTimeSpNotBetween(String value1, String value2) {
            addCriterion("time_sp not between", value1, value2, "timeSp");
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