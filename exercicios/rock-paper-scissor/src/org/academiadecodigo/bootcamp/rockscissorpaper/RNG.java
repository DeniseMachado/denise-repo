package org.academiadecodigo.bootcamp.rockscissorpaper;

public class RNG {

    public static int generate(int min, int max) {

        int number = (int) Math.floor(Math.random() * (max - min + 1)) + min;
        return number;
    }
}
