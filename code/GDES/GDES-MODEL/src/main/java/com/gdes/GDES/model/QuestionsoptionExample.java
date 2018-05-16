package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionsoptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionsoptionExample() {
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

        public Criteria andIdOIsNull() {
            addCriterion("id_o is null");
            return (Criteria) this;
        }

        public Criteria andIdOIsNotNull() {
            addCriterion("id_o is not null");
            return (Criteria) this;
        }

        public Criteria andIdOEqualTo(Integer value) {
            addCriterion("id_o =", value, "idO");
            return (Criteria) this;
        }

        public Criteria andIdONotEqualTo(Integer value) {
            addCriterion("id_o <>", value, "idO");
            return (Criteria) this;
        }

        public Criteria andIdOGreaterThan(Integer value) {
            addCriterion("id_o >", value, "idO");
            return (Criteria) this;
        }

        public Criteria andIdOGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_o >=", value, "idO");
            return (Criteria) this;
        }

        public Criteria andIdOLessThan(Integer value) {
            addCriterion("id_o <", value, "idO");
            return (Criteria) this;
        }

        public Criteria andIdOLessThanOrEqualTo(Integer value) {
            addCriterion("id_o <=", value, "idO");
            return (Criteria) this;
        }

        public Criteria andIdOIn(List<Integer> values) {
            addCriterion("id_o in", values, "idO");
            return (Criteria) this;
        }

        public Criteria andIdONotIn(List<Integer> values) {
            addCriterion("id_o not in", values, "idO");
            return (Criteria) this;
        }

        public Criteria andIdOBetween(Integer value1, Integer value2) {
            addCriterion("id_o between", value1, value2, "idO");
            return (Criteria) this;
        }

        public Criteria andIdONotBetween(Integer value1, Integer value2) {
            addCriterion("id_o not between", value1, value2, "idO");
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

        public Criteria andContextOIsNull() {
            addCriterion("context_o is null");
            return (Criteria) this;
        }

        public Criteria andContextOIsNotNull() {
            addCriterion("context_o is not null");
            return (Criteria) this;
        }

        public Criteria andContextOEqualTo(String value) {
            addCriterion("context_o =", value, "contextO");
            return (Criteria) this;
        }

        public Criteria andContextONotEqualTo(String value) {
            addCriterion("context_o <>", value, "contextO");
            return (Criteria) this;
        }

        public Criteria andContextOGreaterThan(String value) {
            addCriterion("context_o >", value, "contextO");
            return (Criteria) this;
        }

        public Criteria andContextOGreaterThanOrEqualTo(String value) {
            addCriterion("context_o >=", value, "contextO");
            return (Criteria) this;
        }

        public Criteria andContextOLessThan(String value) {
            addCriterion("context_o <", value, "contextO");
            return (Criteria) this;
        }

        public Criteria andContextOLessThanOrEqualTo(String value) {
            addCriterion("context_o <=", value, "contextO");
            return (Criteria) this;
        }

        public Criteria andContextOLike(String value) {
            addCriterion("context_o like", value, "contextO");
            return (Criteria) this;
        }

        public Criteria andContextONotLike(String value) {
            addCriterion("context_o not like", value, "contextO");
            return (Criteria) this;
        }

        public Criteria andContextOIn(List<String> values) {
            addCriterion("context_o in", values, "contextO");
            return (Criteria) this;
        }

        public Criteria andContextONotIn(List<String> values) {
            addCriterion("context_o not in", values, "contextO");
            return (Criteria) this;
        }

        public Criteria andContextOBetween(String value1, String value2) {
            addCriterion("context_o between", value1, value2, "contextO");
            return (Criteria) this;
        }

        public Criteria andContextONotBetween(String value1, String value2) {
            addCriterion("context_o not between", value1, value2, "contextO");
            return (Criteria) this;
        }

        public Criteria andIstrueOIsNull() {
            addCriterion("istrue_o is null");
            return (Criteria) this;
        }

        public Criteria andIstrueOIsNotNull() {
            addCriterion("istrue_o is not null");
            return (Criteria) this;
        }

        public Criteria andIstrueOEqualTo(Boolean value) {
            addCriterion("istrue_o =", value, "istrueO");
            return (Criteria) this;
        }

        public Criteria andIstrueONotEqualTo(Boolean value) {
            addCriterion("istrue_o <>", value, "istrueO");
            return (Criteria) this;
        }

        public Criteria andIstrueOGreaterThan(Boolean value) {
            addCriterion("istrue_o >", value, "istrueO");
            return (Criteria) this;
        }

        public Criteria andIstrueOGreaterThanOrEqualTo(Boolean value) {
            addCriterion("istrue_o >=", value, "istrueO");
            return (Criteria) this;
        }

        public Criteria andIstrueOLessThan(Boolean value) {
            addCriterion("istrue_o <", value, "istrueO");
            return (Criteria) this;
        }

        public Criteria andIstrueOLessThanOrEqualTo(Boolean value) {
            addCriterion("istrue_o <=", value, "istrueO");
            return (Criteria) this;
        }

        public Criteria andIstrueOIn(List<Boolean> values) {
            addCriterion("istrue_o in", values, "istrueO");
            return (Criteria) this;
        }

        public Criteria andIstrueONotIn(List<Boolean> values) {
            addCriterion("istrue_o not in", values, "istrueO");
            return (Criteria) this;
        }

        public Criteria andIstrueOBetween(Boolean value1, Boolean value2) {
            addCriterion("istrue_o between", value1, value2, "istrueO");
            return (Criteria) this;
        }

        public Criteria andIstrueONotBetween(Boolean value1, Boolean value2) {
            addCriterion("istrue_o not between", value1, value2, "istrueO");
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