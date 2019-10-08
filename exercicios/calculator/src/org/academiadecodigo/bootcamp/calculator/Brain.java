package org.academiadecodigo.bootcamp.calculator;

public class Brain {


    public int makeOperation(OperationType operation, int numberOne, int numberTwo) {

        switch (operation) {
            case ADD:
                return numberOne + numberTwo;
            case DIVIDE:
                return numberOne / numberTwo;
            case MULTIPLY:
                return numberOne * numberTwo;
            case SUBTRACT:
                return numberOne - numberTwo;

        }
        return 0;

    }
}
