package org.academiadecodigo.stringrays.sniperelite.gameobject;

import org.academiadecodigo.stringrays.sniperelite.gameobject.decor.Tree;
import org.academiadecodigo.stringrays.sniperelite.gameobject.enemy.ArmouredEnemy;
import org.academiadecodigo.stringrays.sniperelite.gameobject.enemy.Enemy;
import org.academiadecodigo.stringrays.sniperelite.gameobject.enemy.SoldierEnemy;
import org.academiadecodigo.stringrays.sniperelite.gameobject.props.Barrel;

public class GameObjectFactory {

    public static int ENEMY_HEALTH = 3;
    public static int ARMOUR = 3;

    public static Enemy createEnemy() {

        return Math.random() > 0.5 ? new SoldierEnemy(ENEMY_HEALTH) : new ArmouredEnemy(ENEMY_HEALTH, ARMOUR);
    }

    public static GameObject creatObject() {

        return Math.random() > 0.5 ? new Tree() : new Barrel();
    }
}
