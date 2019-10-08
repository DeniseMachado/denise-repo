package org.academiadecodigo.carcrash.cars;

public enum CarType {
    FIAT,
    MUSTANG;


    public static CarType getCar() {
        return values()[(int) (Math.random() * values().length)];
    }


}
