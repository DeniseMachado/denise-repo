package org.academiadecodigo.bootcamp.stringrays.arabian.genie;

public class FriendlyGenie extends Genie {


    public FriendlyGenie() {
        System.out.println("Hello! I'm a morning person. My name is not Paulo.");
    }

    @Override
    public void grantWish() {
        if (getRemainingWishes() <= 0) {
            System.out.println("You have no more wishes, get another genie. Rub your lamp...");
            return;
        }

        super.grantWish();
    }
}
