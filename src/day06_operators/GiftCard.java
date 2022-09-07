package day06_operators;

public class GiftCard {
    public static void main(String[] args) {
        int giftCard = 500;
        int timeUsed =3;
        System.out.println("Amount in the card"+(giftCard=giftCard-150)+"\t"+"times remaining:"+ --timeUsed);
        System.out.println("Using gift card "+(giftCard=giftCard-150-99)+"\t"+"times remaining"+"\t"+--timeUsed);




    }
}
