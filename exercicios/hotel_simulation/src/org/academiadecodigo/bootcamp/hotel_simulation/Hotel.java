package org.academiadecodigo.bootcamp.hotel_simulation;

public class Hotel {

    private String name;
    private Room room;

    public Hotel(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    public void checkIn() {
        System.out.println("Welcome");

        //Se o quarto estiver livre passa a ocupado
        if (room.getAvailable()) {
            room.setAvailable(false);

            System.out.println("We have a room for you");


        }

    }

    public void checkOut() {

        //o quarto tem de estar ocupado par afazer checkout

        if (!room.getAvailable()) {
            room.setAvailable(true);

            System.out.println("Checkout");
        }

    }

}
