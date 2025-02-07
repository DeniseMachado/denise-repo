package org.academiadecodigo.bootcamp.gfx.simplegfx;

import org.academiadecodigo.bootcamp.grid.GridColor;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import javax.swing.text.Position;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;

    /**
     * Simple graphics position constructor
     *
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid) {
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);

        this.rectangle = new Rectangle(grid.columnToX(getCol()), grid.rowToY(getRow()), grid.getCellSize(), grid.getCellSize());
        this.simpleGfxGrid = grid;
        show();

    }

    /**
     * Simple graphics position constructor
     *
     * @param col  position column
     * @param row  position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid) {
        super(col, row, grid);

        this.rectangle = new Rectangle(grid.columnToX(col), grid.rowToY(row),grid.getCellSize(),grid.getCellSize());
        this.simpleGfxGrid = grid;
        show();


    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        rectangle.fill();

    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {
      int posInitCol = getCol();
      int posInitRow = getRow();

      super.moveInDirection(direction,distance);

      int posFinalCol = getCol() - posInitCol;
      int posFinalRow = getRow() - posInitRow;

      rectangle.translate(posFinalCol * simpleGfxGrid.getCellSize(), posFinalRow * simpleGfxGrid.getCellSize());


    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        super.setColor(color);
        rectangle.setColor(SimpleGfxColorMapper.getColor(color));
    }
}
