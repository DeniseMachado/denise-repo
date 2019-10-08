package org.academiadecodigo.bootcamp.firstdaypitches;

/* Your program has to create 5 cadets.
Each cadet has a name and a pitch.
Your program should ask every cadet to pitch themselves.
At the end, your program should change the pitch of a random cadet to something even funnier.*/


public class FirstDayPitches {

    public static void main(String[] args) {
        //mariana é uma variável do tipo Cadet. Do lado esquerdo estamos a declarar uma nova variável . Quando estamos a fazer new Cadet() estamos a instanciar um novo objecto e estamos a guardar um objecto que tem dois valores.
        Cadet mariana = new Cadet("Mariana", "Quero matar as pombas da nossa casa!");
        Cadet jakhongir = new Cadet("Johny", "Tenho uma pen Jedi, e uns de capacete preto");
        Cadet pedro = new Cadet("Pedro", "Fui apanhado pela policia");
        Cadet joao = new Cadet("Joao", "Detesto o IntelliJ");
        Cadet rui = new Cadet("rui", "Deixei de ser Rui para ser Puro");


        System.out.println("\nMy name is " + mariana.getName() + " and my pitch is: " + mariana.getPitch());
        System.out.println("\nMy name is " + jakhongir.getName() + " and my pitch is: " + jakhongir.getPitch());
        System.out.println("\nMy name is " + pedro.getName() + " and my pitch is: " + pedro.getPitch());
        System.out.println("\nMy name is " + joao.getName() + " and my pitch is: " + joao.getPitch());
        System.out.println("\nMy name is " + rui.getName() + " and my pitch is: " + rui.getPitch());

        Cadet[] cadets ={mariana, jakhongir, pedro, joao, rui};

        cadets[0].doThePitch();

        int random = (int) Math.floor(Math.random() * 5);//length


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

//Para chamar aqui o doThePitch cadets cadets[i].doThePitch();




