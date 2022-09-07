package day19_loop;

import java.util.Scanner;

public class HomeWorkPrimeNumber {
    public static void main(String[] args) {

        /*
        [IQ] Prime number

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		11

	Output:
		prime


Ex:
	Input:
		10

	Output:
		not prime
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int count = 0;
        String txt = "";

        for (int i = num; i > 0; i--) {

            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            txt = "Number is prime";
        } else {
            txt = "Number is not prime";
        }
        System.out.println(txt);
    }


    }

