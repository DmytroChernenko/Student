package com.company.mc.saturday.game;

/**
 * Created by dmitrij on 25.02.17.
 */
public class Main {

    public static void main(String[] args) {

        Gamer g1 = new Gamer("Vasya");
        Gamer g2 = new Gamer("Kostya");

        Weapon pistolFor10Bullet = new Weapon(10);

        g1.setWeapon(pistolFor10Bullet);

        g1.shoot();

        System.out.println(g1.getWeapon().getBullets());



    }
}
