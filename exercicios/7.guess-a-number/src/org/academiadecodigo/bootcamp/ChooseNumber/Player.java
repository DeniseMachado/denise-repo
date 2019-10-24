package org.academiadecodigo.bootcamp.ChooseNumber;

public class Player {


    public int chooseNumber(int min, int max) {

        int choose = RNG.generator(min, max);
        return choose;
    }
}
