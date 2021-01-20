package com.company;

public class Boss {
    private int healh;
    private int bossAttack;
    private String defence;

    public int getHealh() {
        return healh;
    }

    public void setHealh(int healh) {
        this.healh = healh;
    }

    public int getBossAttack() {
        return bossAttack;
    }

    public void setBossAttack(int bossAttack) {
        this.bossAttack = bossAttack;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }
    public Boss (){}

    public Boss(int healh, int bossAttack, String defence) {
        this.healh = healh;
        this.bossAttack = bossAttack;
        this.defence = defence;
    }
}
