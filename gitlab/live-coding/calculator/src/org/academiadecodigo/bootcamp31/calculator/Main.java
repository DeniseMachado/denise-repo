package org.academiadecodigo.bootcamp31.calculator;

public class Main {

    public static void main(String[] args) {

        Calculator basicCalculator = new Calculator("Casio", "Hot Pink");

        ScientificCalculator scientificCalculator = new ScientificCalculator("Texas");

        System.out.println(scientificCalculator.getBrand());
    }
}
