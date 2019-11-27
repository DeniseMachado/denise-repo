package org.academiadecodigo.stringrays.sniperelite.gameobject;

/**
 * Implemented by all objects capable of getting shot
 */

public interface Destroyable {

    /**
     * Inflict damage on object
     * @param damage the amount of damage to inflic
     */

    void hit(int damage);

    boolean isDestroyed();

}
