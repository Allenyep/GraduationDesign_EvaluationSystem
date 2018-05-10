package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class AbilitypointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AbilitypointExample() {
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

        public Criteria andNameApIsNull() {
            addCriterion("name_ap is null");
            return (Criteria) this;
        }

        public Criteria andNameApIsNotNull() {
            addCriterion("name_ap is not null");
            return (Criteria) this;
        }

        public Criteria andNameApEqualTo(String value) {
            addCriterion("name_ap =", value, "nameAp");
            return (Criteria) this;
        }

        public Criteria andNameApNotEqualTo(String value) {
            addCriterion("name_ap <>", value, "nameAp");
            return (Criteria) this;
        }

        public Criteria andNameApGreaterThan(String value) {
            addCriterion("name_ap >", value, "nameAp");
            return (Criteria) this;
        }

        public Criteria andNameApGreaterThanOrEqualTo(String value) {
            addCriterion("name_ap >=", value, "nameAp");
            return (Criteria) this;
        }

        public Criteria andNameApLessThan(String value) {
            addCriterion("name_ap <", value, "nameAp");
            return (Criteria) this;
        }

        public Criteria andNameApLessThanOrEqualTo(String value) {
            addCriterion("name_ap <=", value, "nameAp");
            return (Criteria) this;
        }

        public Criteria andNameApLike(String value) {
            addCriterion("name_ap like", value, "nameAp");
            return (Criteria) this;
        }

        public Criteria andNameApNotLike(String value) {
            addCriterion("name_ap not like", value, "nameAp");
            return (Criteria) this;
        }

        public Criteria andNameApIn(List<String> values) {
            addCriterion("name_ap in", values, "nameAp");
            return (Criteria) this;
        }

        public Criteria andNameApNotIn(List<String> values) {
            addCriterion("name_ap not in", values, "nameAp");
            return (Criteria) this;
        }

        public Criteria andNameApBetween(String value1, String value2) {
            addCriterion("name_ap between", value1, value2, "nameAp");
            return (Criteria) this;
        }

        public Criteria andNameApNotBetween(String value1, String value2) {
            addCriterion("name_ap not between", value1, value2, "nameAp");
            return (Criteria) this;
        }

        public Criteria andAspectApIsNull() {
            addCriterion("aspect_ap is null");
            return (Criteria) this;
        }

        public Criteria andAspectApIsNotNull() {
            addCriterion("aspect_ap is not null");
            return (Criteria) this;
        }

        public Criteria andAspectApEqualTo(String value) {
            addCriterion("aspect_ap =", value, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andAspectApNotEqualTo(String value) {
            addCriterion("aspect_ap <>", value, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andAspectApGreaterThan(String value) {
            addCriterion("aspect_ap >", value, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andAspectApGreaterThanOrEqualTo(String value) {
            addCriterion("aspect_ap >=", value, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andAspectApLessThan(String value) {
            addCriterion("aspect_ap <", value, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andAspectApLessThanOrEqualTo(String value) {
            addCriterion("aspect_ap <=", value, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andAspectApLike(String value) {
            addCriterion("aspect_ap like", value, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andAspectApNotLike(String value) {
            addCriterion("aspect_ap not like", value, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andAspectApIn(List<String> values) {
            addCriterion("aspect_ap in", values, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andAspectApNotIn(List<String> values) {
            addCriterion("aspect_ap not in", values, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andAspectApBetween(String value1, String value2) {
            addCriterion("aspect_ap between", value1, value2, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andAspectApNotBetween(String value1, String value2) {
            addCriterion("aspect_ap not between", value1, value2, "aspectAp");
            return (Criteria) this;
        }

        public Criteria andClassApIsNull() {
            addCriterion("class_ap is null");
            return (Criteria) this;
        }

        public Criteria andClassApIsNotNull() {
            addCriterion("class_ap is not null");
            return (Criteria) this;
        }

        public Criteria andClassApEqualTo(String value) {
            addCriterion("class_ap =", value, "classAp");
            return (Criteria) this;
        }

        public Criteria andClassApNotEqualTo(String value) {
            addCriterion("class_ap <>", value, "classAp");
            return (Criteria) this;
        }

        public Criteria andClassApGreaterThan(String value) {
            addCriterion("class_ap >", value, "classAp");
            return (Criteria) this;
        }

        public Criteria andClassApGreaterThanOrEqualTo(String value) {
            addCriterion("class_ap >=", value, "classAp");
            return (Criteria) this;
        }

        public Criteria andClassApLessThan(String value) {
            addCriterion("class_ap <", value, "classAp");
            return (Criteria) this;
        }

        public Criteria andClassApLessThanOrEqualTo(String value) {
            addCriterion("class_ap <=", value, "classAp");
            return (Criteria) this;
        }

        public Criteria andClassApLike(String value) {
            addCriterion("class_ap like", value, "classAp");
            return (Criteria) this;
        }

        public Criteria andClassApNotLike(String value) {
            addCriterion("class_ap not like", value, "classAp");
            return (Criteria) this;
        }

        public Criteria andClassApIn(List<String> values) {
            addCriterion("class_ap in", values, "classAp");
            return (Criteria) this;
        }

        public Criteria andClassApNotIn(List<String> values) {
            addCriterion("class_ap not in", values, "classAp");
            return (Criteria) this;
        }

        public Criteria andClassApBetween(String value1, String value2) {
            addCriterion("class_ap between", value1, value2, "classAp");
            return (Criteria) this;
        }

        public Criteria andClassApNotBetween(String value1, String value2) {
            addCriterion("class_ap not between", value1, value2, "classAp");
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