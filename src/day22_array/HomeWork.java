package day22_array;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter a number and print the number as a word. Set a range
        from 0 - 15 and any number not in the range should get an invalid number message

    Ex:
> 1
        one

> 10
        ten
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 15");
        int numInput = input.nextInt();

        String[] range = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};

       System.out.println(range[numInput]);

        String [] fullName = {"James Bonds", "Harry Potter", "Tony Stark"};

        System.out.println("" + fullName[0].charAt(0) + fullName[0].charAt(fullName[0].indexOf(' ') + 1));




        System.out.println("" + fullName[1].charAt(0) + fullName[1].charAt(fullName[1].indexOf(' ') + 1));
        System.out.println("" + fullName[2].charAt(0) + fullName[2].charAt(fullName[2].indexOf(' ') + 1));
    }
}
