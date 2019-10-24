package org.academiadecodigo.bootcamp.shop_day;

public class Main {

    public static void main(String[] args) {

        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet();
        Bank bank = new Bank();

        Person p1 = new Person("Denise", bank, wallet1, 500);
        System.out.println(p1);

        Person p2 = new Person("Helder", bank, wallet2, 1000);
        System.out.println(p2);

        p1.saveMoney(200);
        System.out.println(p1);
        System.out.println(p2);

        p1.spend(500);
        System.out.println(p1);
        System.out.println(p2);

    }
}
