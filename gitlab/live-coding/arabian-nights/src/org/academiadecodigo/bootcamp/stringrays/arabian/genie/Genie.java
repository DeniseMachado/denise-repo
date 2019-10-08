package org.academiadecodigo.bootcamp.stringrays.arabian.genie;

public class Genie {

    private int remainingWishes;

    public Genie() {
        this.remainingWishes = (int) (Math.random() * 3 + 1);
        System.out.println("Hello! You have " +
                remainingWishes +
                " wishes to ask, use them wisely!");
    }


    public void grantWish() {
        System.out.println("Wish granted");
        remainingWishes--;
    }

    public int getRemainingWishes() {
        return remainingWishes;
    }
}
