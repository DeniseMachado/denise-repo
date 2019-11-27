package org.academiadecodigo.stringrays.sniperelite.gameobject.weapons;

import org.academiadecodigo.stringrays.sniperelite.gameobject.Destroyable;
import org.academiadecodigo.stringrays.sniperelite.gameobject.enemy.Enemy;

/**
 * A sniper rifle used to kill enemies
 */
public class SniperRifle {

    public static final double HIT_PROBABILITY = 0.7;

    private int shootsFired;
    private int bulletDamage;

    public SniperRifle(int bulletDamage) {

        this.bulletDamage = bulletDamage;
    }

    public int getShootsFired() {

        return shootsFired;
    }

    /**
     * Take a shoot at an enemy
     *
     * @param target the enemy to shoot
     */

    public void shoot(Destroyable target) {

        shootsFired++;

        if (Math.random() < HIT_PROBABILITY) {

            target.hit(bulletDamage);
            System.out.println("It's a hit!");

        } else {
            System.out.println("It's a miss!");
        }

    }
}





