package org.academiadecodigo.bootcamp.hotel_simulation;

public class Room {


    private int numb;
    private boolean available;

    public Room() {
        available = true;
    }

    // Metodo: Muda o estado do quarto. Livre ou Ocupado
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Metodo: Ve o estado do quarto.
    public boolean getAvailable() {
        return this.available;
    }

}
