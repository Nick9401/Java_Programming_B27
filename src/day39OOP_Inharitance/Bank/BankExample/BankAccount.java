package day39OOP_Inharitance.Bank.BankExample;

public class BankAccount {

    public static String bankName = "Bank of America";
    public String firstName;
    public String lastName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        accountHolder = firstName + " " + lastName;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String firstName, String lastName){
        accountHolder = firstName + " " + lastName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositing(int amount){
        //balance += amount;
        setBalance(balance+amount);
    }
    public void withdrawing(int amount){
        //balance -=amount;
        setBalance(balance-amount);
    }

    public void checkBalance(){
        //System.out.println("Available balance: " + balance);
        System.out.println("Available balance: " + getBalance());
    }

    public String toString(){
        return "Full Name: " + accountHolder + ", Balance: " + getBalance();


    }

}
