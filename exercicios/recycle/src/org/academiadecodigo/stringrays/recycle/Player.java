package org.academiadecodigo.stringrays.recycle;

public class Player {

    public Container chooseContainer() {

        int numb = RNG.generate(0,10);

        switch (numb) {
            case 0:
                return Container.YELLOW;

            case 1:
                return Container.GREEN;

            case 2:
                return Container.BLUE;

            case 3:
                return Container.BLACK;
        }
        return null;
    }
}
