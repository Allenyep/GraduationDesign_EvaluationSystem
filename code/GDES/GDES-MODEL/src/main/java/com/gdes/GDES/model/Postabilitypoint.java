package com.gdes.GDES.model;

public class Postabilitypoint extends PostabilitypointKey {
    private String proportionSap;

    private Post post;

    public String getProportionSap() {
        return proportionSap;
    }

    public void setProportionSap(String proportionSap) {
        this.proportionSap = proportionSap == null ? null : proportionSap.trim();
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}