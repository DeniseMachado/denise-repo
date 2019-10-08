package org.academiadecodigo.bootcamp.rockscissorpaper;

public class Game {

    private Player player1;
    private Player player2;
    private int rounds;
    private int round;

    public Game(Player player1, Player player2, int rounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.rounds = rounds;


    }

    public void play() {

        System.out.println("Let's play");


        while (round < rounds) {


            Hand hand1 = player1.chooseHand();
            Hand hand2 = player2.chooseHand();


            if (hand1 == Hand.ROCK && hand2 == Hand.SCISSOR || hand1 == Hand.SCISSOR && hand2 == Hand.PAPER || hand1 == Hand.PAPER && hand2 == Hand.ROCK) {
                System.out.println("\nPlayer 1 Won");


            } else if (hand2 == Hand.ROCK && hand1 == Hand.SCISSOR || hand2 == Hand.SCISSOR && hand1 == Hand.PAPER || hand2 == Hand.PAPER && hand1 == Hand.ROCK) {
                System.out.println("\nPlayer 2 Won");


            } else {
                System.out.println("\nIts's a Tie");
            }
            round++;
        }
    }
}
