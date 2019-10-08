package org.academiadecodigo.stringrays.sniper;

import org.academiadecodigo.stringrays.sniper.objects.destroyables.Destroyable;

public class SniperRifle {


    private int bulletDamage;

    public SniperRifle(int damage) {
        this.bulletDamage = damage;
    }

    public void shoot(Destroyable destroyable) {
        int hitChance = 94;
        int accuracy = (int) (Math.random() * 100 + 1);


        if (accuracy < hitChance) {
            System.out.println("Target acquired, launching a projectile now.");
            destroyable.hit(bulletDamage);
            return;
        }

        System.out.println("oops, it moved.");
    }
}
