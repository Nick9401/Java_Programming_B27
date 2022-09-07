package day23_Array;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        /*

        Ex:
            > 1
        one

                > 10
        ten

                */


            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number from 0 to 15 to see the number in word format");
            int num = input.nextInt();
            String[] numWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};

            if (num >= 0 && num <= 15) {
                System.out.println(numWords[num]);
            } else {
                System.out.println("Invalid number. Range is 0 - 15");

        }
    }
}
