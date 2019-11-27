package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.RGN;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;
    private boolean crashed = false;




    //Constructor da minha classe abstracta car
    public Car(Position pos) {
        this.pos = pos;
    }
    //para ir buscar a posição da classe Position
    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public void crash(Car[] cars) {
        for (int j = 0; j < cars.length; j++) {
            if (this.getPos().getCol() == cars[j].getPos().getCol() &&
                    this.getPos().getRow() == cars[j].getPos().getRow() &&
                    this != cars[j]) {
                this.setCrashed(true);
                cars[j].setCrashed(true);
            }

        }
    }


    public void moveAround() {
        if (this.isCrashed()) {
            return;
        }

        int number = RGN.generate(0, 4);

        switch (number) {
            case 0://move down
                if (pos.getRow() < Field.getHeight() - 1) {
                    pos.setRow(pos.getRow() + 1);
                }
                break;

            case 1://move up
                if (pos.getRow() > 0) {
                    pos.setRow(pos.getRow() - 1);
                }
                break;

            case 2://move left
                if (pos.getCol() > 0) {
                    pos.setCol(pos.getCol() - 1);
                }
                break;

            case 3://move right
                if (pos.getCol() < Field.getWidth() - 1) {
                    pos.setCol(pos.getCol() + 1);
                }
        }

    }

}




