package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class KnowledgepointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KnowledgepointExample() {
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

        public Criteria andNameKpIsNull() {
            addCriterion("name_kp is null");
            return (Criteria) this;
        }

        public Criteria andNameKpIsNotNull() {
            addCriterion("name_kp is not null");
            return (Criteria) this;
        }

        public Criteria andNameKpEqualTo(String value) {
            addCriterion("name_kp =", value, "nameKp");
            return (Criteria) this;
        }

        public Criteria andNameKpNotEqualTo(String value) {
            addCriterion("name_kp <>", value, "nameKp");
            return (Criteria) this;
        }

        public Criteria andNameKpGreaterThan(String value) {
            addCriterion("name_kp >", value, "nameKp");
            return (Criteria) this;
        }

        public Criteria andNameKpGreaterThanOrEqualTo(String value) {
            addCriterion("name_kp >=", value, "nameKp");
            return (Criteria) this;
        }

        public Criteria andNameKpLessThan(String value) {
            addCriterion("name_kp <", value, "nameKp");
            return (Criteria) this;
        }

        public Criteria andNameKpLessThanOrEqualTo(String value) {
            addCriterion("name_kp <=", value, "nameKp");
            return (Criteria) this;
        }

        public Criteria andNameKpLike(String value) {
            addCriterion("name_kp like", value, "nameKp");
            return (Criteria) this;
        }

        public Criteria andNameKpNotLike(String value) {
            addCriterion("name_kp not like", value, "nameKp");
            return (Criteria) this;
        }

        public Criteria andNameKpIn(List<String> values) {
            addCriterion("name_kp in", values, "nameKp");
            return (Criteria) this;
        }

        public Criteria andNameKpNotIn(List<String> values) {
            addCriterion("name_kp not in", values, "nameKp");
            return (Criteria) this;
        }

        public Criteria andNameKpBetween(String value1, String value2) {
            addCriterion("name_kp between", value1, value2, "nameKp");
            return (Criteria) this;
        }

        public Criteria andNameKpNotBetween(String value1, String value2) {
            addCriterion("name_kp not between", value1, value2, "nameKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpIsNull() {
            addCriterion("proportion_kp is null");
            return (Criteria) this;
        }

        public Criteria andProportionKpIsNotNull() {
            addCriterion("proportion_kp is not null");
            return (Criteria) this;
        }

        public Criteria andProportionKpEqualTo(String value) {
            addCriterion("proportion_kp =", value, "proportionKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpNotEqualTo(String value) {
            addCriterion("proportion_kp <>", value, "proportionKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpGreaterThan(String value) {
            addCriterion("proportion_kp >", value, "proportionKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpGreaterThanOrEqualTo(String value) {
            addCriterion("proportion_kp >=", value, "proportionKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpLessThan(String value) {
            addCriterion("proportion_kp <", value, "proportionKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpLessThanOrEqualTo(String value) {
            addCriterion("proportion_kp <=", value, "proportionKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpLike(String value) {
            addCriterion("proportion_kp like", value, "proportionKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpNotLike(String value) {
            addCriterion("proportion_kp not like", value, "proportionKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpIn(List<String> values) {
            addCriterion("proportion_kp in", values, "proportionKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpNotIn(List<String> values) {
            addCriterion("proportion_kp not in", values, "proportionKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpBetween(String value1, String value2) {
            addCriterion("proportion_kp between", value1, value2, "proportionKp");
            return (Criteria) this;
        }

        public Criteria andProportionKpNotBetween(String value1, String value2) {
            addCriterion("proportion_kp not between", value1, value2, "proportionKp");
            return (Criteria) this;
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