package org.academiadecodigo.stringrays.sniper.objects.destroyables;

import org.academiadecodigo.stringrays.sniper.objects.BarrelType;
import org.academiadecodigo.stringrays.sniper.objects.GameObject;

public class Barrel extends GameObject implements Destroyable  {

    private int currentDamage;
    private BarrelType barrelType;
    private boolean destroyed;

    public Barrel(BarrelType barrelType) {
        this.barrelType = barrelType;
    }

    @Override
    public void hit(int damage) {
        currentDamage += damage;

        System.out.println("thud");

        if (currentDamage >= barrelType.getMaxDamage()) {
            System.out.println("I was inside...");
            destroyed = true;
        }
    }

    @Override
    public String getMessage(){
        return "I'm rolling.";
    }


    @Override
    public boolean isDestroyed() {
        return destroyed;
    }
}
