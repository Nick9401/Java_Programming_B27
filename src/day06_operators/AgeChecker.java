package day06_operators;

public class AgeChecker {
    public static void main(String[] args) {
        int age = 12;

        boolean isChild = age <=13;
        boolean isSenior = age >= 65;
        System.out.println("isChild="+isChild);
        System.out.println("isSenior="+isSenior);

        int num=20;
        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 !=0;



    }
}
