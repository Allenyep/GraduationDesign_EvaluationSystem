package com.gdes.GDES.model;

public class Professionalabilitypointrequirements extends ProfessionalabilitypointrequirementsKey {
    private Integer requiredlevelPapr;

    private String conversionratioPapr;

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
}