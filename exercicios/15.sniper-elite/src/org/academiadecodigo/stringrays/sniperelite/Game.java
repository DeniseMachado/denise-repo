package org.academiadecodigo.stringrays.sniperelite;

import org.academiadecodigo.stringrays.sniperelite.gameobject.Destroyable;
import org.academiadecodigo.stringrays.sniperelite.gameobject.GameObjectFactory;
import org.academiadecodigo.stringrays.sniperelite.gameobject.weapons.SniperRifle;
import org.academiadecodigo.stringrays.sniperelite.gameobject.enemy.SoldierEnemy;
import org.academiadecodigo.stringrays.sniperelite.gameobject.GameObject;


public class Game {

    public static final double ENEMIE_PROBABILITY = 0.7;
    public static final int BULLET_DAMAGE = 1;


    private SniperRifle sniperRifle;
    private GameObject[] gameObjects;


    public Game(int numberObjects) {

        this.gameObjects = createObject(numberObjects);
        this.sniperRifle = new SniperRifle(BULLET_DAMAGE);

    }

    /**
     * Start shooting
     */

    public void start() {

        for (GameObject gameObject : gameObjects) {
            if (gameObject instanceof Destroyable) { //Para confirmar se um objecto é uma instancia da Classe Destoyable

                Destroyable target = (Destroyable) gameObject;

                while (!target.isDestroyed()) {

                    System.out.println("Making the shot...");
                    sniperRifle.shoot(target);
                }

                System.out.println("Target is neutralized. I repeat, Target is neutralized");
            }

        }

        System.out.println("All targets are down. " + sniperRifle.getShootsFired() + "shots.");

    }


    private GameObject[] createObject(int numberOfObjects) {

        GameObject[] gameObjects = new GameObject[numberOfObjects];

        for (int i = 0; i < gameObjects.length; i++) {

            gameObjects[i] = Math.random() < ENEMIE_PROBABILITY ? GameObjectFactory.createEnemy() : GameObjectFactory.creatObject();

        }
        return gameObjects;
    }

}

