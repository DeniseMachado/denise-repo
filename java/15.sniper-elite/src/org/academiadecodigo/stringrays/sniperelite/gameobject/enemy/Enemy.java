package org.academiadecodigo.stringrays.sniperelite.gameobject.enemy;

import org.academiadecodigo.stringrays.sniperelite.gameobject.Destroyable;
import org.academiadecodigo.stringrays.sniperelite.gameobject.GameObject;

/**
 * An enemy class containing generic enemy functionality and meant for subclassing
 */

public abstract class Enemy extends GameObject implements Destroyable {

    private int health;
    private boolean dead;


    public Enemy(int health) {
        this.health = health;

    }

    public int getHealth() {
        return health;
    }

    @Override
    public boolean isDestroyed() {
        return dead;

    }

    /**
     * Removes health according to the hit damage
     * @param damage the damage impact
     */

    public void hit(int damage) {

        health = health - damage > 0 ? health - damage : 0;
        if(health == 0) {
            dead = true;

        }

    }

    /**
     * @see GameObject##getMessage()
     */

    @Override
    public String getMessage() {
        return "Tango Acquired. Taking it down!";
    }

}
