package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.RGN;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

public class Mustang extends Car {

    private int changePosition;


    public Mustang(Position pos) {
        super(pos);
    }



    @Override
    public String toString() {
        if (!isCrashed()) { //Se n\ao estiver crash retorna o M, se crashar retorna C
            return "M";
        }
        return "C";

    }

    /*public void moveAround() {

        int number1 = RGN.generate(0,4);
        int number2 = RGN.generate(0,10);





    }*/

}


