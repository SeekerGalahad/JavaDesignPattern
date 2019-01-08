package com.design.training.builder.character;

import java.util.Objects;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-08 14:46 by Wagic 创建
 */
public class Actor {

    private String type;

    private String sex;

    private String face;

    private String costume;

    private String hairstyle;

    @Override
    public String toString() {
        return "Actor{" +
                "type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                ", face='" + face + '\'' +
                ", costume='" + costume + '\'' +
                ", hairstyle='" + hairstyle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(type, actor.type) &&
                Objects.equals(sex, actor.sex) &&
                Objects.equals(face, actor.face) &&
                Objects.equals(costume, actor.costume) &&
                Objects.equals(hairstyle, actor.hairstyle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sex, face, costume, hairstyle);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }
}
