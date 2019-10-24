package org.academiadecodigo.bootcamp.calculator;

public class ScientificCalculator extends Calculator {

    public ScientificCalculator(String brand) {
        super(brand, "Yellow");
    }

    @Override
    public String getBrand() {
        return "The brand is Scientific!";

    }
}

