package org.academiadecodigo.bootcamp.arabian_night;

public class Magiclamp {

    private int maxNumberofGenies;
    private int numberOfReleasedGenios; //total número de génios criados
    private int numberOfRecharges;
    private int numberOfRemainGenies;


    public Magiclamp(int maxNumberofGenies) { //quantos genios podem sair
        this.maxNumberofGenies = maxNumberofGenies;
        this.numberOfReleasedGenios = 0;
        this.numberOfRecharges = 0;


    }

    public Genie rub(int maxWishes) { //Criar genios friendly (even) ou grumpy(odd) e retornar um genio reciclado

        numberOfReleasedGenios++; //porque quando esfregamos a lampada já sai um genio. O incremento tem de ser antes da condiç\ao
        if (numberOfReleasedGenios == maxNumberofGenies) {
            return new RecyclableDemon(maxWishes);
        }

            if (numberOfReleasedGenios % 2 == 0) {
                System.out.println("Fuck You!");
                return new Friendlygenie(maxWishes);

            }
            return new Grumpygenie(maxWishes);

        }

    //Só o demonio carrega a lampada

    public void recharge(Genie genie) {
        if (!(genie instanceof RecyclableDemon)) {
            System.out.println("You can't recharge this lamp!");
            return;
        }

        RecyclableDemon demon = (RecyclableDemon) genie;

        if (demon.getRecycled()) {
            System.out.println("This lamp has been recharged!");
            return;
        }

        numberOfReleasedGenios = 0;
        demon.setRecycled();
        numberOfRecharges++;

    }


    //Compara-se a si mesma pela sua capacidade
    // nº remaining genies
    //nº de vezes que foi recarregada

    public boolean compareLamps(Magiclamp novaLamp) {
        numberOfRemainGenies = maxNumberofGenies - numberOfReleasedGenios;
        int otherLampOfRemaininGenies = novaLamp.maxNumberofGenies - novaLamp.numberOfReleasedGenios;

        return numberOfRemainGenies == otherLampOfRemaininGenies &&
                maxNumberofGenies == novaLamp.maxNumberofGenies &&
                numberOfRecharges == novaLamp.numberOfRecharges;






        //return (this.maxWishes == magiclamp.maxWishes &&
          //      this.numberOfReleasedGenios == magiclamp.numberOfReleasedGenios &&
            //    this.numberOfRecharges == magiclamp.numberOfRecharges);

    }

}
