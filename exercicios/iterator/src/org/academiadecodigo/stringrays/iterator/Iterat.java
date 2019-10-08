package org.academiadecodigo.stringrays.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterat implements Iterator {


    private int min;
    private int max;
    private int index;

    public Iterat(int min, int max) {
       this.min = min;
       this.max = max;
       this.index = min;
    }


    @Override
    //Para verificar se há next
    public boolean hasNext() {
        return index <= max;
    }


    @Override
    //Só para imprimir o next

    public Integer next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return index++;
    }
}
