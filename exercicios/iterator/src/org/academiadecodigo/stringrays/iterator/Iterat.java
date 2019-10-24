package org.academiadecodigo.stringrays.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterat implements Iterator {

    private Range range;
    private int index;

    public Iterat(Range range) {
        this.range = range;
      index = range.getMin();

    }


    @Override
    //Para verificar se há next
    public boolean hasNext() {
        return index <= range.getMax();
    }


    @Override
    //Só para imprimir o next
    public Integer next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return index++;
    }

    @Override

    public void remove() {
        //if()

    }
}
