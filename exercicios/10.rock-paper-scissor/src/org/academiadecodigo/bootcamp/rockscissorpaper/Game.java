package org.academiadecodigo.bootcamp.rockscissorpaper;

public class Game {

    private Player player1;
    private Player player2;
    private int maxRounds;
    private int rounds = 0;

    public Game(Player player1, Player player2, int maxRounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.maxRounds = maxRounds;


    }

    /**
     * Start the game
     */

    public void start() {

        System.out.println("Let's play");


        while (rounds < maxRounds) {
            playRound();

        }
        displayResults();
    }

    /**
     * Plays a round of the game
     */

    private void playRound() {

        Hand player1Hand = player1.chooseHand();
        Hand player2Hand = player2.chooseHand();

        System.out.println(player1.getName() + " has " + player1.getVictories() + " victories, now chooses: " + player1Hand);
        System.out.println(player2.getName() + " has " + player2.getVictories() + " victories, now chooses: " + player2Hand);

        //It's a tie, let' play another round
        if (player1Hand == player2Hand) {
            playRound();
            return;
        }
        rounds++;

        Player winner = player1;

        switch (player1Hand) {
            case PAPER:
                if (player2Hand == Hand.SCISSOR) {
                    winner = player2;
                }
                break;

            case ROCK:
                if (player2Hand == Hand.PAPER) {
                    winner = player2;
                }
                break;

            case SCISSOR:
                if (player2Hand == Hand.ROCK) {
                    winner = player2;
                }
                break;
        }

        winner.win();
    }

    private void displayResults() {

        System.out.println("\n==== GAME END ===");
        System.out.println("\n" + player1.getName() + " has: " + player1.getVictories() + " victories");
        System.out.println(player2.getName() + " has: " + player2.getVictories() + " victories");

        System.out.println("\nWINNER IS : " + (player1.getVictories() > player2.getVictories() ? player1.getName() : player2.getName()));
    }
}
