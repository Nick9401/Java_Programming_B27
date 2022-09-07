package day39OOP_Inharitance.Bank.Task2;

public class BankAccount {

    public long accountNumber;
    public String accountHolder;
    public double balance;

    public void deposit(int amount){
        balance+=amount;
    }
    public void showBalance(){
        System.out.println("Available Balance"+balance);
    }
    public String toString(){
        return "Name:" +accountHolder+",balance"+balance;
    }


}
