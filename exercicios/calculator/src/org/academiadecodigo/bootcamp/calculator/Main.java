package org.academiadecodigo.bootcamp.calculator;

public class Main {

    public static void main(String[] args) {

        Calculator basicalculator = new Calculator("Azorean", "Red");

        ScientificCalculator scientificCalculator = new ScientificCalculator("Scientific");


        System.out.println("The brand is " + basicalculator.getBrand());
        System.out.println(scientificCalculator.getBrand());


    }
}
