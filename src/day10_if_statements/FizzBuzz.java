package day10_if_statements;

public class FizzBuzz {
    public static void main(String[] args) {


        /*
         [IQ] Given a number n print the output based on the following conditions:

        the number if divisible by 3 print Fizz
        the number if divisible by 5 print Buzz
        the number if divisible by 3 and 5 print FizzBuzz
        if the number is divisible by any the print just the number

        Ex:
           n = 10
           Buzz

           n=12
           Fizz

           n=3
           13

           n=15
           FizzBuzz
         */

        int n = 10;

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");

        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
        {

        }


    }
}
