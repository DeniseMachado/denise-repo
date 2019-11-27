package org.academiadecodigo.stringrays.sniperelite.gameobject.enemy;

/**
 * An enemy with an armour
 */


public class ArmouredEnemy extends Enemy {

    private int armour;

    public ArmouredEnemy(int health, int armour) {
        super(health);
        this.armour = armour;
        System.out.println("I have " + health + "health and " + armour + "armour!");
    }

    /**
     * Damage hits armour, if armour is lost it proceds to take damage
     * @see Enemy#hit(int)
     */
    @Override
    public void hit(int damage) {

        if(armour > damage) {
            armour -= damage;
            return;
        }

        damage -= armour;
        armour = 0;
        super.hit(damage);


    }
}

