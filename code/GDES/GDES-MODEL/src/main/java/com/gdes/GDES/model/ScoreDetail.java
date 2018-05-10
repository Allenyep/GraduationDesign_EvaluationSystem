package com.gdes.GDES.model;

public class Scoredetail extends ScoredetailKey {
    private String scoreSd;

    private String timeSd;

    public String getScoreSd() {
        return scoreSd;
    }

    public void setScoreSd(String scoreSd) {
        this.scoreSd = scoreSd == null ? null : scoreSd.trim();
    }

    public String getTimeSd() {
        return timeSd;
    }

    public void setTimeSd(String timeSd) {
        this.timeSd = timeSd == null ? null : timeSd.trim();
    }
}