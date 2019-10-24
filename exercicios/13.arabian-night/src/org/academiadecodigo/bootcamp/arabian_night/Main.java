package org.academiadecodigo.bootcamp.arabian_night;

public class Main {

    // Container of Genies */
    private static Genie[] genies;

    public static void main(String[] args) {

        // Instantiate a new magic lamp with capacity for 4 genies
        Magiclamp magiclamp = new Magiclamp(4);


        // Rub the lamp 5 times and store all genies
        genies = new Genie[] {
                magiclamp.rub(2),
        magiclamp.rub(3),
        magiclamp.rub(4),
        magiclamp.rub(5),
        magiclamp.rub(1),

        };


        // Print status of all genies
        geniesStatus();

        // Ask for wishes
        askForWishes();
        askForWishes();
        askForWishes();
        askForWishes();

        // Feed the lamp with a recyclable genie
        System.out.println(">>>> Will try to feed a demon to the lamp!!!");
        magiclamp.recharge((RecyclableDemon) genies[4]);

        // Rub the lamp one more time to get a new genie
        Genie extraGenie = magiclamp.rub(7);

        // Ask for wish and print genie status
        extraGenie.grantWish();
        System.out.println(extraGenie);

        // Instantiate a new lamp and compare it with the existing one
        System.out.println(">>>> Will create a new lamp and compare with existing one");
        Magiclamp newLamp = new Magiclamp(4);

        System.out.println("The lamps are" + (magiclamp.equals(newLamp) ? " " : " not ") + "equal");

    }

    /**
     * Ask each genie in the container to grant a wish
     */
    public static void askForWishes() {

        System.out.println("======================");

        for (Genie g : genies) {
            g.grantWish();
        }

        geniesStatus();
    }

    /**
     * Ask each genie in the container to print its status
     */
    public static void geniesStatus() {
        for (Genie g : genies) {
            System.out.println(g);
        }
    }

}

