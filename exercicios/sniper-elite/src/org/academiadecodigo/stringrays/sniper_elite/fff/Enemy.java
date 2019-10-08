package org.academiadecodigo.stringrays.sniper_elite.fff;

import org.academiadecodigo.stringrays.sniper_elite.GameObject;

public abstract class Enemy extends GameObject implements Destroyable {

    private int health;
    private boolean dead = false;
    private String message;

    public Enemy() {
        health = 20;

    }

    public boolean isDead() {
        return dead;

    }

    public void hit(int hit) {
        health = health - hit;
        if(health <= 0) {
            dead = true;

        }
        System.out.println("Target was hit " + hit + " times and I lost " + health + " of health");

    }

    public boolean Destroyable() {
        return isDead;
    }
    public String getMessage() {
        return "\nWE ARE HERE";
    }

}
