package day9_if_statements;


import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Month");

        int Month = input.nextInt();
        System.out.println(Month);


        if (Month==1) {
            System.out.println("January-31 days");

        }else if (Month==2){
            System.out.println("February-31 days");

        }else if (Month==3){
            System.out.println("March-31 days");

        } else if (Month==4){
            System.out.println("April-31 days");

        }else if (Month==5){
            System.out.println("May-31 days");

        } else if (Month==6){
            System.out.println("Jun-30 days");

        } else if (Month==7) {
            System.out.println("July-31 days");

        } else if (Month==8){
            System.out.println("August-31 days");

        } else if (Month==9){
            System.out.println("September-31 days");

        }else if (Month==10){
            System.out.println("31 October days");

        }else if (Month==11){
            System.out.println("30 November days");

        }else if (Month==12){
            System.out.println(" 31 December days");
        }




        }
    }
