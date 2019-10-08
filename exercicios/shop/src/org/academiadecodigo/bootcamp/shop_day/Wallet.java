package org.academiadecodigo.bootcamp.shop_day;

public class Wallet {

    private int balance;

    public Wallet(int balance) {
        this.balance = balance;
    }

    public int retirar(int money) {
        if (this.balance >= money) {
            this.balance = this.balance - money;
            return money;
        }
        return 0;
    }

    //para "salvar" dinheiro na carteira
    public void colocar(int money) {
        this.balance = this.balance + money;
    }

    public int getBalance() {
        return this.balance;
    }
}
