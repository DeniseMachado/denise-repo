package org.academiadecodigo.stringrays.string_manipulation;

public class StringManipulation {

    public static void main(String[] args) {


        String url = "http://www.academiadecodigo.org";

        //www.academiadecodigo.org
        String domain = url.substring(url.lastIndexOf("/") + 1);

        //academiadecodigo
        String name = url.substring(url.indexOf(".") + 1, url.lastIndexOf("."));

        //get last "a" of academia
        int academiaEnd = name.lastIndexOf("a");

        //get first "c" of codigo
        int codigoStart = name.lastIndexOf("c");

        String academia = name.substring(0, academiaEnd + 1); //academia
        String de = name.substring(academiaEnd + 1, codigoStart); //de
        String codigo = name.substring(codigoStart);

        academia = academia.substring(0, 1).toUpperCase() + academia.substring(1);
        codigo = codigo.substring(0, 1).toUpperCase() + codigo.substring(1);

        //< Academia de Codigo_ >
        name = "<" + academia + " " + de + " " + codigo + "_> ";

        System.out.println("I am a Code Cadet at " + name + ", " + domain);


    }
}