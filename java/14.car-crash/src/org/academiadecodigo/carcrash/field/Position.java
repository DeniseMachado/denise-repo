package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.RGN;
import org.academiadecodigo.carcrash.cars.CarType;

public class Position {

    private int row;
    private int col;


    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int val) {
        this.col = val;
    }

    public void setRow(int val) {
        this.row = val;
    }


}
