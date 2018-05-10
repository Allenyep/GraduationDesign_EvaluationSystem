package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andNameCIsNull() {
            addCriterion("name_c is null");
            return (Criteria) this;
        }

        public Criteria andNameCIsNotNull() {
            addCriterion("name_c is not null");
            return (Criteria) this;
        }

        public Criteria andNameCEqualTo(String value) {
            addCriterion("name_c =", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCNotEqualTo(String value) {
            addCriterion("name_c <>", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCGreaterThan(String value) {
            addCriterion("name_c >", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCGreaterThanOrEqualTo(String value) {
            addCriterion("name_c >=", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCLessThan(String value) {
            addCriterion("name_c <", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCLessThanOrEqualTo(String value) {
            addCriterion("name_c <=", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCLike(String value) {
            addCriterion("name_c like", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCNotLike(String value) {
            addCriterion("name_c not like", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCIn(List<String> values) {
            addCriterion("name_c in", values, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCNotIn(List<String> values) {
            addCriterion("name_c not in", values, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCBetween(String value1, String value2) {
            addCriterion("name_c between", value1, value2, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCNotBetween(String value1, String value2) {
            addCriterion("name_c not between", value1, value2, "nameC");
            return (Criteria) this;
        }

        public Criteria andLeaderCIsNull() {
            addCriterion("leader_c is null");
            return (Criteria) this;
        }

        public Criteria andLeaderCIsNotNull() {
            addCriterion("leader_c is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderCEqualTo(String value) {
            addCriterion("leader_c =", value, "leaderC");
            return (Criteria) this;
        }

        public Criteria andLeaderCNotEqualTo(String value) {
            addCriterion("leader_c <>", value, "leaderC");
            return (Criteria) this;
        }

        public Criteria andLeaderCGreaterThan(String value) {
            addCriterion("leader_c >", value, "leaderC");
            return (Criteria) this;
        }

        public Criteria andLeaderCGreaterThanOrEqualTo(String value) {
            addCriterion("leader_c >=", value, "leaderC");
            return (Criteria) this;
        }

        public Criteria andLeaderCLessThan(String value) {
            addCriterion("leader_c <", value, "leaderC");
            return (Criteria) this;
        }

        public Criteria andLeaderCLessThanOrEqualTo(String value) {
            addCriterion("leader_c <=", value, "leaderC");
            return (Criteria) this;
        }

        public Criteria andLeaderCLike(String value) {
            addCriterion("leader_c like", value, "leaderC");
            return (Criteria) this;
        }

        public Criteria andLeaderCNotLike(String value) {
            addCriterion("leader_c not like", value, "leaderC");
            return (Criteria) this;
        }

        public Criteria andLeaderCIn(List<String> values) {
            addCriterion("leader_c in", values, "leaderC");
            return (Criteria) this;
        }

        public Criteria andLeaderCNotIn(List<String> values) {
            addCriterion("leader_c not in", values, "leaderC");
            return (Criteria) this;
        }

        public Criteria andLeaderCBetween(String value1, String value2) {
            addCriterion("leader_c between", value1, value2, "leaderC");
            return (Criteria) this;
        }

        public Criteria andLeaderCNotBetween(String value1, String value2) {
            addCriterion("leader_c not between", value1, value2, "leaderC");
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