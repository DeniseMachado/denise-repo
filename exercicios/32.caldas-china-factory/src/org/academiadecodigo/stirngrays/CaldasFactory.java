package org.academiadecodigo.stirngrays;

public class CaldasFactory {
    public static void main(String[] args) {


        Thread trabalhador = new Thread(new CaldasWorkers(10));
        trabalhador.setName("Luís 2");
        trabalhador.start();

        Thread trabalhador1 = new Thread(new CaldasWorkers(20));
        trabalhador1.setName("Eduardo");
        trabalhador1.start();


        try {
            System.out.println("GERENTE: À espera que os colaboradores terminem...");


            //A thread main vai esperar que o trabalhador acabe o seu trabalho para começar
            trabalhador.join();
            trabalhador1.join();

            System.out.println("GERENTE: Finalmente acabaram, vou-me embora!");

        } catch (InterruptedException exception) {
            System.out.println("Acordarma-me da sesta, mas ainda nao acabaram...");
            exception.printStackTrace();

        }
    }
}
