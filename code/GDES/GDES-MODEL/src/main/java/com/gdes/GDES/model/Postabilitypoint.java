package com.gdes.GDES.model;

public class Postabilitypoint extends PostabilitypointKey {
    private String proportionSap;

    public String getProportionSap() {
        return proportionSap;
    }

    public void setProportionSap(String proportionSap) {
        this.proportionSap = proportionSap == null ? null : proportionSap.trim();
    }
}