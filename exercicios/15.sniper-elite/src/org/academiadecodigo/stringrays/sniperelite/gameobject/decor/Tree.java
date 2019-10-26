package org.academiadecodigo.stringrays.sniperelite.gameobject.decor;

import org.academiadecodigo.stringrays.sniperelite.gameobject.GameObject;

/**
 * A simple tree, not worthy of getting shot
 */

public class Tree extends GameObject {

    @Override
    public String getMessage() {
        return "Just a Tree. Save the Trees!";
    }
}
