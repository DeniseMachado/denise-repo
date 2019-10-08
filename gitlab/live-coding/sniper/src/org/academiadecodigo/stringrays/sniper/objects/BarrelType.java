package org.academiadecodigo.stringrays.sniper.objects;

public enum BarrelType {

    PLASTIC(12),
    METAL(53),
    WOOD(22);

    private int maxDamage;

    BarrelType(int maxDamage) {
        this.maxDamage = maxDamage;
    }


    public int getMaxDamage() {
        return maxDamage;
    }

    public static BarrelType randomType() {
        int index = (int) (Math.random() * BarrelType.values().length);

        return BarrelType.values()[index];
    }
}
