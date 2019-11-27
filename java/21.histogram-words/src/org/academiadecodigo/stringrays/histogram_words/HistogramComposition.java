package org.academiadecodigo.stringrays.histogram_words;

import java.util.*;

//Inherance
public class HistogramComposition implements Iterable<String> {


    private String[] key;//Minha key
    private Map<String, Integer> histogramData;



    public HistogramComposition(String message) {


//Estou a atribuir o new HashMap á variavel hashMap
        histogramData = new HashMap<>();

        key = message.split(" ");
        for (int i = 0; i < key.length; i++) { //Itero pelo meu array
            if (histogramData.containsKey(key[i])) {
                int sameKey = histogramData.get(key[i]);//Estou a tentar colocar uma variavel do tipo int TODO : ver isto
                sameKey++;// se a key ja existir vou aumentar o valor dela
                histogramData.put(key[i], sameKey);
                continue;
            }
            //Se não tiver repetições o meu value vai ser 1;
            histogramData.put(key[i], 1);

        }
    }

    public int size() {
        return histogramData.size();
    }


    @Override
    public Iterator<String> iterator() {
        return histogramData.keySet().iterator();
    }

    @Override
    public String toString() {
        return histogramData.toString();
    }
}



