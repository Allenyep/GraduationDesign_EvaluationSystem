package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andNamePIsNull() {
            addCriterion("name_p is null");
            return (Criteria) this;
        }

        public Criteria andNamePIsNotNull() {
            addCriterion("name_p is not null");
            return (Criteria) this;
        }

        public Criteria andNamePEqualTo(String value) {
            addCriterion("name_p =", value, "nameP");
            return (Criteria) this;
        }

        public Criteria andNamePNotEqualTo(String value) {
            addCriterion("name_p <>", value, "nameP");
            return (Criteria) this;
        }

        public Criteria andNamePGreaterThan(String value) {
            addCriterion("name_p >", value, "nameP");
            return (Criteria) this;
        }

        public Criteria andNamePGreaterThanOrEqualTo(String value) {
            addCriterion("name_p >=", value, "nameP");
            return (Criteria) this;
        }

        public Criteria andNamePLessThan(String value) {
            addCriterion("name_p <", value, "nameP");
            return (Criteria) this;
        }

        public Criteria andNamePLessThanOrEqualTo(String value) {
            addCriterion("name_p <=", value, "nameP");
            return (Criteria) this;
        }

        public Criteria andNamePLike(String value) {
            addCriterion("name_p like", value, "nameP");
            return (Criteria) this;
        }

        public Criteria andNamePNotLike(String value) {
            addCriterion("name_p not like", value, "nameP");
            return (Criteria) this;
        }

        public Criteria andNamePIn(List<String> values) {
            addCriterion("name_p in", values, "nameP");
            return (Criteria) this;
        }

        public Criteria andNamePNotIn(List<String> values) {
            addCriterion("name_p not in", values, "nameP");
            return (Criteria) this;
        }

        public Criteria andNamePBetween(String value1, String value2) {
            addCriterion("name_p between", value1, value2, "nameP");
            return (Criteria) this;
        }

        public Criteria andNamePNotBetween(String value1, String value2) {
            addCriterion("name_p not between", value1, value2, "nameP");
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