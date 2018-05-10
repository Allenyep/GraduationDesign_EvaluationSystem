package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class LatestabilityscoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LatestabilityscoreExample() {
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

        public Criteria andScoreLasIsNull() {
            addCriterion("score_las is null");
            return (Criteria) this;
        }

        public Criteria andScoreLasIsNotNull() {
            addCriterion("score_las is not null");
            return (Criteria) this;
        }

        public Criteria andScoreLasEqualTo(String value) {
            addCriterion("score_las =", value, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andScoreLasNotEqualTo(String value) {
            addCriterion("score_las <>", value, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andScoreLasGreaterThan(String value) {
            addCriterion("score_las >", value, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andScoreLasGreaterThanOrEqualTo(String value) {
            addCriterion("score_las >=", value, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andScoreLasLessThan(String value) {
            addCriterion("score_las <", value, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andScoreLasLessThanOrEqualTo(String value) {
            addCriterion("score_las <=", value, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andScoreLasLike(String value) {
            addCriterion("score_las like", value, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andScoreLasNotLike(String value) {
            addCriterion("score_las not like", value, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andScoreLasIn(List<String> values) {
            addCriterion("score_las in", values, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andScoreLasNotIn(List<String> values) {
            addCriterion("score_las not in", values, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andScoreLasBetween(String value1, String value2) {
            addCriterion("score_las between", value1, value2, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andScoreLasNotBetween(String value1, String value2) {
            addCriterion("score_las not between", value1, value2, "scoreLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasIsNull() {
            addCriterion("proportion_las is null");
            return (Criteria) this;
        }

        public Criteria andProportionLasIsNotNull() {
            addCriterion("proportion_las is not null");
            return (Criteria) this;
        }

        public Criteria andProportionLasEqualTo(String value) {
            addCriterion("proportion_las =", value, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasNotEqualTo(String value) {
            addCriterion("proportion_las <>", value, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasGreaterThan(String value) {
            addCriterion("proportion_las >", value, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasGreaterThanOrEqualTo(String value) {
            addCriterion("proportion_las >=", value, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasLessThan(String value) {
            addCriterion("proportion_las <", value, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasLessThanOrEqualTo(String value) {
            addCriterion("proportion_las <=", value, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasLike(String value) {
            addCriterion("proportion_las like", value, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasNotLike(String value) {
            addCriterion("proportion_las not like", value, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasIn(List<String> values) {
            addCriterion("proportion_las in", values, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasNotIn(List<String> values) {
            addCriterion("proportion_las not in", values, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasBetween(String value1, String value2) {
            addCriterion("proportion_las between", value1, value2, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andProportionLasNotBetween(String value1, String value2) {
            addCriterion("proportion_las not between", value1, value2, "proportionLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasIsNull() {
            addCriterion("time_las is null");
            return (Criteria) this;
        }

        public Criteria andTimeLasIsNotNull() {
            addCriterion("time_las is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLasEqualTo(String value) {
            addCriterion("time_las =", value, "timeLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasNotEqualTo(String value) {
            addCriterion("time_las <>", value, "timeLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasGreaterThan(String value) {
            addCriterion("time_las >", value, "timeLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasGreaterThanOrEqualTo(String value) {
            addCriterion("time_las >=", value, "timeLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasLessThan(String value) {
            addCriterion("time_las <", value, "timeLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasLessThanOrEqualTo(String value) {
            addCriterion("time_las <=", value, "timeLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasLike(String value) {
            addCriterion("time_las like", value, "timeLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasNotLike(String value) {
            addCriterion("time_las not like", value, "timeLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasIn(List<String> values) {
            addCriterion("time_las in", values, "timeLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasNotIn(List<String> values) {
            addCriterion("time_las not in", values, "timeLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasBetween(String value1, String value2) {
            addCriterion("time_las between", value1, value2, "timeLas");
            return (Criteria) this;
        }

        public Criteria andTimeLasNotBetween(String value1, String value2) {
            addCriterion("time_las not between", value1, value2, "timeLas");
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