package org.academiadecodigo.bootcamp.shop_day;

public class Bank { //O que o banco faz

    //propriedade do banco
    private int balance;


    public Bank(int balance) {
        this.balance = balance;

    }

    public int withdraw(int value) {
        if (balance >= value) {
            balance = balance - value;
            return value;
        }
        return 0;
    }

    public void deposit(int value) {
        this.balance += value;

    }
    //o retorno é do tipo int e retorna o saldo que tenho
    public int getBalance() {
        return this.balance;
    }

}
