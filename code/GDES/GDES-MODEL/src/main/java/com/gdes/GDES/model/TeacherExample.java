package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andNameTIsNull() {
            addCriterion("name_t is null");
            return (Criteria) this;
        }

        public Criteria andNameTIsNotNull() {
            addCriterion("name_t is not null");
            return (Criteria) this;
        }

        public Criteria andNameTEqualTo(String value) {
            addCriterion("name_t =", value, "nameT");
            return (Criteria) this;
        }

        public Criteria andNameTNotEqualTo(String value) {
            addCriterion("name_t <>", value, "nameT");
            return (Criteria) this;
        }

        public Criteria andNameTGreaterThan(String value) {
            addCriterion("name_t >", value, "nameT");
            return (Criteria) this;
        }

        public Criteria andNameTGreaterThanOrEqualTo(String value) {
            addCriterion("name_t >=", value, "nameT");
            return (Criteria) this;
        }

        public Criteria andNameTLessThan(String value) {
            addCriterion("name_t <", value, "nameT");
            return (Criteria) this;
        }

        public Criteria andNameTLessThanOrEqualTo(String value) {
            addCriterion("name_t <=", value, "nameT");
            return (Criteria) this;
        }

        public Criteria andNameTLike(String value) {
            addCriterion("name_t like", value, "nameT");
            return (Criteria) this;
        }

        public Criteria andNameTNotLike(String value) {
            addCriterion("name_t not like", value, "nameT");
            return (Criteria) this;
        }

        public Criteria andNameTIn(List<String> values) {
            addCriterion("name_t in", values, "nameT");
            return (Criteria) this;
        }

        public Criteria andNameTNotIn(List<String> values) {
            addCriterion("name_t not in", values, "nameT");
            return (Criteria) this;
        }

        public Criteria andNameTBetween(String value1, String value2) {
            addCriterion("name_t between", value1, value2, "nameT");
            return (Criteria) this;
        }

        public Criteria andNameTNotBetween(String value1, String value2) {
            addCriterion("name_t not between", value1, value2, "nameT");
            return (Criteria) this;
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

        public Criteria andMajorleaderTIsNull() {
            addCriterion("majorleader_t is null");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTIsNotNull() {
            addCriterion("majorleader_t is not null");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTEqualTo(String value) {
            addCriterion("majorleader_t =", value, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTNotEqualTo(String value) {
            addCriterion("majorleader_t <>", value, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTGreaterThan(String value) {
            addCriterion("majorleader_t >", value, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTGreaterThanOrEqualTo(String value) {
            addCriterion("majorleader_t >=", value, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTLessThan(String value) {
            addCriterion("majorleader_t <", value, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTLessThanOrEqualTo(String value) {
            addCriterion("majorleader_t <=", value, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTLike(String value) {
            addCriterion("majorleader_t like", value, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTNotLike(String value) {
            addCriterion("majorleader_t not like", value, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTIn(List<String> values) {
            addCriterion("majorleader_t in", values, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTNotIn(List<String> values) {
            addCriterion("majorleader_t not in", values, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTBetween(String value1, String value2) {
            addCriterion("majorleader_t between", value1, value2, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andMajorleaderTNotBetween(String value1, String value2) {
            addCriterion("majorleader_t not between", value1, value2, "majorleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTIsNull() {
            addCriterion("courseleader_t is null");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTIsNotNull() {
            addCriterion("courseleader_t is not null");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTEqualTo(String value) {
            addCriterion("courseleader_t =", value, "courseleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTNotEqualTo(String value) {
            addCriterion("courseleader_t <>", value, "courseleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTGreaterThan(String value) {
            addCriterion("courseleader_t >", value, "courseleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTGreaterThanOrEqualTo(String value) {
            addCriterion("courseleader_t >=", value, "courseleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTLessThan(String value) {
            addCriterion("courseleader_t <", value, "courseleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTLessThanOrEqualTo(String value) {
            addCriterion("courseleader_t <=", value, "courseleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTLike(String value) {
            addCriterion("courseleader_t like", value, "courseleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTNotLike(String value) {
            addCriterion("courseleader_t not like", value, "courseleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTIn(List<String> values) {
            addCriterion("courseleader_t in", values, "courseleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTNotIn(List<String> values) {
            addCriterion("courseleader_t not in", values, "courseleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTBetween(String value1, String value2) {
            addCriterion("courseleader_t between", value1, value2, "courseleaderT");
            return (Criteria) this;
        }

        public Criteria andCourseleaderTNotBetween(String value1, String value2) {
            addCriterion("courseleader_t not between", value1, value2, "courseleaderT");
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