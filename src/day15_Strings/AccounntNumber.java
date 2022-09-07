package day15_Strings;

import java.util.Scanner;

public class AccounntNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the account number");
        String accounntNumber = input.nextLine();


        if (accounntNumber.isEmpty()) {
            System.out.println("Empty input given");

        } else if (accounntNumber.startsWith("2"))

            if (accounntNumber.length() == 7){
                System.out.println("Valid 7-digit account number");
            }else {
            System.out.println("Invalid 7-digit account number");

            }else if (accounntNumber.startsWith("5"))

            if (accounntNumber.length() == 10){
                System.out.println("Valid 5-digit account number");
        }else {
                System.out.println("Invalid 5-digit account number");

            } else{
            System.out.println("Invalid account number");


            }
        }}

