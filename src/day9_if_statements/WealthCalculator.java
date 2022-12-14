package day9_if_statements;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WealthCalculator {


    public static void main(String[] args) {
        // Main Method.

        Scanner keyboard = new Scanner(System.in);
        // Set Scanner To Var "keyboard".

        char moneySym = '$';
        // Set $ To Var "moneySym"

        System.out.println();
        // Organizing. Empty Line.

        System.out.println("=========================================================================================");
        // Organizing. Line.

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        // Prints Current Date In MM-DD-YYYY Format.

        System.out.println();
        // Organizing. Empty Line.

        System.out.println("*" + "\t"
                + "NOTE: Your net worth is defined by the value of all the non-financial and financial "
                + "\n" +
                "assets owned, minus the value of all outstanding liabilities.");
        // Print The Definition Of Net Worth.

        System.out.println();
        // Organizing. Empty Line.

        System.out.print("Please Enter Your Net Worth: " + moneySym);
        // Print. Tell User To Enter Net Worth.

        int netWorth = keyboard.nextInt();
        // Scanner. User Enters Their Net Worth.

        System.out.println("Your Net Worth Is: " + moneySym + netWorth);
        // Print Net Worth.

        System.out.println();
        // Organizing. Empty Line.

        if (netWorth >= 2_000_000){
            System.out.println("Congrats! You're Rich");
        } else {
            System.out.println("Sorry! You're Not Rich");
        }
        /*
         User Enters Amount.
         If Amount Is Greater Than 1_000_000, Print:
          "Congrats! You're Rich",
          Else, Print
          "Sorry! You're Poor".
         */

        System.out.println();
        // Organizing. Empty Line.

        int totalMoney = netWorth;
        // Set New Var "totalMoney" To Equal Var "netWorth".

        if(totalMoney >= 2_000_000){
            System.out.println("Have A Good Day!");
        } else {
            System.out.println("We Would Like To Fund Your Account $500,000! Would You Like To Accept? "
                    + "\n" +
                    "(Please Enter True or False)");
        }
        /*
        If Your Total Money Is Greater Than $2Million, Print "Have A Good Day!" else,
        Ask If User Would Like A Bonus Funding.
         */

        System.out.println();
        // Organizing. Empty Line.

        if(totalMoney % 2 ==0){
            System.out.println("Your Net Worth Is An Even Number!");
        } else {
            System.out.println("Your Net Worth Is An Odd Number");
        }
        // Calculate If New Worth Is An Even Or Odd Number & Print The Result.

        boolean offerAcceptance = keyboard.nextBoolean();
        // Set Var Offer Acceptance To User Input.

        System.out.println();
        // Organizing. Empty Line.

        if (offerAcceptance) {
            totalMoney += 500_000;
            System.out.println("Congrats! The Offer Has Been Accepted. You Now Have A Net Worth Of: "
                    + moneySym + totalMoney);
        } else {
            System.out.println("The Offer Has Been Declined. You Have A Net Worth Of: "
                    + moneySym + totalMoney);
        }
        /*
         If User Inputs True, Fund $500,000 & Print "The Offer Has Been Accepted
         Else, Don't Fund Account & Print "The Offer Has Been Declined. Have A Good Day!".
         */

        System.out.println();
        // Organizing. Empty Line.

        if (totalMoney >= 2_000_000) {
            System.out.println("Congrats! You Are Now Considered Rich.");
        } else {
            System.out.println("You Still Aren't Considered Rich.");
        }
        // Prints A Result Depending On Your Total Money.

        System.out.println();
        // Organizing. Empty Line.

        if(totalMoney % 2 ==0){
            System.out.println("Your Net Worth Is An Even Number!");
        } else {
            System.out.println("Your Net Worth Is An Odd Number");
        }
        // Calculate If New Worth Is An Even Or Odd Number & Print The Result.

        System.out.println("=========================================================================================");
        // Organizing. Line.
    }
}

