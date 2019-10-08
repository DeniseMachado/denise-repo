package org.academiadecodigo.bootcamp.stringrays.arabian.genie;

public class GrumpyGenie extends Genie {

    private boolean wishGranted = false;

    public GrumpyGenie() {
        System.out.println("I was sleeping... I'm not a morning genie. (My name is Paulo)");
    }

    @Override
    public void grantWish() {
        if (wishGranted) {
            System.out.println("I'm pouting. Go away!");
            return;
        }

        wishGranted = true;
        super.grantWish();
    }

}
