package org.academiadecodigo.bootcamp.arabian_night;


/**
 * Class with some common Genie behaviour
 */

public class Genie {

    public int maxNumberOfWishes;
    public int grantedWishes;

    /**
     * Genius Contructor
     *
     * @param maxNumberOfWishes Maximum number of wishes the genius grants
     */


    Genie(int maxNumberOfWishes) {
        this.maxNumberOfWishes = maxNumberOfWishes;

    }

    public int getMaxNumberOfWishes() {
        return maxNumberOfWishes;
    }

    public int getGrantedWishes() {
        return grantedWishes;
    }

    /**
     * Calculates the number wishes the Genie can still grant
     *
     * @return number of remainig wishes
     */

    public int getRemainingWishes() {
        int remaining = getMaxNumberOfWishes() - getGrantedWishes();
        return remaining >= 0 ? remaining : 0;
    }

    /**
     * Verifies if this genie has wishes left to grant
     *
     * @return true if genie still has wishes to grant
     */

    public boolean hasWishesLeft() {
        return getRemainingWishes() > 0;
    }

    /**
     * Actual wish granting
     */

    private void doGrantWish() {
        this.grantedWishes++;
        System.out.println("Wish granted by " + this.getClass().getSimpleName());
    }

    /**
     * Request a wish from the Genie
     *
     * @return if the wish was granted or not
     */

    public boolean grantWish() {
        if (!hasWishesLeft()) {
            return false;
        }

        doGrantWish();
        return true;
    };


    /**
     * Obtain the status of the Genie
     *
     * @return the current Genie status
     */

    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(" has granted ");
        stringBuilder.append(getGrantedWishes());
        stringBuilder.append(" and still has ");
        stringBuilder.append(getRemainingWishes());
        stringBuilder.append(" to grant.");

        return stringBuilder.toString();

    };


}





