package day37_static.i_Student.Debit_card;

public class Card {


    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    static String accountType;

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }

    static{
        accountType="debit";

    }

    public Card(long cardNumber, String holderName, double balance) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.balance = balance;

        String cardNumb = "" + cardNumber;
        if (cardNumb.length() != 16){
            System.out.println("Card number is invalid ");
        }else {
            System.out.println("Valid card number");
        }
    }

    public Card(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.cardType = cardType;
        this.pin = pin;
        this.balance = balance;

        if(cardType=="MasterCard " || cardType=="Visa"){
            System.out.println("Card is Valid");

        }else{
            System.out.println();
        }

        String pinStr = "" + pin;
        if ( pinStr.length() !=4){
            System.out.println("Pin is invalid format");
        }else {
            System.out.println("Pin is : Valid format");
        }

    }

}
