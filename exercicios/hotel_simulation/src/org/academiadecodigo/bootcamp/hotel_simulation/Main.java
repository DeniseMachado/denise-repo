package org.academiadecodigo.bootcamp.hotel_simulation;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("António");
        Room chicRoom = new Room();
        Hotel hotel = new Hotel("Das Pombas", chicRoom);

        //Estou a chamar o método checkIn do meu objecto hotel das pombas
        //O hotel comunica diretamente com o quarto
        hotel.checkIn();

        System.out.println(client1.getName());


        hotel.checkOut();

        //Aqui o cliente comunicou com o hotel e o hotel com o quarto
        client1.checkIn(hotel);

        client1.checkOut(hotel);

    }
}


