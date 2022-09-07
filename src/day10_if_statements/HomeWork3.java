package day10_if_statements;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {



        int attempt = 3;
        double grade = 100;

        if (attempt == 1){
            grade = grade - grade *0.1;

        }else if (attempt ==2){
            grade = grade - grade *0.2;

        }else if (attempt == 3){
            grade = grade - grade *0.35;

        }else {
            grade =0;
            System.out.println("You are failed");
        }
            System.out.println("Your grade is" + grade);


        }


    }




