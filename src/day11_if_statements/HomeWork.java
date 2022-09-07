package day11_if_statements;

import java.util.Scanner;
import java.util.SortedMap;

public class HomeWork {
    public static void main(String[] args) {

/*
        System.out.println("Enter the Pin Code");
        System.out.println("Enter the SSN");

        int pinCode = 1234;
        int ssn    = 1111;

        if(pinCode == 1234) {
            System.out.println("Pin code is corect");
        }else if(pinCode >=1234 || pinCode<=1234  ){
            System.out.println("Pin code is incorect");

        }if(ssn == 1111){
            System.out.println("Last 4 SSN number are corect");

        }else if (ssn >=1111 || ssn <=1111)
            System.out.println("Last 4 SSN number are incorect");
        }


    }
/*
 */

        Scanner input = new Scanner(System.in);
        int pincode = 1234;
        int ssn = 1111;
        int userInput = 0;
        int userSsnIput = 0;

        System.out.println("Please enter your pincode");
        userInput = input.nextInt();
        System.out.println("Please enter last 4 digits of your SSN");
        userInput = input.nextInt();

        if (userInput == pincode && userSsnIput == ssn) {
            System.out.println("Autentification successful");
        } else {
            if (userInput != pincode) {
                System.out.println("Pin code is incorect");

            } else if (userSsnIput != ssn) {
                System.out.println("Last 4 SSN are incorrect");
            }
        }
    }
}