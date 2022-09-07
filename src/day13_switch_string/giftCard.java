package day13_switch_string;

import java.util.Scanner;

public class giftCard {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String item = input.next();
        int GiftCardBalnce=100;
        int price =0;
        Boolean statement;

        switch (item) {
            default:
                System.out.println("Sorry, that is an invalid item");
                break;

            case "Blanket":
                price = 60;
                System.out.println("Thank you for your purchase!");
                System.out.println(" Your current balance is:" + (GiftCardBalnce - price) + " $");
                break;
            case "Charger":
                price = 5;
                System.out.println("Thank you for your purchase!");
                System.out.println(" Your current balance is:" + (GiftCardBalnce - price) + " $");
                break;
            case "Hat":
                price = 25;
                System.out.println("Thank you for your purchase!");
                System.out.println(" Your current balance is:" + (GiftCardBalnce - price) + " $");
                break;
            case "Headphones":
                price = 30;
                System.out.println("Thank you for your purchase!");
                System.out.println(" Your current balance is:" + (GiftCardBalnce - price) + " $");
                break;
            case "Laptop":
                price = 300;
                System.out.println("Sorry, not enough funds on your gift card!");

                break;
            case "Pants":
                price = 50;
                System.out.println("Thank you for your purchase!");
                System.out.println(" Your current balance is:" + (GiftCardBalnce - price) + " $");
                break;
            case "Pillow":
                price = 40;
                System.out.println("Thank you for your purchase!");
                System.out.println(" Your current balance is:" + (GiftCardBalnce - price) + " $");
                break;
            case "Smartphone":
                price = 1000;
                System.out.println("Sorry, not enough funds on your gift card!");

                break;
            case "Socks":
                price = 5;
                System.out.println("Thank you for your purchase!");
                System.out.println(" Your current balance is:" + (GiftCardBalnce - price) + " $");
                break;
            case "USB cable":
                price = 10;
                System.out.println("Thank you for your purchase!");
                System.out.println(" Your current balance is:" + (GiftCardBalnce - price) + " $");
                break;

            case "statemnt":
                statement =(price >= GiftCardBalnce);


        System.out.println("Sorry, not enough funds on your gift card");




        }
}}