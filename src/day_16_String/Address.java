package day_16_String;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address");
        String address = input.nextLine();
        address = address.toUpperCase();
        address = address.trim();
        /*
            at this point we create the address from the console
            made all the character uppercase
            and removed extra spaces from the beginning and end

            to do all the above steps at the same time we could also chain our methods

            String address = input.nextLine().toUppercase().trim();
                                   string -> string -> string

            Invalid use of chaining:
                String s = "abc"
                s.equals("abc").trim()
                    boolean --> trying to use a String method
                    X INVALID -> we cannot use String methods on a boolean type

         */

       if(address.startsWith("500")){
            System.out.println("House is on the right side");
        } else if(address.startsWith("600")){
            System.out.println("House is on the left side");
        }

        if(address.contains("DRIVE")){
            System.out.println("We are on Drive");
        } else if(address.contains("LANE")){
            System.out.println("We are on Lane");
        } else if(address.contains("AVE")){
            System.out.println("House on Avenue");
    }
}}

/*
If word starts with or ends with x or X print the String without those x characters
If there is no x or X as the first or last character print the word untouched

 */
