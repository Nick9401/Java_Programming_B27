package day9_if_statements;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {


/*
        Scanner input = new Scanner(System.in);
        System.out.println("bonus you get at end of the month");

        int salesAmount = input.nextInt();
        System.out.println(salesAmount + "bonus");

        if (salesAmount < 100000) {
            System.out.println("you dont get bonus");

        } else if (salesAmount >= 100000 && salesAmount < 15000) {
            System.out.println("you get a bonus of 5000");

        } else if (salesAmount >= 15000) {
            System.out.println("you get a bonus of 7000");
        }


    }}
*/
        Scanner input =new Scanner(System.in);
        System.out.println("What day is today");

       int day = input.nextInt();
        System.out.println(day);

        if (day == 1 ) {
            System.out.println("Monday");

        }else if (day == 2) {
            System.out.println("Tuesday");

        }else if (day == 3) {
            System.out.println("Wednesday");

        }else if (day == 4) {
            System.out.println("Thursday");

        }else if (day == 5) {
                System.out.println("Friday");

        }else if (day == 6) {
            System.out.println("Saturday");

        }else if (day == 7){
            System.out.println("Sunday");

        }
    }
}