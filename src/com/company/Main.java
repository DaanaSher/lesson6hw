package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(70);
        boss.setAttackType("Fatality");

        System.out.println(boss.toString());
    }
}
