package org.academiadecodigo.stringrays.iterator;

public class Range implements Iterable<Integer> {

    private int min;
    private int max;


    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }


    @Override
    public Iterat iterator() {
        return new Iterat(this);

    }


}


