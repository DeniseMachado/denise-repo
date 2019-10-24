package org.academiadecodigo.bootcamp.rockscissorpaper;

public class Player {

    private String name;
    private int victories = 0;

    public Player(String name) {
        this.name = name;
    }


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

    public int getVictories() {
        return victories;
    }

    public void win() {
        victories++;
    }
}
