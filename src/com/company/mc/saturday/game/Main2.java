package com.company.mc.saturday.game;

/**
 * Created by dmitrij on 25.02.17.
 */
public class Main2 {

    public static void main(String[] args) {

        IShoot g1 = new Gamer2();
        IShoot g2 = new Gamer("vasys", new Weapon(10));




        g1.shoot();

        g2.shoot();

    }
}
