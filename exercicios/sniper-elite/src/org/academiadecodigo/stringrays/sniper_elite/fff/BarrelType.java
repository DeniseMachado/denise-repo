package org.academiadecodigo.stringrays.sniper_elite.fff;

public enum BarrelType {

    PLASTIC(30),
    WOOD(40),
    METAL(60);

    private int maxDamage;

    BarrelType(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}



