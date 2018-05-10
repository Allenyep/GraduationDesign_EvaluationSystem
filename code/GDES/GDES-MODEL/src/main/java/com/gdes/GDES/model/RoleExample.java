package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andIdRIsNull() {
            addCriterion("id_r is null");
            return (Criteria) this;
        }

        public Criteria andIdRIsNotNull() {
            addCriterion("id_r is not null");
            return (Criteria) this;
        }

        public Criteria andIdREqualTo(Integer value) {
            addCriterion("id_r =", value, "idR");
            return (Criteria) this;
        }

        public Criteria andIdRNotEqualTo(Integer value) {
            addCriterion("id_r <>", value, "idR");
            return (Criteria) this;
        }

        public Criteria andIdRGreaterThan(Integer value) {
            addCriterion("id_r >", value, "idR");
            return (Criteria) this;
        }

        public Criteria andIdRGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_r >=", value, "idR");
            return (Criteria) this;
        }

        public Criteria andIdRLessThan(Integer value) {
            addCriterion("id_r <", value, "idR");
            return (Criteria) this;
        }

        public Criteria andIdRLessThanOrEqualTo(Integer value) {
            addCriterion("id_r <=", value, "idR");
            return (Criteria) this;
        }

        public Criteria andIdRIn(List<Integer> values) {
            addCriterion("id_r in", values, "idR");
            return (Criteria) this;
        }

        public Criteria andIdRNotIn(List<Integer> values) {
            addCriterion("id_r not in", values, "idR");
            return (Criteria) this;
        }

        public Criteria andIdRBetween(Integer value1, Integer value2) {
            addCriterion("id_r between", value1, value2, "idR");
            return (Criteria) this;
        }

        public Criteria andIdRNotBetween(Integer value1, Integer value2) {
            addCriterion("id_r not between", value1, value2, "idR");
            return (Criteria) this;
        }

        public Criteria andJsmIsNull() {
            addCriterion("jsm is null");
            return (Criteria) this;
        }

        public Criteria andJsmIsNotNull() {
            addCriterion("jsm is not null");
            return (Criteria) this;
        }

        public Criteria andJsmEqualTo(String value) {
            addCriterion("jsm =", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmNotEqualTo(String value) {
            addCriterion("jsm <>", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmGreaterThan(String value) {
            addCriterion("jsm >", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmGreaterThanOrEqualTo(String value) {
            addCriterion("jsm >=", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmLessThan(String value) {
            addCriterion("jsm <", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmLessThanOrEqualTo(String value) {
            addCriterion("jsm <=", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmLike(String value) {
            addCriterion("jsm like", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmNotLike(String value) {
            addCriterion("jsm not like", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmIn(List<String> values) {
            addCriterion("jsm in", values, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmNotIn(List<String> values) {
            addCriterion("jsm not in", values, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmBetween(String value1, String value2) {
            addCriterion("jsm between", value1, value2, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmNotBetween(String value1, String value2) {
            addCriterion("jsm not between", value1, value2, "jsm");
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