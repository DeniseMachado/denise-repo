package org.academiadecodigo.bootcamp.countingsheeps;

public class Sheeps { //ao declararmos nova classe estamos a criar um novo tipo de variável

    private String color;
    private int numb;


    public Sheeps(String color) {
        this.color = color;


    }

    //Método para contar as ovelhas
    public void creatSheeps() {

        //Array do tipo Sheeps(objecto) para guardar sheeps(objectos)
        Sheeps[] curral = new Sheeps[100];
        int sheepCounter = 0;


        for (int i = 0; i < curral.length; i++) {
            //Sheeps sheeps1 = new Sheeps("White");

            if (i >= 0 && i < 99) {
                System.out.println(sheepCounter + " white " + " meeh");
                sheepCounter++;
            } else {
            System.out.println(sheepCounter + " Black " + " meeeeeeeeeeeeeh");

            }
        }

        public String getColor() {
            return this.color;

        }

    }
}




