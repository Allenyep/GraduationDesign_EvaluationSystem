package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionstyleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionstyleExample() {
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

        public Criteria andStyleQIsNull() {
            addCriterion("style_q is null");
            return (Criteria) this;
        }

        public Criteria andStyleQIsNotNull() {
            addCriterion("style_q is not null");
            return (Criteria) this;
        }

        public Criteria andStyleQEqualTo(String value) {
            addCriterion("style_q =", value, "styleQ");
            return (Criteria) this;
        }

        public Criteria andStyleQNotEqualTo(String value) {
            addCriterion("style_q <>", value, "styleQ");
            return (Criteria) this;
        }

        public Criteria andStyleQGreaterThan(String value) {
            addCriterion("style_q >", value, "styleQ");
            return (Criteria) this;
        }

        public Criteria andStyleQGreaterThanOrEqualTo(String value) {
            addCriterion("style_q >=", value, "styleQ");
            return (Criteria) this;
        }

        public Criteria andStyleQLessThan(String value) {
            addCriterion("style_q <", value, "styleQ");
            return (Criteria) this;
        }

        public Criteria andStyleQLessThanOrEqualTo(String value) {
            addCriterion("style_q <=", value, "styleQ");
            return (Criteria) this;
        }

        public Criteria andStyleQLike(String value) {
            addCriterion("style_q like", value, "styleQ");
            return (Criteria) this;
        }

        public Criteria andStyleQNotLike(String value) {
            addCriterion("style_q not like", value, "styleQ");
            return (Criteria) this;
        }

        public Criteria andStyleQIn(List<String> values) {
            addCriterion("style_q in", values, "styleQ");
            return (Criteria) this;
        }

        public Criteria andStyleQNotIn(List<String> values) {
            addCriterion("style_q not in", values, "styleQ");
            return (Criteria) this;
        }

        public Criteria andStyleQBetween(String value1, String value2) {
            addCriterion("style_q between", value1, value2, "styleQ");
            return (Criteria) this;
        }

        public Criteria andStyleQNotBetween(String value1, String value2) {
            addCriterion("style_q not between", value1, value2, "styleQ");
            return (Criteria) this;
        }

        public Criteria andNameQsIsNull() {
            addCriterion("name_qs is null");
            return (Criteria) this;
        }

        public Criteria andNameQsIsNotNull() {
            addCriterion("name_qs is not null");
            return (Criteria) this;
        }

        public Criteria andNameQsEqualTo(String value) {
            addCriterion("name_qs =", value, "nameQs");
            return (Criteria) this;
        }

        public Criteria andNameQsNotEqualTo(String value) {
            addCriterion("name_qs <>", value, "nameQs");
            return (Criteria) this;
        }

        public Criteria andNameQsGreaterThan(String value) {
            addCriterion("name_qs >", value, "nameQs");
            return (Criteria) this;
        }

        public Criteria andNameQsGreaterThanOrEqualTo(String value) {
            addCriterion("name_qs >=", value, "nameQs");
            return (Criteria) this;
        }

        public Criteria andNameQsLessThan(String value) {
            addCriterion("name_qs <", value, "nameQs");
            return (Criteria) this;
        }

        public Criteria andNameQsLessThanOrEqualTo(String value) {
            addCriterion("name_qs <=", value, "nameQs");
            return (Criteria) this;
        }

        public Criteria andNameQsLike(String value) {
            addCriterion("name_qs like", value, "nameQs");
            return (Criteria) this;
        }

        public Criteria andNameQsNotLike(String value) {
            addCriterion("name_qs not like", value, "nameQs");
            return (Criteria) this;
        }

        public Criteria andNameQsIn(List<String> values) {
            addCriterion("name_qs in", values, "nameQs");
            return (Criteria) this;
        }

        public Criteria andNameQsNotIn(List<String> values) {
            addCriterion("name_qs not in", values, "nameQs");
            return (Criteria) this;
        }

        public Criteria andNameQsBetween(String value1, String value2) {
            addCriterion("name_qs between", value1, value2, "nameQs");
            return (Criteria) this;
        }

        public Criteria andNameQsNotBetween(String value1, String value2) {
            addCriterion("name_qs not between", value1, value2, "nameQs");
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