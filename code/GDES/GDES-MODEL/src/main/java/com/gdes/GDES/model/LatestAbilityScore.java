package com.gdes.GDES.model;

public class Latestabilityscore extends LatestabilityscoreKey {
    private String scoreLas;

    private String proportionLas;

    private String timeLas;

    private Abilitypoint abilitypoint;

    public String getScoreLas() {
        return scoreLas;
    }

    public void setScoreLas(String scoreLas) {
        this.scoreLas = scoreLas == null ? null : scoreLas.trim();
    }

    public String getProportionLas() {
        return proportionLas;
    }

    public void setProportionLas(String proportionLas) {
        this.proportionLas = proportionLas == null ? null : proportionLas.trim();
    }

    public String getTimeLas() {
        return timeLas;
    }

    public void setTimeLas(String timeLas) {
        this.timeLas = timeLas == null ? null : timeLas.trim();
    }

    public Abilitypoint getAbilitypoint() {
        return abilitypoint;
    }

    public void setAbilitypoint(Abilitypoint abilitypoint) {
        this.abilitypoint = abilitypoint;
    }
}