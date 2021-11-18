package com.company;

public class Boss extends GameEntity{

    Weapon bossWeapon = new Weapon();

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "bossWeapon=" + bossWeapon +
                ", health=" + health +
                ", damage=" + damage +
                ", attackType='" + attackType + '\'' +
                '}';
    }
}
