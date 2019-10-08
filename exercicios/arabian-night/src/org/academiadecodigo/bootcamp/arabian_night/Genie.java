package org.academiadecodigo.bootcamp.arabian_night;

public class Genie { //Concede o numero de desejocs

     public int maxNumberOfWishes; //numero máximo de desejos
    public int wishesConced; //numero de desejos concedidos



    public Genie(int maxNumberOfWishes) {
        this.maxNumberOfWishes = maxNumberOfWishes;
        this.wishesConced = 0; //para iniciar em zero
    }

    public void grantOneWish() {

        System.out.println("Your wish is granted!");
        wishesConced++; //quando um desejo é concedido o numero aumenta em 1

        System.out.println("Sorry, you already had all your wishes granted");
    }

}

