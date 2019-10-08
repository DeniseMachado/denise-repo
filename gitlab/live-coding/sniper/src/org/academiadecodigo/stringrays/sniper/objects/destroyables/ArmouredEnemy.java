package org.academiadecodigo.stringrays.sniper.objects.destroyables;

public class ArmouredEnemy extends Enemy {

    private int armour;

    public ArmouredEnemy(int health, int armour) {
        super(health);
        this.armour = armour;
        System.out.println("I have " + health + " health and " + armour + " armour.");
    }

    @Override
    public void hit(int damage) {
        armour -= damage;

        if (armour < 1) {
            System.out.println("Taking health damage now... Where's my crappy armour???");
            int remainingDamage = Math.abs(armour);
            armour = 0;
            super.hit(remainingDamage);
        }
    }

    @Override
    public String getMessage() {
        return "Me has armour, you cannot kill me. Muahaha";
    }
}
