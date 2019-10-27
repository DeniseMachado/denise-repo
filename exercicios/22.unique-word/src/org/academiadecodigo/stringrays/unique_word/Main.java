package org.academiadecodigo.stringrays.unique_word;

public class Main {

    public static final String STRING = "Estou cheia cheia de sono e frio. Vou vou morrer morrer morrer de frio no fundao fundao fundao";

    public static void main(String[] args) {

        UniqueWord uniqueWord = new UniqueWord(STRING);

        for (String word : uniqueWord) {
            System.out.println(word);
        }


    }
}
