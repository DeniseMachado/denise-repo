package org.academiadecodigo.stringrays.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Main {
    public static void main(String[] args) {

        Grid grid = new Grid(10,10);
        grid.drawGrid();

        Cursor cursor = new Cursor(1,1,grid);
        cursor.init();













    }
}
