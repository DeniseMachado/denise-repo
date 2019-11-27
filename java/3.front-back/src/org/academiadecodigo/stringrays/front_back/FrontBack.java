package org.academiadecodigo.stringrays.front_back;

public class FrontBack {

    public static void main(String[] args) {

        frontBack("Heisenberg");

        if (args.length > 0) {
            frontBack(args[0]);
        }

    }

    private static void frontBack(String string) {

        //we need to make sure the string has more than one character
        //to reverse the front and back chars


        //select the middle string
        //exclude the first and the last char
        //eisenber
        char start = string.charAt(0);
        int mid = string.length() - 1;
        char end = string.charAt(mid);

        //last + mid + first
        System.out.println(end + string.substring(1, mid) + start);
    }


}
