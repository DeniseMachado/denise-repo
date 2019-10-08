package org.academiadecodigo.stringrays.sniper_elite.Object;

public class SniperRifle {

    private int bulletDamage;

    public SniperRifle() {
        bulletDamage = (int) (Math.random() * 10 + 5);

    }

    public void shoot(Enemy enemy) {

        //9% probabilidade de atingir e 1% probabilidade de não atingir
        int probabilityOfHitting = (int) (Math.random() * 10);
        enemy.hit(probabilityOfHitting);

        System.out.println("\nMy sniper rifle has " + probabilityOfHitting + "% of probability of hitting Enemies!");

        if (probabilityOfHitting <= 1) { //n\ao atinge os inimigos
            System.out.println("\nWith only " + probabilityOfHitting + "% of probability I hit them!");
            return;
        }
        bulletDamage++;

        System.out.println("I'm a Sniper Rifle and my bullet damage is " + bulletDamage + ".");

    }
}





