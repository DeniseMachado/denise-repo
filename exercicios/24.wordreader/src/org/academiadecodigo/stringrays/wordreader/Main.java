package org.academiadecodigo.stringrays.wordreader;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Wordreader wordreader = new Wordreader("wordreader.txt");

        wordreader.readFile();


        for(String wordreader1 : wordreader) {
            System.out.println(wordreader1);

        }

        Iterator<String> iterator = wordreader.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
