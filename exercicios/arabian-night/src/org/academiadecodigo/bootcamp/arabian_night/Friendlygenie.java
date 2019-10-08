package org.academiadecodigo.bootcamp.arabian_night;

public class Friendlygenie extends Genie {

    public Friendlygenie(int maxNumberOfWishes) { // número máximo de desejos a ser concedidos
        super(maxNumberOfWishes);
    }


    //Concede um desejo de cada vez

    @Override
    public void grantOneWish() {
    if (wishesConced < maxNumberOfWishes) {

        super.grantOneWish();
    }

        System.out.println("Sorry, you already had all wishes granted!");
    }


}
