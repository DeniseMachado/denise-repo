package org.academiadecodigo.stringrays.iterator;

public class Main {

    public static void main(String[] args) {

        Range range = new Range(1, 10);
        Iterat iterator = new Iterat(1, 10);


       while(iterator.hasNext()) {
           System.out.println(iterator.next());
       }


    }
}
