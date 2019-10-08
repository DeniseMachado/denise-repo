package org.academiadecodigo.bootcamp.ChooseNumber;

import java.sql.SQLOutput;

public class Game { //classe

    private int min;
    private int max;


    public Game(int min, int max) {
        this.min = min;
        this.max = max;

    }

    public void play(Player player) {


        int target = RNG.generator(min, max);
        int playerChoice = player.chooseNumber(min, max);

        System.out.println("Game number: " + target);


        while (target != playerChoice) {

            playerChoice = player.chooseNumber(min, max);

            System.out.println("\nPlayer choice: " + playerChoice);

        }

        System.out.println("\nYou Won!");

    }
}




