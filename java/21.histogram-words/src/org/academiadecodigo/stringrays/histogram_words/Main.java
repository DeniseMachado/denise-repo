package org.academiadecodigo.stringrays.histogram_words;

public class Main {

    public static void main(String[] args) {

        HistogramComposition histogramComposition = new HistogramComposition("A a Mariana Mariana está a comer bolachas a a a a a ");
        System.out.println("MAP has " + histogramComposition.size() + " distinct words");

        System.out.println(histogramComposition.toString());


    }

}
