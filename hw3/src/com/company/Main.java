package com.company;

public class Main {

    public static void main(String[] args) {
       Boss boss = new Boss();
       boss.setHealh(775);
       boss.setBossAttack(12335);
       boss.setDefence("Magic");
        System.out.println(boss.getHealh() + " - Boss health" + " " + boss.getBossAttack() + " - Boss Damage" + " " + boss.getDefence()+ " - Boss defence type");
    }
}
