package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class MajorbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MajorbExample() {
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

        public Criteria andIdMbIsNull() {
            addCriterion("id_mb is null");
            return (Criteria) this;
        }

        public Criteria andIdMbIsNotNull() {
            addCriterion("id_mb is not null");
            return (Criteria) this;
        }

        public Criteria andIdMbEqualTo(Integer value) {
            addCriterion("id_mb =", value, "idMb");
            return (Criteria) this;
        }

        public Criteria andIdMbNotEqualTo(Integer value) {
            addCriterion("id_mb <>", value, "idMb");
            return (Criteria) this;
        }

        public Criteria andIdMbGreaterThan(Integer value) {
            addCriterion("id_mb >", value, "idMb");
            return (Criteria) this;
        }

        public Criteria andIdMbGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_mb >=", value, "idMb");
            return (Criteria) this;
        }

        public Criteria andIdMbLessThan(Integer value) {
            addCriterion("id_mb <", value, "idMb");
            return (Criteria) this;
        }

        public Criteria andIdMbLessThanOrEqualTo(Integer value) {
            addCriterion("id_mb <=", value, "idMb");
            return (Criteria) this;
        }

        public Criteria andIdMbIn(List<Integer> values) {
            addCriterion("id_mb in", values, "idMb");
            return (Criteria) this;
        }

        public Criteria andIdMbNotIn(List<Integer> values) {
            addCriterion("id_mb not in", values, "idMb");
            return (Criteria) this;
        }

        public Criteria andIdMbBetween(Integer value1, Integer value2) {
            addCriterion("id_mb between", value1, value2, "idMb");
            return (Criteria) this;
        }

        public Criteria andIdMbNotBetween(Integer value1, Integer value2) {
            addCriterion("id_mb not between", value1, value2, "idMb");
            return (Criteria) this;
        }

        public Criteria andNameMbIsNull() {
            addCriterion("name_mb is null");
            return (Criteria) this;
        }

        public Criteria andNameMbIsNotNull() {
            addCriterion("name_mb is not null");
            return (Criteria) this;
        }

        public Criteria andNameMbEqualTo(String value) {
            addCriterion("name_mb =", value, "nameMb");
            return (Criteria) this;
        }

        public Criteria andNameMbNotEqualTo(String value) {
            addCriterion("name_mb <>", value, "nameMb");
            return (Criteria) this;
        }

        public Criteria andNameMbGreaterThan(String value) {
            addCriterion("name_mb >", value, "nameMb");
            return (Criteria) this;
        }

        public Criteria andNameMbGreaterThanOrEqualTo(String value) {
            addCriterion("name_mb >=", value, "nameMb");
            return (Criteria) this;
        }

        public Criteria andNameMbLessThan(String value) {
            addCriterion("name_mb <", value, "nameMb");
            return (Criteria) this;
        }

        public Criteria andNameMbLessThanOrEqualTo(String value) {
            addCriterion("name_mb <=", value, "nameMb");
            return (Criteria) this;
        }

        public Criteria andNameMbLike(String value) {
            addCriterion("name_mb like", value, "nameMb");
            return (Criteria) this;
        }

        public Criteria andNameMbNotLike(String value) {
            addCriterion("name_mb not like", value, "nameMb");
            return (Criteria) this;
        }

        public Criteria andNameMbIn(List<String> values) {
            addCriterion("name_mb in", values, "nameMb");
            return (Criteria) this;
        }

        public Criteria andNameMbNotIn(List<String> values) {
            addCriterion("name_mb not in", values, "nameMb");
            return (Criteria) this;
        }

        public Criteria andNameMbBetween(String value1, String value2) {
            addCriterion("name_mb between", value1, value2, "nameMb");
            return (Criteria) this;
        }

        public Criteria andNameMbNotBetween(String value1, String value2) {
            addCriterion("name_mb not between", value1, value2, "nameMb");
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