package org.academiadecodigo.bootcamp.stringrays.arabian;

import org.academiadecodigo.bootcamp.stringrays.arabian.genie.Demon;
import org.academiadecodigo.bootcamp.stringrays.arabian.genie.FriendlyGenie;
import org.academiadecodigo.bootcamp.stringrays.arabian.genie.Genie;
import org.academiadecodigo.bootcamp.stringrays.arabian.genie.GrumpyGenie;

public class MagicLamp {

    private int maxGenies;
    private int createdGenies;
    private int numberOfRecharges;

    public MagicLamp(int maxGenies) {
        this.maxGenies = maxGenies;
        createdGenies = 0;
    }

    public Genie rub() {

        createdGenies++;
        if (createdGenies > maxGenies) {
            return new Demon();
        }

        if (createdGenies % 2 == 0) {
            return new FriendlyGenie();
        }

        return new GrumpyGenie();

        // creates a genie,
        // if even friendly,
        // odd grumpy,
        // if out of genies creates a demon.
    }

    public void recharge(Genie genie) {

        if (!(genie instanceof Demon)) {
            System.out.println("Fuck off, only demons here.");
            return;
        }

        Demon demon = (Demon) genie;

        if (demon.isRecycled()) {
            System.out.println("Can't recycled something that has already been recycled!");
            return;
        }

        System.out.println("Lamp has been recharged, Full POWER!");
        createdGenies = 0;
        numberOfRecharges++;
        demon.recycle();
    }

    public boolean compare(MagicLamp lamp) {

        // are equals when capacity (maxGenies) is the same and
        // remainingGenies are the same (maxGenies - createdGenies) and
        // numberOfRecharges is the same

        int myRemainingGenies = maxGenies - createdGenies;
        int thatOtherLampRemainingGenies = lamp.maxGenies - lamp.createdGenies;


        return this.maxGenies == lamp.maxGenies &&
                myRemainingGenies == thatOtherLampRemainingGenies &&
                this.numberOfRecharges == lamp.numberOfRecharges;
    }
}
