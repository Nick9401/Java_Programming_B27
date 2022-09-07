package Examples.Replit.item1;

import Examples.Replit.item1.Item;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {

        // DO NOT TOUCH ANY CODE HERE

        Scanner input = new Scanner(System.in);
        Item item = new Item(input.nextLine(), input.nextDouble());
        System.out.println(item);


    }
}
