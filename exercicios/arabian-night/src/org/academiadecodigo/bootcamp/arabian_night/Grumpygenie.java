package org.academiadecodigo.bootcamp.arabian_night;


public class Grumpygenie extends Genie {

    public Grumpygenie(int maxWishes) {
        super(maxWishes);
    }

    //Só garante um desejo de cada vez e garante apenas um no total
    @Override
    public void grantOneWish() {
        if (wishesConced < 1) { //So garante 1 desejo. Se for maior que um já nao garante
            super.grantOneWish();
            return;
        }

        System.out.println("No more wishes");


    }


}


