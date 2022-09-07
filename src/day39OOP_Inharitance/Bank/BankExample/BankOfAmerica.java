package day39OOP_Inharitance.Bank.BankExample;

import day39OOP_Inharitance.Bank.BankExample.BankAccount;

public class BankOfAmerica {
    public static void main(String[] args) {


        BankAccount Nargiz = new BankAccount("Nargiz", "Smetana");

        System.out.println(Nargiz.getAccountHolder());

        System.out.println(Nargiz.getBalance());

        Nargiz.checkBalance();

        Nargiz.depositing(120);
        Nargiz.checkBalance();
        Nargiz.withdrawing(80);
        Nargiz.checkBalance();

        System.out.println(Nargiz);

        Nargiz.withdrawing(100);
        System.out.println(Nargiz);

        Nargiz.depositing(20000);
        System.out.println(Nargiz);
    }
}
