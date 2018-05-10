package com.gdes.GDES.model;

public class Studentpost extends StudentpostKey {
    private String scoreSp;

    private String timeSp;

    public String getScoreSp() {
        return scoreSp;
    }

    public void setScoreSp(String scoreSp) {
        this.scoreSp = scoreSp == null ? null : scoreSp.trim();
    }

    public String getTimeSp() {
        return timeSp;
    }

    public void setTimeSp(String timeSp) {
        this.timeSp = timeSp == null ? null : timeSp.trim();
    }
}