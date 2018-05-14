package com.gdes.GDES.model;

public class Scoredetail extends ScoredetailKey {
    private String scoreSd;

    private String timeSd;

    private Abilitypoint abilitypoint;

    private Teacher teacher;

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

    public Abilitypoint getAbilitypoint() {
        return abilitypoint;
    }

    public void setAbilitypoint(Abilitypoint abilitypoint) {
        this.abilitypoint = abilitypoint;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}