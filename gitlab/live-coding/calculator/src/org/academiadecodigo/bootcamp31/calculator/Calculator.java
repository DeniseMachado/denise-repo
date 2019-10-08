package org.academiadecodigo.bootcamp31.calculator;

public class Calculator {

    private String brand;
    private String color;
    private Brain brain;
    private Display display;
    private static int calculatorsManufactored;

    public Calculator(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.brain = new Brain();
        this.display = new Display();
        calculatorsManufactored++;
    }

    public void calculate(OperationType operation, int numberOne, int numberTwo) {

        int result = brain.makeOperation(operation, numberOne, numberTwo);

        display.showResult(result);
    }

    public static int getCalculatorsManufactored() {
        return calculatorsManufactored;
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
