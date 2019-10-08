package org.academiadecodigo.stringrays.sniper_elite.fff;



public class ArmouredEnemy extends Enemy {

    private int armour;

    public ArmouredEnemy(int health, int armour) {
        super(health);
        this.armour = armour;
        System.out.println("I have " + health + "health and " + armour + "armour!");
    }

    @Override
    public void hit(int damage) {
        armour -= damage;

        if (armour < 1) {
            armour -= hit;
            System.out.println("\nI'm a Armoured Enemy! I was hit " + hit + " times, and I lost " + armour + " of my armour...");
            return;
        }

        super.hit(hit);


    }
}

