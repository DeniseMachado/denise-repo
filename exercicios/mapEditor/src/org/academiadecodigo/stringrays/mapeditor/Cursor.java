package org.academiadecodigo.stringrays.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Cursor implements KeyboardHandler {

    private int cols;
    private int rows;
    private Grid grid;
    private Keyboard keyboard;
    private boolean keyLeftPressed;
    private boolean keyRightPressed;
    private boolean keyUpPressed;
    private boolean keyDownPressed;
    private Rectangle cursor;



    public Cursor(int cols, int rows, Grid grid) {
        this.cols = cols;
        this.rows = rows;
        cursor = new Rectangle(grid.colsToX(cols), grid.rowToY(rows), grid.getCellSize(), grid.getCellSize());



    }

    public void init() {
        cursor.fill();
        cursor.setColor(Color.YELLOW);

    }

    //public void moveCursor() {

      //  switch ()





    public void addKeyboardEvent(int key, KeyboardEventType type) {
        KeyboardEvent event = new KeyboardEvent();
        event.setKey(key);
        event.setKeyboardEventType(type);
        keyboard.addEventListener(event);
    }

    public void keyboardKeys() {
        addKeyboardEvent(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);
        addKeyboardEvent(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_RELEASED);
        addKeyboardEvent(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);
        addKeyboardEvent(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_RELEASED);
        addKeyboardEvent(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        addKeyboardEvent(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_RELEASED);
        addKeyboardEvent(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);
        addKeyboardEvent(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_RELEASED);
    }

    @Override
    public void keyPressed(KeyboardEvent e) {
        switch (e.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                keyLeftPressed = true;
                //cursor.translate(-1,0);
                break;

            case KeyboardEvent.KEY_RIGHT:
                keyRightPressed = true;
               // cursor.translate(1,0);
                break;

            case KeyboardEvent.KEY_UP:
                keyUpPressed = true;
               // cursor.translate(0,-1);
                break;

            case KeyboardEvent.KEY_DOWN:
                keyDownPressed = true;
              //  cursor.translate(0,1);
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent e) {
        switch (e.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                keyLeftPressed = false;
                break;

            case KeyboardEvent.KEY_RIGHT:
                keyRightPressed = false;
                break;

            case KeyboardEvent.KEY_UP:
                keyUpPressed = false;
                break;

            case KeyboardEvent.KEY_DOWN:
                keyDownPressed = false;
                break;
        }

    }

}
