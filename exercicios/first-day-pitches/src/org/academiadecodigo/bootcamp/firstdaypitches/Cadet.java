package org.academiadecodigo.bootcamp.firstdaypitches;

public class Cadet {

    private String name;
    private String pitch;



    public Cadet(String name, String pitch) { // construtor serve para inicializar o objeto com o valor que recebemos do argumento
        this.name = name;
        this.pitch = pitch;
    }

    public void doThePitch(){
        System.out.println();
    //print que quero que o cadet diga quando for chamado);
    }


    public String getName() { //só return porque nao tem argumento. O get e set s\ao uma declaraç\ao de um tipo de retorno de um método.
        return name;
    }

    public String getPitch() {
        return pitch;
    }


    public String setPitch(String pitch) {
        return this.pitch = pitch;

    }


}
