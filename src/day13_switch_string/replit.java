package day13_switch_string;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPrice = 0d;
        System.out.println("Select screen size:");
        String screen = input.nextLine();


        switch(screen){
            case "13.3":
                totalPrice += 200;
                break;
            case "15.0":
                totalPrice += 300;
                break;
            case "17.3":
                totalPrice += 400;
                break;
            default:
                System.out.println("Invalid entry");
        }
        System.out.println("Select CPU type:");
        String cpu = input.nextLine();

        switch(cpu) {
            case "i3":
                totalPrice += 150;
                break;
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
                break;
            default:
                System.out.println("Invalid entry");

        }
        System.out.println("Select RAM size:");
        int ram = input.nextInt();
        totalPrice += (ram / 4) * 50;
        input.nextLine();
        System.out.println("Select storage type:");
        String storageType = input.nextLine();
        System.out.println("Select storage size:");
        int storageSize = input.nextInt();

        switch (storageType){
            case "HDD":
                totalPrice += storageSize / 500 * 50;
                break;
            case "SSD":
                totalPrice += storageSize / 500 * 100;
                break;
            default:
                System.out.println("Invalid entry");
        }
        System.out.println("Select screen resolution:");
        String screenRes = input.next();

        switch(screenRes) {
            case "FULLHD":
                totalPrice += 100;
                break;
            case "4K":
                totalPrice += 200;
                break;
            default:
                System.out.println("Invalid entry");

        }

        System.out.println("Final price is: $" + totalPrice);


    }
}
