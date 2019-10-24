package org.academiadecodigo.bootcamp.shop_day;

public class Person {

    private String name;

    private Wallet wallet;
    private Bank bank;


    public Person(String name, Bank bank, Wallet wallet, int money) {
        this.name = name;
        this.bank = bank;
        this.wallet = wallet;

        wallet.add(money);

    }

    //returns amount of money spent
    public int spend(int money) {
        return wallet.use(money);
    }

    public void fillWallet(int money) {
        wallet.add(bank.withdraw(money));
    }

    public void saveMoney(int money) {
        bank.deposit(wallet.use(money));
    }

    @Override
    public String toString() {
        return "Person name = " + name + ", " + bank + ", " + wallet;
    }
}





