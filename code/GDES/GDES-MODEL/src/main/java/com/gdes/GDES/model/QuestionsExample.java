package com.gdes.GDES.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionsExample() {
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

        public Criteria andDatatimeQIsNull() {
            addCriterion("datatime_q is null");
            return (Criteria) this;
        }

        public Criteria andDatatimeQIsNotNull() {
            addCriterion("datatime_q is not null");
            return (Criteria) this;
        }

        public Criteria andDatatimeQEqualTo(String value) {
            addCriterion("datatime_q =", value, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andDatatimeQNotEqualTo(String value) {
            addCriterion("datatime_q <>", value, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andDatatimeQGreaterThan(String value) {
            addCriterion("datatime_q >", value, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andDatatimeQGreaterThanOrEqualTo(String value) {
            addCriterion("datatime_q >=", value, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andDatatimeQLessThan(String value) {
            addCriterion("datatime_q <", value, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andDatatimeQLessThanOrEqualTo(String value) {
            addCriterion("datatime_q <=", value, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andDatatimeQLike(String value) {
            addCriterion("datatime_q like", value, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andDatatimeQNotLike(String value) {
            addCriterion("datatime_q not like", value, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andDatatimeQIn(List<String> values) {
            addCriterion("datatime_q in", values, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andDatatimeQNotIn(List<String> values) {
            addCriterion("datatime_q not in", values, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andDatatimeQBetween(String value1, String value2) {
            addCriterion("datatime_q between", value1, value2, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andDatatimeQNotBetween(String value1, String value2) {
            addCriterion("datatime_q not between", value1, value2, "datatimeQ");
            return (Criteria) this;
        }

        public Criteria andContextQIsNull() {
            addCriterion("context_q is null");
            return (Criteria) this;
        }

        public Criteria andContextQIsNotNull() {
            addCriterion("context_q is not null");
            return (Criteria) this;
        }

        public Criteria andContextQEqualTo(String value) {
            addCriterion("context_q =", value, "contextQ");
            return (Criteria) this;
        }

        public Criteria andContextQNotEqualTo(String value) {
            addCriterion("context_q <>", value, "contextQ");
            return (Criteria) this;
        }

        public Criteria andContextQGreaterThan(String value) {
            addCriterion("context_q >", value, "contextQ");
            return (Criteria) this;
        }

        public Criteria andContextQGreaterThanOrEqualTo(String value) {
            addCriterion("context_q >=", value, "contextQ");
            return (Criteria) this;
        }

        public Criteria andContextQLessThan(String value) {
            addCriterion("context_q <", value, "contextQ");
            return (Criteria) this;
        }

        public Criteria andContextQLessThanOrEqualTo(String value) {
            addCriterion("context_q <=", value, "contextQ");
            return (Criteria) this;
        }

        public Criteria andContextQLike(String value) {
            addCriterion("context_q like", value, "contextQ");
            return (Criteria) this;
        }

        public Criteria andContextQNotLike(String value) {
            addCriterion("context_q not like", value, "contextQ");
            return (Criteria) this;
        }

        public Criteria andContextQIn(List<String> values) {
            addCriterion("context_q in", values, "contextQ");
            return (Criteria) this;
        }

        public Criteria andContextQNotIn(List<String> values) {
            addCriterion("context_q not in", values, "contextQ");
            return (Criteria) this;
        }

        public Criteria andContextQBetween(String value1, String value2) {
            addCriterion("context_q between", value1, value2, "contextQ");
            return (Criteria) this;
        }

        public Criteria andContextQNotBetween(String value1, String value2) {
            addCriterion("context_q not between", value1, value2, "contextQ");
            return (Criteria) this;
        }

        public Criteria andScoreQIsNull() {
            addCriterion("score_q is null");
            return (Criteria) this;
        }

        public Criteria andScoreQIsNotNull() {
            addCriterion("score_q is not null");
            return (Criteria) this;
        }

        public Criteria andScoreQEqualTo(String value) {
            addCriterion("score_q =", value, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andScoreQNotEqualTo(String value) {
            addCriterion("score_q <>", value, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andScoreQGreaterThan(String value) {
            addCriterion("score_q >", value, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andScoreQGreaterThanOrEqualTo(String value) {
            addCriterion("score_q >=", value, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andScoreQLessThan(String value) {
            addCriterion("score_q <", value, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andScoreQLessThanOrEqualTo(String value) {
            addCriterion("score_q <=", value, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andScoreQLike(String value) {
            addCriterion("score_q like", value, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andScoreQNotLike(String value) {
            addCriterion("score_q not like", value, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andScoreQIn(List<String> values) {
            addCriterion("score_q in", values, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andScoreQNotIn(List<String> values) {
            addCriterion("score_q not in", values, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andScoreQBetween(String value1, String value2) {
            addCriterion("score_q between", value1, value2, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andScoreQNotBetween(String value1, String value2) {
            addCriterion("score_q not between", value1, value2, "scoreQ");
            return (Criteria) this;
        }

        public Criteria andTimeQIsNull() {
            addCriterion("time_q is null");
            return (Criteria) this;
        }

        public Criteria andTimeQIsNotNull() {
            addCriterion("time_q is not null");
            return (Criteria) this;
        }

        public Criteria andTimeQEqualTo(String value) {
            addCriterion("time_q =", value, "timeQ");
            return (Criteria) this;
        }

        public Criteria andTimeQNotEqualTo(String value) {
            addCriterion("time_q <>", value, "timeQ");
            return (Criteria) this;
        }

        public Criteria andTimeQGreaterThan(String value) {
            addCriterion("time_q >", value, "timeQ");
            return (Criteria) this;
        }

        public Criteria andTimeQGreaterThanOrEqualTo(String value) {
            addCriterion("time_q >=", value, "timeQ");
            return (Criteria) this;
        }

        public Criteria andTimeQLessThan(String value) {
            addCriterion("time_q <", value, "timeQ");
            return (Criteria) this;
        }

        public Criteria andTimeQLessThanOrEqualTo(String value) {
            addCriterion("time_q <=", value, "timeQ");
            return (Criteria) this;
        }

        public Criteria andTimeQLike(String value) {
            addCriterion("time_q like", value, "timeQ");
            return (Criteria) this;
        }

        public Criteria andTimeQNotLike(String value) {
            addCriterion("time_q not like", value, "timeQ");
            return (Criteria) this;
        }

        public Criteria andTimeQIn(List<String> values) {
            addCriterion("time_q in", values, "timeQ");
            return (Criteria) this;
        }

        public Criteria andTimeQNotIn(List<String> values) {
            addCriterion("time_q not in", values, "timeQ");
            return (Criteria) this;
        }

        public Criteria andTimeQBetween(String value1, String value2) {
            addCriterion("time_q between", value1, value2, "timeQ");
            return (Criteria) this;
        }

        public Criteria andTimeQNotBetween(String value1, String value2) {
            addCriterion("time_q not between", value1, value2, "timeQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQIsNull() {
            addCriterion("answer_q is null");
            return (Criteria) this;
        }

        public Criteria andAnswerQIsNotNull() {
            addCriterion("answer_q is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerQEqualTo(String value) {
            addCriterion("answer_q =", value, "answerQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQNotEqualTo(String value) {
            addCriterion("answer_q <>", value, "answerQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQGreaterThan(String value) {
            addCriterion("answer_q >", value, "answerQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQGreaterThanOrEqualTo(String value) {
            addCriterion("answer_q >=", value, "answerQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQLessThan(String value) {
            addCriterion("answer_q <", value, "answerQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQLessThanOrEqualTo(String value) {
            addCriterion("answer_q <=", value, "answerQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQLike(String value) {
            addCriterion("answer_q like", value, "answerQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQNotLike(String value) {
            addCriterion("answer_q not like", value, "answerQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQIn(List<String> values) {
            addCriterion("answer_q in", values, "answerQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQNotIn(List<String> values) {
            addCriterion("answer_q not in", values, "answerQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQBetween(String value1, String value2) {
            addCriterion("answer_q between", value1, value2, "answerQ");
            return (Criteria) this;
        }

        public Criteria andAnswerQNotBetween(String value1, String value2) {
            addCriterion("answer_q not between", value1, value2, "answerQ");
            return (Criteria) this;
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

        public Criteria andAutomaticscoringQIsNull() {
            addCriterion("automaticscoring_q is null");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQIsNotNull() {
            addCriterion("automaticscoring_q is not null");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQEqualTo(String value) {
            addCriterion("automaticscoring_q =", value, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQNotEqualTo(String value) {
            addCriterion("automaticscoring_q <>", value, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQGreaterThan(String value) {
            addCriterion("automaticscoring_q >", value, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQGreaterThanOrEqualTo(String value) {
            addCriterion("automaticscoring_q >=", value, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQLessThan(String value) {
            addCriterion("automaticscoring_q <", value, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQLessThanOrEqualTo(String value) {
            addCriterion("automaticscoring_q <=", value, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQLike(String value) {
            addCriterion("automaticscoring_q like", value, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQNotLike(String value) {
            addCriterion("automaticscoring_q not like", value, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQIn(List<String> values) {
            addCriterion("automaticscoring_q in", values, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQNotIn(List<String> values) {
            addCriterion("automaticscoring_q not in", values, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQBetween(String value1, String value2) {
            addCriterion("automaticscoring_q between", value1, value2, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andAutomaticscoringQNotBetween(String value1, String value2) {
            addCriterion("automaticscoring_q not between", value1, value2, "automaticscoringQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQIsNull() {
            addCriterion("deleteornot_q is null");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQIsNotNull() {
            addCriterion("deleteornot_q is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQEqualTo(String value) {
            addCriterion("deleteornot_q =", value, "deleteornotQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQNotEqualTo(String value) {
            addCriterion("deleteornot_q <>", value, "deleteornotQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQGreaterThan(String value) {
            addCriterion("deleteornot_q >", value, "deleteornotQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQGreaterThanOrEqualTo(String value) {
            addCriterion("deleteornot_q >=", value, "deleteornotQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQLessThan(String value) {
            addCriterion("deleteornot_q <", value, "deleteornotQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQLessThanOrEqualTo(String value) {
            addCriterion("deleteornot_q <=", value, "deleteornotQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQLike(String value) {
            addCriterion("deleteornot_q like", value, "deleteornotQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQNotLike(String value) {
            addCriterion("deleteornot_q not like", value, "deleteornotQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQIn(List<String> values) {
            addCriterion("deleteornot_q in", values, "deleteornotQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQNotIn(List<String> values) {
            addCriterion("deleteornot_q not in", values, "deleteornotQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQBetween(String value1, String value2) {
            addCriterion("deleteornot_q between", value1, value2, "deleteornotQ");
            return (Criteria) this;
        }

        public Criteria andDeleteornotQNotBetween(String value1, String value2) {
            addCriterion("deleteornot_q not between", value1, value2, "deleteornotQ");
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