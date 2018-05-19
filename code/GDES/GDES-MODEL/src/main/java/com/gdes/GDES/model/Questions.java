package com.gdes.GDES.model;

import java.util.List;

public class Questions {
    private String idQ;

    private String idC;

    private String datatimeQ;

    private String contextQ;

    private String scoreQ;

    private String timeQ;

    private String answerQ;

    private String styleQ;

    private String idT;

    private String automaticscoringQ;

    private String deleteornotQ;

    //手动添加,试题选项
    //TODO:试题选项，查询试题列表时控制选择题查询对应选项
    private List<Questionsoption> questionsO;

    public List<Questionsoption> getQuestionsO() {
        return questionsO;
    }

    public void setQuestionsO(List<Questionsoption> questionsO) {
        this.questionsO = questionsO;
    }

    public String getIdQ() {
        return idQ;
    }

    public void setIdQ(String idQ) {
        this.idQ = idQ == null ? null : idQ.trim();
    }

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC == null ? null : idC.trim();
    }

    public String getDatatimeQ() {
        return datatimeQ;
    }

    public void setDatatimeQ(String datatimeQ) {
        this.datatimeQ = datatimeQ == null ? null : datatimeQ.trim();
    }

    public String getContextQ() {
        return contextQ;
    }

    public void setContextQ(String contextQ) {
        this.contextQ = contextQ == null ? null : contextQ.trim();
    }

    public String getScoreQ() {
        return scoreQ;
    }

    public void setScoreQ(String scoreQ) {
        this.scoreQ = scoreQ == null ? null : scoreQ.trim();
    }

    public String getTimeQ() {
        return timeQ;
    }

    public void setTimeQ(String timeQ) {
        this.timeQ = timeQ == null ? null : timeQ.trim();
    }

    public String getAnswerQ() {
        return answerQ;
    }

    public void setAnswerQ(String answerQ) {
        this.answerQ = answerQ == null ? null : answerQ.trim();
    }

    public String getStyleQ() {
        return styleQ;
    }

    public void setStyleQ(String styleQ) {
        this.styleQ = styleQ == null ? null : styleQ.trim();
    }

    public String getIdT() {
        return idT;
    }

    public void setIdT(String idT) {
        this.idT = idT == null ? null : idT.trim();
    }

    public String getAutomaticscoringQ() {
        return automaticscoringQ;
    }

    public void setAutomaticscoringQ(String automaticscoringQ) {
        this.automaticscoringQ = automaticscoringQ == null ? null : automaticscoringQ.trim();
    }

    public String getDeleteornotQ() {
        return deleteornotQ;
    }

    public void setDeleteornotQ(String deleteornotQ) {
        this.deleteornotQ = deleteornotQ == null ? null : deleteornotQ.trim();
    }
}