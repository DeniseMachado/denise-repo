package org.academiadecodigo.bootcamp.hotel_simulation;

public class Client {

    private String name;
    private Hotel hotel;
    private int roomId = -1; //means no room ID

    public Client(String name) {
        this.name = name;
    }

    public boolean checkIn() {
        if (hotel == null || roomId != -1) {
            return false;
        }

        roomId = hotel.checkIn();
        if (roomId == -1) {
            return false;
        }
        return true;
    }

    public boolean checkOut() {
        if (hotel == null || roomId == -1) {
            return false;
        }

        hotel.checkOut(roomId);
        roomId = -1;
        return true;
    }


    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client: " + name + ". " + (hotel == null ? "." : hotel) +
                ", roomId = " + (roomId == -1 ? "" : roomId) + ".";

    }

}
