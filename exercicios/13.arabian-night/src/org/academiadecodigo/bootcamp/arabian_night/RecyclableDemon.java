package org.academiadecodigo.bootcamp.arabian_night;

/**
 * Demon capable of providing infinite wishes until used to recharge a MagicLamp
 */

public class RecyclableDemon extends Genie {

    //Set to true if already used to recharge a MagicLamp
    private boolean wasRecycled = false;


    /**
     * Calls the parent constructor
     * @see Genie#Genie(int)
     */

    public RecyclableDemon(int maxNumberOfWishes) {
        super(maxNumberOfWishes);
    }

    public boolean isWasRecycled() {
        return wasRecycled;
    }

    public void recycle() {
        wasRecycled = false;
    }

    /**
     * @see Genie#hasWishesLeft()
     */

    @Override
    public boolean hasWishesLeft() {
        return !wasRecycled;

    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("Recyclable demon has granted ");
        stringBuilder.append(getGrantedWishes());
        stringBuilder.append(" wishes.");

        return wasRecycled ? "Demon has been recycled" : stringBuilder.toString();
    }









}

