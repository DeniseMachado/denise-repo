package org.academiadecodigo.stringrays.sniper_elite;

import org.academiadecodigo.stringrays.sniper_elite.Object.SniperRifle;
import org.academiadecodigo.stringrays.sniper_elite.Object.SoldierEnemy;
import org.academiadecodigo.stringrays.sniper_elite.Object.Tree;

public class Game {


    private SniperRifle sniperRifle;
    private int shotsFired;
    private GameObject[] gameObjects;


    public Game(SniperRifle sniperRifle) {
        this.sniperRifle = sniperRifle;


    }


    public void start() {
        for (GameObject gameObject : gameObjects) {
            if (gameObject instanceof Enemy) { //Para confirmar se um objecto é uma instancia da Classe Enemy
                Enemy enemy = (Enemy) gameObject; //cast, ppara forçar o meu gameObject a ser do tipo Enemy
                sniperRifle.shoot(enemy); //Disparar apenas sobre os inimigos

                while (!enemy.isDead()) {
                    shotsFired++;
                    System.out.println("Enemy was shot " + shotsFired + " times");
                    break;
                }


                if (!enemy.isDead()) { //isDead esta a retornar falso, aqui retorna verdadeiro, est\ao mortos
                    System.out.println("Enemy is DEAD");
                }

            }

        }
    }

    public GameObject[] createObject(int numberOfObjects) {

        this.gameObjects = new GameObject[numberOfObjects];
        System.out.println("\nCREATING NEW:");

        for (int i = 0; i < gameObjects.length; i++) {
            int random = (int) (Math.random() * 10 + 1);
            if (random <= 2) {
                gameObjects[i] = new Tree();
                System.out.println("TREES");
                continue;
            }
            if (random <= 6) {
                gameObjects[i] = new SoldierEnemy();
                System.out.println("SOLDIER ENEMY");
                continue;
            }
            gameObjects[i] = new ArmouredEnemy();
            System.out.println("ARMOURED ENEMY");

        }
        return gameObjects;


    }

}

