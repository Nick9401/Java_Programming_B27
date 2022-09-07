package day08_scanner;

import java.util.Scanner;

//ask for first name
//ask for last name
//ask for address
public class PersonInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.next();
        System.out.println("Please enter your last name");

        input.nextLine();//for the enter input

        String lastName = input.next();
        System.out.println("Please enter your address");
        String address = input.next();

    }
}
