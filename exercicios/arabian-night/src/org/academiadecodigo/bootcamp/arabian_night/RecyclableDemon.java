package org.academiadecodigo.bootcamp.arabian_night;


public class RecyclableDemon extends Genie {

    //para saber se já foi reciclado. começo com true porque ja foi reciclado
    private boolean wasRecycled;

    //não é reciclado mesmo que tenha atingido o numero maximo
    public RecyclableDemon(int maxNumberOfWishes) {
        super(maxNumberOfWishes);
        wasRecycled = false;
    }





    //Consegue sempre conceder desejos. Vai retornar true se aida nao foi reciclado
    @Override
    public void grantOneWish() {
        if(!wasRecycled) {
        super.grantOneWish();
        return;
        }

        System.out.println("Sorry, you already has all your wishes granted!");

    }
    //retorna se o genio foi reciclado
    public boolean getRecycled() {
        return wasRecycled;

        }

        //retorna se foi reciclado true
    public void setRecycled() {
        wasRecycled = true;
    }



}

