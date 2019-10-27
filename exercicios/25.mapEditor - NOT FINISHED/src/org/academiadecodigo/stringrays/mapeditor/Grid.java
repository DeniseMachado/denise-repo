package org.academiadecodigo.stringrays.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    private int cols;
    private int rows;
    private Rectangle grid;
    public static final int PADDING = 10;
    private int cellSize;



    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.cellSize = 50;

    }


    public void drawGrid() {


        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                Rectangle grid = new Rectangle(col*cellSize + PADDING,
                        row*cellSize + PADDING, cellSize, cellSize);
                grid.draw();
            }


        }

    }


    public int getCellSize() {
        return cellSize;
    }

    public int colsToX(int cols) {
        return cols * cellSize + PADDING;
    }
    public int rowToY(int row) {
        return row * cellSize + PADDING;
    }

    public int getWidth() {
        return grid.getWidth();
    }

    public int getHeight() {
        return grid.getHeight();
    }

    public int getX() {
        return grid.getX();
    }
    public int getY() {
        return grid.getY();
    }
}