package org.academiadecodigo.bootcamp.ChooseNumber;

public class RNG {

    //RGN To generate a number
    public static int generator(int min, int max) { //Static porque é do tipo utilitario para utilizar este método tenho de interagir deretamente com a classe

        int number = (int) Math.floor(Math.random() * (max - min)) + min;

        return number;

    }
}

