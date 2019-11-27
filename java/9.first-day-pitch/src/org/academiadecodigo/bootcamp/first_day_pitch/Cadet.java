package org.academiadecodigo.bootcamp.first_day_pitch;

public class Cadet {

    private String name;
    private String pitch;

    public Cadet(String name, String pitch) {
        this.name = name;
        this.pitch = pitch;
    }

    public String getName() {
        return name;
    }

    public String getPitch() {
        return pitch;
    }

    public String setPitch(String pitch) {
        return this.pitch = pitch;
    }

    //print do que quero que o Cadet diga quando for chamado
    public void doThePitch() {
        System.out.println();



    }
}
