package Day42_Exceptions;

import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please inter the number of minute");
        int minutes = scan.nextInt();

        for (int i = minutes; i > 0; --i) {
            if (i < 0)
            break;
            try {
                for (int z = 59; z > 0; --z) {
                    System.out.println((i - 1) + "minutes and " + z + "second left");
                    Thread.sleep(1000);

                }

            } catch (Exception e) {
                System.out.println("\n\t*******************************");
            }
        }
    }
}