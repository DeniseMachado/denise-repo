package org.academiadecodigo.bootcamp.first_day_pitch;

public class Main {

    public static void main(String[] args) {

        Cadet mariana = new Cadet("Mariana", "Quero matar as pombas da nossa casa!");
        Cadet jakhongir = new Cadet("Johny", "Tenho uma pen Jedi, e uns de capacete preto");
        Cadet pedro = new Cadet("Pedro", "Fui apanhado pela policia");
        Cadet joao = new Cadet("Joao", "Detesto o IntelliJ");
        Cadet rui = new Cadet("Rui", "Deixei de ser Rui para ser Puro");


        Cadet[] cadets ={mariana, jakhongir, pedro, joao, rui};

        cadets[0].doThePitch();

        int random = (int) Math.floor(Math.random() * 5);


        switch (random) {
            case 0:
                System.out.println("\nMy name is " + mariana.getName() + mariana.setPitch(". Hello from the other side!"));
                break;

            case 1:
                System.out.println("\nMy name is " + jakhongir.getName() + jakhongir.setPitch(". Do not smoke!"));
                break;

            case 2:
                System.out.println("\nMy name is " + pedro.getName() + pedro.setPitch(". Boommmmbaaa"));
                break;

            case 3:
                System.out.println("\nMy name is " + joao.getName() + joao.setPitch(". Fuck you"));
                break;

            case 4:
                System.out.println("\nMy name is " + rui.getName() + rui.setPitch(". Wowowowowowowo"));
                break;
        }



    }
}
