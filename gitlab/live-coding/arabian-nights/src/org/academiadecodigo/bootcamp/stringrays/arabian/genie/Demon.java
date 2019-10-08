package org.academiadecodigo.bootcamp.stringrays.arabian.genie;

public class Demon extends Genie {

    private boolean recycled;

    public Demon() {
        System.out.println("Welcome to hell!");
    }

    @Override
    public void grantWish() {
        if (recycled) {
            System.out.println("I'm spent. I feel used...");
            return;
        }

        super.grantWish();
    }


    public void recycle() {
        recycled = true;
    }


    public boolean isRecycled() {
        return recycled;
    }
}
