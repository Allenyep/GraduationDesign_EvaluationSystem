package com.gdes.GDES.model;

/**
 * Created by 96906 on 2018/5/4.
 */
public class AbilityPoint {
    private int id_ap; //能力点编号
    private String name_ap; //能力点名称
    private String aspect_ap; //所属方面
    private String class_ap; //所属大的分类

    public int getId_ap() {
        return id_ap;
    }

    public void setId_ap(int id_ap) {
        this.id_ap = id_ap;
    }

    public String getName_ap() {
        return name_ap;
    }

    public void setName_ap(String name_ap) {
        this.name_ap = name_ap;
    }

    public String getAspect_ap() {
        return aspect_ap;
    }

    public void setAspect_ap(String aspect_ap) {
        this.aspect_ap = aspect_ap;
    }

    public String getClass_ap() {
        return class_ap;
    }

    public void setClass_ap(String class_ap) {
        this.class_ap = class_ap;
    }

    @Override
    public String toString() {
        return "能力点{" +
                "能力点编号：" + id_ap +
                ", 能力点名称：" + name_ap +
                ", 所属方面：" + aspect_ap +
                ", 所属类：" + class_ap +
                "}";
    }
}
