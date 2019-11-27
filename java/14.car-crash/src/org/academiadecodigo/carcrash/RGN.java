package org.academiadecodigo.carcrash;

public class RGN {

    public static int generate(int min, int max) {


        //Para gerar carros aleatórios para usar com o enum
        int number = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return number;
    }
}
