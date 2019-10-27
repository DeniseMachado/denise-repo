package org.academiadecodigo.stirngrays;

public class CaldasWorkers implements Runnable {

    private int numberOfChinas;

    public CaldasWorkers(int numberOfChinas) {
        this.numberOfChinas = numberOfChinas;
    }

    @Override
    public void run() {
        //Cada trabalhador produz 10 peças
        for (int i = 0; i < numberOfChinas; i++) {
            System.out.println(Thread.currentThread().getName() + " Aqui a fazer uma loiça");

            try {
                Thread.sleep(1000);

            } catch (InterruptedException exception) {
                System.out.println("Estava a dormir mas acordaram-me!");
                exception.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + ": Não faço mais um caralho...");

    }

}
