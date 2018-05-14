package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class ProfessionalabilitypointrequirementsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfessionalabilitypointrequirementsExample() {
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

        public Criteria andRequiredlevelPaprIsNull() {
            addCriterion("requiredlevel_papr is null");
            return (Criteria) this;
        }

        public Criteria andRequiredlevelPaprIsNotNull() {
            addCriterion("requiredlevel_papr is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredlevelPaprEqualTo(Integer value) {
            addCriterion("requiredlevel_papr =", value, "requiredlevelPapr");
            return (Criteria) this;
        }

        public Criteria andRequiredlevelPaprNotEqualTo(Integer value) {
            addCriterion("requiredlevel_papr <>", value, "requiredlevelPapr");
            return (Criteria) this;
        }

        public Criteria andRequiredlevelPaprGreaterThan(Integer value) {
            addCriterion("requiredlevel_papr >", value, "requiredlevelPapr");
            return (Criteria) this;
        }

        public Criteria andRequiredlevelPaprGreaterThanOrEqualTo(Integer value) {
            addCriterion("requiredlevel_papr >=", value, "requiredlevelPapr");
            return (Criteria) this;
        }

        public Criteria andRequiredlevelPaprLessThan(Integer value) {
            addCriterion("requiredlevel_papr <", value, "requiredlevelPapr");
            return (Criteria) this;
        }

        public Criteria andRequiredlevelPaprLessThanOrEqualTo(Integer value) {
            addCriterion("requiredlevel_papr <=", value, "requiredlevelPapr");
            return (Criteria) this;
        }

        public Criteria andRequiredlevelPaprIn(List<Integer> values) {
            addCriterion("requiredlevel_papr in", values, "requiredlevelPapr");
            return (Criteria) this;
        }

        public Criteria andRequiredlevelPaprNotIn(List<Integer> values) {
            addCriterion("requiredlevel_papr not in", values, "requiredlevelPapr");
            return (Criteria) this;
        }

        public Criteria andRequiredlevelPaprBetween(Integer value1, Integer value2) {
            addCriterion("requiredlevel_papr between", value1, value2, "requiredlevelPapr");
            return (Criteria) this;
        }

        public Criteria andRequiredlevelPaprNotBetween(Integer value1, Integer value2) {
            addCriterion("requiredlevel_papr not between", value1, value2, "requiredlevelPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprIsNull() {
            addCriterion("conversionratio_papr is null");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprIsNotNull() {
            addCriterion("conversionratio_papr is not null");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprEqualTo(String value) {
            addCriterion("conversionratio_papr =", value, "conversionratioPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprNotEqualTo(String value) {
            addCriterion("conversionratio_papr <>", value, "conversionratioPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprGreaterThan(String value) {
            addCriterion("conversionratio_papr >", value, "conversionratioPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprGreaterThanOrEqualTo(String value) {
            addCriterion("conversionratio_papr >=", value, "conversionratioPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprLessThan(String value) {
            addCriterion("conversionratio_papr <", value, "conversionratioPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprLessThanOrEqualTo(String value) {
            addCriterion("conversionratio_papr <=", value, "conversionratioPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprLike(String value) {
            addCriterion("conversionratio_papr like", value, "conversionratioPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprNotLike(String value) {
            addCriterion("conversionratio_papr not like", value, "conversionratioPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprIn(List<String> values) {
            addCriterion("conversionratio_papr in", values, "conversionratioPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprNotIn(List<String> values) {
            addCriterion("conversionratio_papr not in", values, "conversionratioPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprBetween(String value1, String value2) {
            addCriterion("conversionratio_papr between", value1, value2, "conversionratioPapr");
            return (Criteria) this;
        }

        public Criteria andConversionratioPaprNotBetween(String value1, String value2) {
            addCriterion("conversionratio_papr not between", value1, value2, "conversionratioPapr");
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