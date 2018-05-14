package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class MajorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MajorExample() {
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

        public Criteria andIdMIsNull() {
            addCriterion("id_m is null");
            return (Criteria) this;
        }

        public Criteria andIdMIsNotNull() {
            addCriterion("id_m is not null");
            return (Criteria) this;
        }

        public Criteria andIdMEqualTo(String value) {
            addCriterion("id_m =", value, "idM");
            return (Criteria) this;
        }

        public Criteria andIdMNotEqualTo(String value) {
            addCriterion("id_m <>", value, "idM");
            return (Criteria) this;
        }

        public Criteria andIdMGreaterThan(String value) {
            addCriterion("id_m >", value, "idM");
            return (Criteria) this;
        }

        public Criteria andIdMGreaterThanOrEqualTo(String value) {
            addCriterion("id_m >=", value, "idM");
            return (Criteria) this;
        }

        public Criteria andIdMLessThan(String value) {
            addCriterion("id_m <", value, "idM");
            return (Criteria) this;
        }

        public Criteria andIdMLessThanOrEqualTo(String value) {
            addCriterion("id_m <=", value, "idM");
            return (Criteria) this;
        }

        public Criteria andIdMLike(String value) {
            addCriterion("id_m like", value, "idM");
            return (Criteria) this;
        }

        public Criteria andIdMNotLike(String value) {
            addCriterion("id_m not like", value, "idM");
            return (Criteria) this;
        }

        public Criteria andIdMIn(List<String> values) {
            addCriterion("id_m in", values, "idM");
            return (Criteria) this;
        }

        public Criteria andIdMNotIn(List<String> values) {
            addCriterion("id_m not in", values, "idM");
            return (Criteria) this;
        }

        public Criteria andIdMBetween(String value1, String value2) {
            addCriterion("id_m between", value1, value2, "idM");
            return (Criteria) this;
        }

        public Criteria andIdMNotBetween(String value1, String value2) {
            addCriterion("id_m not between", value1, value2, "idM");
            return (Criteria) this;
        }

        public Criteria andNameMIsNull() {
            addCriterion("name_m is null");
            return (Criteria) this;
        }

        public Criteria andNameMIsNotNull() {
            addCriterion("name_m is not null");
            return (Criteria) this;
        }

        public Criteria andNameMEqualTo(String value) {
            addCriterion("name_m =", value, "nameM");
            return (Criteria) this;
        }

        public Criteria andNameMNotEqualTo(String value) {
            addCriterion("name_m <>", value, "nameM");
            return (Criteria) this;
        }

        public Criteria andNameMGreaterThan(String value) {
            addCriterion("name_m >", value, "nameM");
            return (Criteria) this;
        }

        public Criteria andNameMGreaterThanOrEqualTo(String value) {
            addCriterion("name_m >=", value, "nameM");
            return (Criteria) this;
        }

        public Criteria andNameMLessThan(String value) {
            addCriterion("name_m <", value, "nameM");
            return (Criteria) this;
        }

        public Criteria andNameMLessThanOrEqualTo(String value) {
            addCriterion("name_m <=", value, "nameM");
            return (Criteria) this;
        }

        public Criteria andNameMLike(String value) {
            addCriterion("name_m like", value, "nameM");
            return (Criteria) this;
        }

        public Criteria andNameMNotLike(String value) {
            addCriterion("name_m not like", value, "nameM");
            return (Criteria) this;
        }

        public Criteria andNameMIn(List<String> values) {
            addCriterion("name_m in", values, "nameM");
            return (Criteria) this;
        }

        public Criteria andNameMNotIn(List<String> values) {
            addCriterion("name_m not in", values, "nameM");
            return (Criteria) this;
        }

        public Criteria andNameMBetween(String value1, String value2) {
            addCriterion("name_m between", value1, value2, "nameM");
            return (Criteria) this;
        }

        public Criteria andNameMNotBetween(String value1, String value2) {
            addCriterion("name_m not between", value1, value2, "nameM");
            return (Criteria) this;
        }

        public Criteria andLeaderMIsNull() {
            addCriterion("leader_m is null");
            return (Criteria) this;
        }

        public Criteria andLeaderMIsNotNull() {
            addCriterion("leader_m is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderMEqualTo(String value) {
            addCriterion("leader_m =", value, "leaderM");
            return (Criteria) this;
        }

        public Criteria andLeaderMNotEqualTo(String value) {
            addCriterion("leader_m <>", value, "leaderM");
            return (Criteria) this;
        }

        public Criteria andLeaderMGreaterThan(String value) {
            addCriterion("leader_m >", value, "leaderM");
            return (Criteria) this;
        }

        public Criteria andLeaderMGreaterThanOrEqualTo(String value) {
            addCriterion("leader_m >=", value, "leaderM");
            return (Criteria) this;
        }

        public Criteria andLeaderMLessThan(String value) {
            addCriterion("leader_m <", value, "leaderM");
            return (Criteria) this;
        }

        public Criteria andLeaderMLessThanOrEqualTo(String value) {
            addCriterion("leader_m <=", value, "leaderM");
            return (Criteria) this;
        }

        public Criteria andLeaderMLike(String value) {
            addCriterion("leader_m like", value, "leaderM");
            return (Criteria) this;
        }

        public Criteria andLeaderMNotLike(String value) {
            addCriterion("leader_m not like", value, "leaderM");
            return (Criteria) this;
        }

        public Criteria andLeaderMIn(List<String> values) {
            addCriterion("leader_m in", values, "leaderM");
            return (Criteria) this;
        }

        public Criteria andLeaderMNotIn(List<String> values) {
            addCriterion("leader_m not in", values, "leaderM");
            return (Criteria) this;
        }

        public Criteria andLeaderMBetween(String value1, String value2) {
            addCriterion("leader_m between", value1, value2, "leaderM");
            return (Criteria) this;
        }

        public Criteria andLeaderMNotBetween(String value1, String value2) {
            addCriterion("leader_m not between", value1, value2, "leaderM");
            return (Criteria) this;
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