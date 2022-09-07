package day15_Strings;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the address");
        String address = input.nextLine();
        System.out.println(address.toUpperCase());


        if (address.startsWith("500")){
            System.out.println("House on the right side of the street");
        }else if (address.startsWith("600")){
            System.out.println("Houses are on the left side of the street");
        }
        if (address.contains("drive")){
            System.out.println("House on drive ");
        }else if(address.contains("Lane")){
            System.out.println("House on lane");
        }else if (address.contains("Avenue")){
            System.out.println("House on avenue");

        }
    }
}
