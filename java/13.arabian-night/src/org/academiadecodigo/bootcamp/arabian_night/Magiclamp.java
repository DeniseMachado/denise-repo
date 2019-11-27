package org.academiadecodigo.bootcamp.arabian_night;

/**
 * A Magic Lamp, capable of providing Geniuses when rubbed
 */

public class Magiclamp {

    private int maxNumberOfGenies; // Maximum number of genies the lamp can generate
    private int rubs; // Number of times the lamp has been rubbed since the last recharge
    private int demons; // Number of times the lamp has been recharged with demons

    /**
     * Constructs Magic Lamps capable of providing a maximum number of geniuses
     *
     * @param maxNumberofGenies the maximum number of genies
     */


    public Magiclamp(int maxNumberofGenies) {
        this.maxNumberOfGenies = maxNumberofGenies;


    }

    public int getMaxNumberOfGenies() {
        return maxNumberOfGenies;
    }

    public int getRubs() {
        return rubs;
    }

    public int getDemons() {
        return demons;
    }

    /**
     * Calculates the number of genies the lamp is able to create before needing a demon recharge
     *
     * @return the number of available genies
     */

    public int getAvailableGenies() {
        return getMaxNumberOfGenies() - getRubs();
    }

    /**
     * Get a Genie by rubbing the lamp
     *
     * @param maxWishes number of wishes to ask to the generated Genie
     * @return the generated Genie
     */


    public Genie rub(int maxWishes) {

        if (getAvailableGenies() == 0) {
            return new RecyclableDemon(maxWishes);
        }

        Genie genie;
        if (rubs % 2 == 0) {
            genie = new Friendlygenie(maxWishes);
        } else {
            genie = new Grumpygenie(maxWishes);
        }

        rubs++;
        return genie;

    }

    /**
     * Recharge the lamp by feeding it with a demon
     *
     * @param demon the RecyclableDemon to feed the lamp with
     */

    public void recharge(RecyclableDemon demon) {

        if (demon.isWasRecycled()) {
            return;
        }

        demon.recycle();
        rubs = 0;
        demons++;

    }

    /**
     * Tests two lamps for equality
     *
     * @param lamp the lamp to test against
     * @return if both lamps have same number of available genies, demon recharges and genie limits
     */

    public boolean equals(Magiclamp lamp) {
        return getMaxNumberOfGenies() == lamp.getMaxNumberOfGenies() &&
                getAvailableGenies() == lamp.getAvailableGenies() &&
                getDemons() == lamp.getDemons();
    }
}
