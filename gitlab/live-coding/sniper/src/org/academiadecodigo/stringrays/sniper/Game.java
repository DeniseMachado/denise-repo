package org.academiadecodigo.stringrays.sniper;

import org.academiadecodigo.stringrays.sniper.objects.BarrelType;
import org.academiadecodigo.stringrays.sniper.objects.GameObject;
import org.academiadecodigo.stringrays.sniper.objects.Tree;
import org.academiadecodigo.stringrays.sniper.objects.destroyables.Barrel;
import org.academiadecodigo.stringrays.sniper.objects.destroyables.Enemy;

public class Game {


    private GameObject[] gameObjects;
    private SniperRifle sniper;


    public void createObjects(int quantity) {

        gameObjects = new GameObject[quantity];
        sniper = new SniperRifle(12);

        for (int i = 0; i < quantity; i++) {
            double chance = Math.random();

            if (chance < 0.1) {
                gameObjects[i] = new Tree();
                continue;
            }

            if (chance < 0.4) {
                gameObjects[i] = createBarrel();
                continue;
            }


            gameObjects[i] = createEnemy();

            // create Enemies
        }
    }


    private Enemy createEnemy() {
        // logic to create an enemy

        return null;
    }

    private Barrel createBarrel() {

        return new Barrel(BarrelType.randomType());
    }


    // create objects
    // start
}
