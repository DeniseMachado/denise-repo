package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.RGN;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {

    private Position position;
    private Car newCar;

    public static Car getNewCar() {

        int row = (int) Math.floor(Math.random() * (Field.getHeight()));
        int col = (int) Math.floor(Math.random() * (Field.getWidth()));

        Position position = new Position(row, col);
        Car carToReturn = null;

       switch(CarType.getCar()) {

           case FIAT:
               carToReturn = new Fiat(position);
               break;

           case MUSTANG:
               carToReturn = new Mustang(position);
               break;
       }
       return carToReturn;

    }




}
