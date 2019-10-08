package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

import java.awt.*;

public class Fiat extends Car {


    public Fiat(Position pos) {
        super(pos);
    }

    @Override
    public String toString() {
        if (!isCrashed()) {
            return "F";
        }
        return "C";


    }

}