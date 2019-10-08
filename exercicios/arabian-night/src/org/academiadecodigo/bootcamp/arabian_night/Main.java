package org.academiadecodigo.bootcamp.arabian_night;

public class Main {

    public static void main(String[] args) {
        int maxWishes = 7;

        Genie genie = new Genie(3);

        genie.grantOneWish();

        Magiclamp magic1 = new Magiclamp(2);

        Magiclamp magic2 = new Magiclamp(3);

        System.out.println(magic1.compareLamps(magic2));









    }
}
