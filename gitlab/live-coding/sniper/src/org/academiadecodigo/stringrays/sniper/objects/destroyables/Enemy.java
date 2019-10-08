package org.academiadecodigo.stringrays.sniper.objects.destroyables;

import org.academiadecodigo.stringrays.sniper.objects.GameObject;

public abstract class Enemy extends GameObject implements Destroyable {

    private int health;
    private boolean dead;


    public Enemy(int health) {
        this.health = health;
    }

    @Override
    public void hit(int damage) {

        if (damage < 0) {
            System.out.println("You stupid!");
            return;
        }

        health -= damage;
        System.out.println("Ouchie, that hurt, " + health + " health remaining");

        if (health <= 0) {
            System.out.println("THEY KILLED MEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
            dead = true;
        }
    }

    public boolean isDead() {
        return dead;
    }

    @Override
    public boolean isDestroyed() {
        return isDead();
    }
}
