package com.gdes.GDES.model;

public class Questionspoint extends QuestionspointKey {
    private String proportionQp;

    public String getProportionQp() {
        return proportionQp;
    }

    public void setProportionQp(String proportionQp) {
        this.proportionQp = proportionQp == null ? null : proportionQp.trim();
    }
}