package org.academiadecodigo.bootcamp.calculator;

public class Calculator {

    private String brand;
    private String color;
    private Brain brain;
    private Display display;
    private static int calculatorManufactured;

    public Calculator(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.brain = new Brain();
        this.display = new Display();
        calculatorManufactured++;

    }

    public void caclculate(OperationType operation, int numberOne, int numberTwo) {

        int result = brain.makeOperation(operation, numberOne, numberTwo);

        display.showTheResult(result);

    }

    public static int getCalculatorManufactured() {
        return calculatorManufactured;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


