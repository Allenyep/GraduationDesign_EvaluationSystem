package com.gdes.GDES.model;

public class QuestionsWithBLOBs extends Questions {
    private String contextQ;

    private String answerQ;

    public String getContextQ() {
        return contextQ;
    }

    public void setContextQ(String contextQ) {
        this.contextQ = contextQ == null ? null : contextQ.trim();
    }

    public String getAnswerQ() {
        return answerQ;
    }

    public void setAnswerQ(String answerQ) {
        this.answerQ = answerQ == null ? null : answerQ.trim();
    }
}