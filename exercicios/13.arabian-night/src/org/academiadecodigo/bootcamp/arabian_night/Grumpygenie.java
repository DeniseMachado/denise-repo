package org.academiadecodigo.bootcamp.arabian_night;

/**
 * Grumpy Genie that will grant only one wish and refuse all other requests
 */


public class Grumpygenie extends Genie {
    /**
     * Call the parent constructor
     *
     * @param maxWishes
     */

    public Grumpygenie(int maxWishes) {
        super(maxWishes);
    }

    /**
     * @see Genie#hasWishesLeft()
     */

    @Override
    public boolean hasWishesLeft() {
        return getGrantedWishes() == 0;
    }

    /**
     * @see Genie#toString()
     */

    @Override
    public String toString() {
        return getGrantedWishes() == 0 ? "Grumpy genie has a wish to grant." : "Grumpy genie has granted a wish.";
    }

}


