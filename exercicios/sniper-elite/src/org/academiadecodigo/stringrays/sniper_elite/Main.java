package org.academiadecodigo.stringrays.sniper_elite;

import org.academiadecodigo.stringrays.sniper_elite.Object.SniperRifle;

public class Main {

    public static void main(String[] args) {

        Game game = new Game(new SniperRifle());

        game.createObject(10);



        game.start();

    }
}
