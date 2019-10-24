package org.academiadecodigo.stringrays.histogram_words;

import java.util.*;

//Inherance
public class Histogram implements Iterable<String> {


    private String[] key;//Minha key
    private HashMap<String, Integer> hashMap;


    //O contrutor serve para inicializar as propriedades de um objecto
    //Inicializar uma propriedade - é para quando criar uma instancia desta classe ela ja ter estes parâmetros (String message)
    public Histogram(String message) {


//Estou a atribuir o new HashMap á variavel hashMap
        hashMap = new HashMap<String, Integer>();

        key = message.split(" ");
        for (int i = 0; i < key.length; i++) { //Itero pelo meu array
            if (hashMap.containsKey(key[i])) {
                int sameKey = hashMap.get(key[i]);//Estou a tentar colocar uma variavel do tipo int TODO : ver isto
                sameKey++;// se a key ja existir vou aumentar o valor dela
                hashMap.put(key[i], sameKey);
                continue;
            }
            //Se não tiver repetições o meu value vai ser 1;
            hashMap.put(key[i], 1);

        }
    }


    @Override
    public Iterator<String> iterator() {
        return hashMap.keySet().iterator();
    }

    @Override
    public String toString() {
        return hashMap.toString();
    }
}



