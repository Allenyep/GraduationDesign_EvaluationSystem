package com.gdes.GDES.model;

public class Historytestpaper extends HistorytestpaperKey {
    private String answerHtp;

    private String scoreHtp;

    private String timeconsumingHtp;

    private String timeproportionHtp;

    public String getAnswerHtp() {
        return answerHtp;
    }

    public void setAnswerHtp(String answerHtp) {
        this.answerHtp = answerHtp == null ? null : answerHtp.trim();
    }

    public String getScoreHtp() {
        return scoreHtp;
    }

    public void setScoreHtp(String scoreHtp) {
        this.scoreHtp = scoreHtp == null ? null : scoreHtp.trim();
    }

    public String getTimeconsumingHtp() {
        return timeconsumingHtp;
    }

    public void setTimeconsumingHtp(String timeconsumingHtp) {
        this.timeconsumingHtp = timeconsumingHtp == null ? null : timeconsumingHtp.trim();
    }

    public String getTimeproportionHtp() {
        return timeproportionHtp;
    }

    public void setTimeproportionHtp(String timeproportionHtp) {
        this.timeproportionHtp = timeproportionHtp == null ? null : timeproportionHtp.trim();
    }
}