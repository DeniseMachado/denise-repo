package com.company;

public class Troll {

    public static String disemvowel(String str) {
        str = "This website is for losers LOL";
        String newStr = str.replaceAll("[AaEeIiOoUu]", "");
        return newStr;
    }

}
