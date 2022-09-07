package day9_if_statements;


import java.util.Scanner;
import java.util.SortedMap;

public class HomeWork3 {

    public static void main(String[] args) {


/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time using 24 hours format:");

        int time = input.nextInt();
        System.out.println(time + "hour(s)");

        if(time >= 6 && time <= 11){
            System.out.println("Good morning");
        } else if ( time >= 12 && time <= 16){
            System.out.println("Good evening");
        } else if ( (time >= 17 && time <= 23) || ( time >= 0 && time <= 5)){
            System.out.println("Good night");
        }


    }
}
*/
        Scanner input = new Scanner(System.in);
        System.out.println("bonus you get at end of the month");

        int salesAmount = input.nextInt();
        System.out.println(salesAmount + "bonus");

        if (salesAmount < 100000) {
            System.out.println("you dont get bonus");

        }else if (salesAmount >= 100000 && salesAmount < 15000) {
                System.out.println("you get a bonus of 5000");

        } else if (salesAmount >= 15000) {
            System.out.println("you get a bonus of 7000");


            }
            }
        }


