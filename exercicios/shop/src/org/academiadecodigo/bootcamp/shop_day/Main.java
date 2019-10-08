package org.academiadecodigo.bootcamp.shop_day;

public class Main {

    public static void main(String[] args) {


        Bank b1 = new Bank(1000);
        Wallet w1 = new Wallet(0);

        Person p1 = new Person("António", b1, w1);

        p1.buy(0);
        p1.withdrawBank(500);
        p1.buy(10000);

        System.out.println(b1.getBalance());
        System.out.println(w1.getBalance());
        System.out.println(p1.getName());



    }
}
