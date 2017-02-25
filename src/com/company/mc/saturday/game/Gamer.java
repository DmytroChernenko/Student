package com.company.mc.saturday.game;

/**
 * Created by dmitrij on 25.02.17.
 */
public class Gamer implements IShoot{

    String name;
    Weapon weapon;

    public Gamer(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public Gamer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public void shoot() {

        System.out.println(weapon.getBullets() + " was in magazine");

        weapon.setBullets(weapon.getBullets() - 1);

        System.out.println("=========>");


    }

}
