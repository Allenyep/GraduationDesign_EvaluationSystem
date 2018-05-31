package com.gdes.GDES.model;

public class Professionalabilitypointrequirements extends ProfessionalabilitypointrequirementsKey {
    private Integer requiredlevelPapr;

    private String conversionratioPapr;

    private Abilitypoint abilitypoint;

    private Majorb majorb;

    public Integer getRequiredlevelPapr() {
        return requiredlevelPapr;
    }

    public void setRequiredlevelPapr(Integer requiredlevelPapr) {
        this.requiredlevelPapr = requiredlevelPapr;
    }

    public String getConversionratioPapr() {
        return conversionratioPapr;
    }

    public void setConversionratioPapr(String conversionratioPapr) {
        this.conversionratioPapr = conversionratioPapr == null ? null : conversionratioPapr.trim();
    }

    public Abilitypoint getAbilitypoint() {
        return abilitypoint;
    }

    public void setAbilitypoint(Abilitypoint abilitypoint) {
        this.abilitypoint = abilitypoint;
    }

    public Majorb getMajorb() {
        return majorb;
    }

    public void setMajorb(Majorb majorb) {
        this.majorb = majorb;
    }
}