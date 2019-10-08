package org.academiadecodigo.bootcamp.stringrays.arabian;

import org.academiadecodigo.bootcamp.stringrays.arabian.genie.Genie;

public class Main {


    public static void main(String[] args) {

        int geniesToGive = 10;
        MagicLamp lamp = new MagicLamp(geniesToGive);


        for (int i = 0; i < 13; i++) {
            Genie genie = lamp.rub();

            for (int j = 0; j < 4; j++) {
                genie.grantWish();
            }

            lamp.recharge(genie);
        }


    }

}
