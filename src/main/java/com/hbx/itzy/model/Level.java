package com.hbx.itzy.model;

import io.swagger.annotations.ApiModel;

@ApiModel("等级实体")
public class Level {
    private int levelId;
    private String levelExp;

    public Level() {
    }

    public Level(int levelId, String levelExp) {
        this.levelId = levelId;
        this.levelExp = levelExp;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public String getLevelExp() {
        return levelExp;
    }

    public void setLevelExp(String levelExp) {
        this.levelExp = levelExp;
    }

    @Override
    public String toString() {
        return "Level{" +
                "levelId=" + levelId +
                ", levelExp='" + levelExp + '\'' +
                '}';
    }
}
