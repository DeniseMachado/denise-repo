package org.academiadecodigo.stringrays.wordreader;

public class Main {

    public static void main(String[] args) {

        Wordreader wordreader = new Wordreader("wordreader.txt");

        wordreader.readFile();


        for(String wordreader1 : wordreader) {
            System.out.println(wordreader1);

        }

    }
}
