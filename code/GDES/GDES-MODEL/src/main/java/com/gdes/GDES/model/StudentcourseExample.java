package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class StudentcourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentcourseExample() {
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

        public Criteria andIdCIsNull() {
            addCriterion("id_c is null");
            return (Criteria) this;
        }

        public Criteria andIdCIsNotNull() {
            addCriterion("id_c is not null");
            return (Criteria) this;
        }

        public Criteria andIdCEqualTo(String value) {
            addCriterion("id_c =", value, "idC");
            return (Criteria) this;
        }

        public Criteria andIdCNotEqualTo(String value) {
            addCriterion("id_c <>", value, "idC");
            return (Criteria) this;
        }

        public Criteria andIdCGreaterThan(String value) {
            addCriterion("id_c >", value, "idC");
            return (Criteria) this;
        }

        public Criteria andIdCGreaterThanOrEqualTo(String value) {
            addCriterion("id_c >=", value, "idC");
            return (Criteria) this;
        }

        public Criteria andIdCLessThan(String value) {
            addCriterion("id_c <", value, "idC");
            return (Criteria) this;
        }

        public Criteria andIdCLessThanOrEqualTo(String value) {
            addCriterion("id_c <=", value, "idC");
            return (Criteria) this;
        }

        public Criteria andIdCLike(String value) {
            addCriterion("id_c like", value, "idC");
            return (Criteria) this;
        }

        public Criteria andIdCNotLike(String value) {
            addCriterion("id_c not like", value, "idC");
            return (Criteria) this;
        }

        public Criteria andIdCIn(List<String> values) {
            addCriterion("id_c in", values, "idC");
            return (Criteria) this;
        }

        public Criteria andIdCNotIn(List<String> values) {
            addCriterion("id_c not in", values, "idC");
            return (Criteria) this;
        }

        public Criteria andIdCBetween(String value1, String value2) {
            addCriterion("id_c between", value1, value2, "idC");
            return (Criteria) this;
        }

        public Criteria andIdCNotBetween(String value1, String value2) {
            addCriterion("id_c not between", value1, value2, "idC");
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