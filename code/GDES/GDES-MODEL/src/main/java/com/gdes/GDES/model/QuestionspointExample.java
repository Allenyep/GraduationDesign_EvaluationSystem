package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionspointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionspointExample() {
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

        public Criteria andIdKpIsNull() {
            addCriterion("id_kp is null");
            return (Criteria) this;
        }

        public Criteria andIdKpIsNotNull() {
            addCriterion("id_kp is not null");
            return (Criteria) this;
        }

        public Criteria andIdKpEqualTo(Integer value) {
            addCriterion("id_kp =", value, "idKp");
            return (Criteria) this;
        }

        public Criteria andIdKpNotEqualTo(Integer value) {
            addCriterion("id_kp <>", value, "idKp");
            return (Criteria) this;
        }

        public Criteria andIdKpGreaterThan(Integer value) {
            addCriterion("id_kp >", value, "idKp");
            return (Criteria) this;
        }

        public Criteria andIdKpGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_kp >=", value, "idKp");
            return (Criteria) this;
        }

        public Criteria andIdKpLessThan(Integer value) {
            addCriterion("id_kp <", value, "idKp");
            return (Criteria) this;
        }

        public Criteria andIdKpLessThanOrEqualTo(Integer value) {
            addCriterion("id_kp <=", value, "idKp");
            return (Criteria) this;
        }

        public Criteria andIdKpIn(List<Integer> values) {
            addCriterion("id_kp in", values, "idKp");
            return (Criteria) this;
        }

        public Criteria andIdKpNotIn(List<Integer> values) {
            addCriterion("id_kp not in", values, "idKp");
            return (Criteria) this;
        }

        public Criteria andIdKpBetween(Integer value1, Integer value2) {
            addCriterion("id_kp between", value1, value2, "idKp");
            return (Criteria) this;
        }

        public Criteria andIdKpNotBetween(Integer value1, Integer value2) {
            addCriterion("id_kp not between", value1, value2, "idKp");
            return (Criteria) this;
        }

        public Criteria andProportionQpIsNull() {
            addCriterion("proportion_qp is null");
            return (Criteria) this;
        }

        public Criteria andProportionQpIsNotNull() {
            addCriterion("proportion_qp is not null");
            return (Criteria) this;
        }

        public Criteria andProportionQpEqualTo(String value) {
            addCriterion("proportion_qp =", value, "proportionQp");
            return (Criteria) this;
        }

        public Criteria andProportionQpNotEqualTo(String value) {
            addCriterion("proportion_qp <>", value, "proportionQp");
            return (Criteria) this;
        }

        public Criteria andProportionQpGreaterThan(String value) {
            addCriterion("proportion_qp >", value, "proportionQp");
            return (Criteria) this;
        }

        public Criteria andProportionQpGreaterThanOrEqualTo(String value) {
            addCriterion("proportion_qp >=", value, "proportionQp");
            return (Criteria) this;
        }

        public Criteria andProportionQpLessThan(String value) {
            addCriterion("proportion_qp <", value, "proportionQp");
            return (Criteria) this;
        }

        public Criteria andProportionQpLessThanOrEqualTo(String value) {
            addCriterion("proportion_qp <=", value, "proportionQp");
            return (Criteria) this;
        }

        public Criteria andProportionQpLike(String value) {
            addCriterion("proportion_qp like", value, "proportionQp");
            return (Criteria) this;
        }

        public Criteria andProportionQpNotLike(String value) {
            addCriterion("proportion_qp not like", value, "proportionQp");
            return (Criteria) this;
        }

        public Criteria andProportionQpIn(List<String> values) {
            addCriterion("proportion_qp in", values, "proportionQp");
            return (Criteria) this;
        }

        public Criteria andProportionQpNotIn(List<String> values) {
            addCriterion("proportion_qp not in", values, "proportionQp");
            return (Criteria) this;
        }

        public Criteria andProportionQpBetween(String value1, String value2) {
            addCriterion("proportion_qp between", value1, value2, "proportionQp");
            return (Criteria) this;
        }

        public Criteria andProportionQpNotBetween(String value1, String value2) {
            addCriterion("proportion_qp not between", value1, value2, "proportionQp");
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