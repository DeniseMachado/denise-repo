package org.academiadecodigo.stringrays.sniper.objects.destroyables;

public class SoldierEnemy extends Enemy {


    public SoldierEnemy(int health) {
        super(health);
    }


    @Override
    public String getMessage() {
        return "Hello, me is soldier, from Russia apparently...";
    }
}
