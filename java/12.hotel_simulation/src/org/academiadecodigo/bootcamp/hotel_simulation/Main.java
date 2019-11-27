package org.academiadecodigo.bootcamp.hotel_simulation;

public class Main {

    public static void main(String[] args) {

     Hotel cenoura = new Hotel("cenoura", 10);
     Hotel horta = new Hotel("Horta", 50);
     Client client = new Client("Denise");
     Client client1 = new Client("Helder");


     client.setHotel(cenoura);
     client1.setHotel(horta);


     if(!client1.checkIn()) {
         System.out.println("Could not get a room for " + client1.getName());
     }

     if(!client.checkIn()) {
         System.out.println("Could not get a room for " + client.getName());
     }

     client1.checkOut();
     client.checkOut();

     if(client.checkOut()) {
         System.out.println("Unable to checkout twice in a room");
     }

     if(client.checkIn() && !client.checkIn()) {
         System.out.println("Could not check-in twice!");
     }

     if(client.checkOut() && client.checkIn()) {
         System.out.println("CheckIn after check-out works fine!!");
     }


        System.out.println(cenoura);
        System.out.println(horta);
        System.out.println(client);
        System.out.println(client1);

    }
}


