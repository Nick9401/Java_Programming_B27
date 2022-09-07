package day10_if_statements;

public class HomeWork2 {
    public static void main(String[] args) {

        int above = 50;


        if (above>=90){
            System.out.println("Your tank is full");

        }else if (above>=80) {
            System.out.println("Still okay");

        }else if (above >= 70){
            System.out.println("Dont go to far");

        }else if (above>=60) {
            System.out.println("Start to head back");

        }else if  (above>=50){
            System.out.println("Be careful now you at 50%");
        }

    }
}
