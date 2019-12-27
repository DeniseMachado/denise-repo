package com.company;

public class Main {

    public static void main(String[] args) {

        String str;

        str = "This website is for losers LOL";
        String newStr = str.replaceAll("[AaEeIiOoUu]", "");
        System.out.println("\n" + newStr);


    }
}
