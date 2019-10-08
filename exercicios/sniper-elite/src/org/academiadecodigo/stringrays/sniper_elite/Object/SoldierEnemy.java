package org.academiadecodigo.stringrays.sniper_elite.Object;

public class SoldierEnemy  extends Enemy {


    public void hit(int hit) {
        super.hit(hit);
        System.out.println("\nI'm a Soldier Enemy! I was hit " + hit + " times!");

    }
    @Override
    public String getMessage() {
        return "Hello, me ins soldier, from Russia apparently...";
    }

    @Override
    public
}
