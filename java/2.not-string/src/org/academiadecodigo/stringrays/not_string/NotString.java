package org.academiadecodigo.stringrays.not_string;

public class NotString {

    public static void main(String[] args) {

        notString(" semicolon");
        notString("not bad");

    }

    public static void notString(String string) {

        String string1 = string.substring(0, 3);

        //if the string has 3 or more chars
        //and the first three chars are equal to "not"

        if (string1.equals("not")) {
            System.out.println(string);
        } else {
            System.out.println("not".concat(string));
        }

    }

}
