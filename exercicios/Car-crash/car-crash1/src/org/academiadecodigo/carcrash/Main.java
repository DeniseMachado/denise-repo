package org.academiadecodigo.carcrash;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int cols = 100;
        int rows = 25;
        int delay = 200;
        Game g = new Game(cols, rows, delay);

        g.init(); // Creates a bunch of cars and randomly puts them in the field
        g.start(); // Starts the car crash animation

    }
}
