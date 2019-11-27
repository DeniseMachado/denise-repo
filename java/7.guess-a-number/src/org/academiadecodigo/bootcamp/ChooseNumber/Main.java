package org.academiadecodigo.bootcamp.ChooseNumber;

public class Main {

    public static void main(String[] args) {

       Player player1 = new Player();
       Game game = new Game(10,20);


       game.play(player1);


    }
}
