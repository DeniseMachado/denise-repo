package org.academiadecodigo.bootcamp.rockscissorpaper;

public class Player {

    private String name;


    public Hand chooseHand() {

        int numb = RNG.generate(0, 2);

        switch (numb) {

            case 0:
                return Hand.ROCK;


            case 1:
                return Hand.SCISSOR;


            case 2:
                return Hand.PAPER;

        }
        return null;

    }

    public String getName() {
        return name;
    }
}
