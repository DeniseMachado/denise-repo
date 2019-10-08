package org.academiadecodigo.bootcamp.shop_day;

public class Person {

    private Wallet wallet;
    private Bank bank;
    private String name;

    public Person(String name, Bank bank, Wallet wallet) {
        this.name = name;
        this.bank = bank;
        this.wallet = wallet;

    }


    public void buy(int buy) {

        if (wallet.getBalance() < buy) {
            System.out.println("Go to the bank");
        } else {
            System.out.println("Buy");
            wallet.retirar(buy);
        }

    }
    //levantar dinheiro do banco
    public void withdrawBank(int amount) {

        if (bank.getBalance() >= amount) {
            bank.withdraw(amount);
            wallet.colocar(amount);
            System.out.println("Transaction successful");
        } else {
            System.out.println("My friend I'm sorry, no money!");
        }

    }
    //Depositar dinheiro da carteira no banco
    public void deposit(int amount) {
        if ()
    }

    //Meter e tirar na carteira

    //Ver o balanço na carteira e no bank

    public String getName(){
        return this.name;
    }
}
