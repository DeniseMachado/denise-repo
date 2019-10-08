package org.academiadecodigo.bootcamp.hotel_simulation;

public class Client {

    private String name;

    public Client (String name) {
        this.name = name;
    }

    public void checkIn(Hotel batata) {
        //Como argumento tenho uma variavel batata do tipo Hotel.
        //Estou a invocar o método checkIn da classe Hotel com a nova variavel batata
        batata.checkIn();
    }

    public void checkOut(Hotel cenoura) {
        cenoura.checkOut();
    }





    public String getName() {
        return name;
    }

}
