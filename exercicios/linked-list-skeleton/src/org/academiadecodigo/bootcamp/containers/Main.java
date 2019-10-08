package org.academiadecodigo.bootcamp.containers;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> carList = new LinkedList();

        Human human = new Human();
        Car car = new Car();


        for (int i = 0; i < 10 ; i++) {
            if(i == 5) {
                carList.add(new Car<>());
            }

        }



    }
}
