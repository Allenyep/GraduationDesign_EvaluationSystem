package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class EvaluationrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationrecordExample() {
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

        public Criteria andBeginErIsNull() {
            addCriterion("begin_er is null");
            return (Criteria) this;
        }

        public Criteria andBeginErIsNotNull() {
            addCriterion("begin_er is not null");
            return (Criteria) this;
        }

        public Criteria andBeginErEqualTo(String value) {
            addCriterion("begin_er =", value, "beginEr");
            return (Criteria) this;
        }

        public Criteria andBeginErNotEqualTo(String value) {
            addCriterion("begin_er <>", value, "beginEr");
            return (Criteria) this;
        }

        public Criteria andBeginErGreaterThan(String value) {
            addCriterion("begin_er >", value, "beginEr");
            return (Criteria) this;
        }

        public Criteria andBeginErGreaterThanOrEqualTo(String value) {
            addCriterion("begin_er >=", value, "beginEr");
            return (Criteria) this;
        }

        public Criteria andBeginErLessThan(String value) {
            addCriterion("begin_er <", value, "beginEr");
            return (Criteria) this;
        }

        public Criteria andBeginErLessThanOrEqualTo(String value) {
            addCriterion("begin_er <=", value, "beginEr");
            return (Criteria) this;
        }

        public Criteria andBeginErLike(String value) {
            addCriterion("begin_er like", value, "beginEr");
            return (Criteria) this;
        }

        public Criteria andBeginErNotLike(String value) {
            addCriterion("begin_er not like", value, "beginEr");
            return (Criteria) this;
        }

        public Criteria andBeginErIn(List<String> values) {
            addCriterion("begin_er in", values, "beginEr");
            return (Criteria) this;
        }

        public Criteria andBeginErNotIn(List<String> values) {
            addCriterion("begin_er not in", values, "beginEr");
            return (Criteria) this;
        }

        public Criteria andBeginErBetween(String value1, String value2) {
            addCriterion("begin_er between", value1, value2, "beginEr");
            return (Criteria) this;
        }

        public Criteria andBeginErNotBetween(String value1, String value2) {
            addCriterion("begin_er not between", value1, value2, "beginEr");
            return (Criteria) this;
        }

        public Criteria andEndErIsNull() {
            addCriterion("end_er is null");
            return (Criteria) this;
        }

        public Criteria andEndErIsNotNull() {
            addCriterion("end_er is not null");
            return (Criteria) this;
        }

        public Criteria andEndErEqualTo(String value) {
            addCriterion("end_er =", value, "endEr");
            return (Criteria) this;
        }

        public Criteria andEndErNotEqualTo(String value) {
            addCriterion("end_er <>", value, "endEr");
            return (Criteria) this;
        }

        public Criteria andEndErGreaterThan(String value) {
            addCriterion("end_er >", value, "endEr");
            return (Criteria) this;
        }

        public Criteria andEndErGreaterThanOrEqualTo(String value) {
            addCriterion("end_er >=", value, "endEr");
            return (Criteria) this;
        }

        public Criteria andEndErLessThan(String value) {
            addCriterion("end_er <", value, "endEr");
            return (Criteria) this;
        }

        public Criteria andEndErLessThanOrEqualTo(String value) {
            addCriterion("end_er <=", value, "endEr");
            return (Criteria) this;
        }

        public Criteria andEndErLike(String value) {
            addCriterion("end_er like", value, "endEr");
            return (Criteria) this;
        }

        public Criteria andEndErNotLike(String value) {
            addCriterion("end_er not like", value, "endEr");
            return (Criteria) this;
        }

        public Criteria andEndErIn(List<String> values) {
            addCriterion("end_er in", values, "endEr");
            return (Criteria) this;
        }

        public Criteria andEndErNotIn(List<String> values) {
            addCriterion("end_er not in", values, "endEr");
            return (Criteria) this;
        }

        public Criteria andEndErBetween(String value1, String value2) {
            addCriterion("end_er between", value1, value2, "endEr");
            return (Criteria) this;
        }

        public Criteria andEndErNotBetween(String value1, String value2) {
            addCriterion("end_er not between", value1, value2, "endEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErIsNull() {
            addCriterion("consumption_er is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionErIsNotNull() {
            addCriterion("consumption_er is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionErEqualTo(String value) {
            addCriterion("consumption_er =", value, "consumptionEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErNotEqualTo(String value) {
            addCriterion("consumption_er <>", value, "consumptionEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErGreaterThan(String value) {
            addCriterion("consumption_er >", value, "consumptionEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErGreaterThanOrEqualTo(String value) {
            addCriterion("consumption_er >=", value, "consumptionEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErLessThan(String value) {
            addCriterion("consumption_er <", value, "consumptionEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErLessThanOrEqualTo(String value) {
            addCriterion("consumption_er <=", value, "consumptionEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErLike(String value) {
            addCriterion("consumption_er like", value, "consumptionEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErNotLike(String value) {
            addCriterion("consumption_er not like", value, "consumptionEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErIn(List<String> values) {
            addCriterion("consumption_er in", values, "consumptionEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErNotIn(List<String> values) {
            addCriterion("consumption_er not in", values, "consumptionEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErBetween(String value1, String value2) {
            addCriterion("consumption_er between", value1, value2, "consumptionEr");
            return (Criteria) this;
        }

        public Criteria andConsumptionErNotBetween(String value1, String value2) {
            addCriterion("consumption_er not between", value1, value2, "consumptionEr");
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