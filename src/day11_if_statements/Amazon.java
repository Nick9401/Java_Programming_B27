package day11_if_statements;

public class Amazon {
    public static void main(String[] args) {

        double price = 29.99;
        boolean isPrime = true;

        if (isPrime) {
            System.out.println("Free 2 day shipping");
        } else {
            //you dont have prime
//--------------------------------------------------------------------------
            if (price >= 25) {
                System.out.println("Free shipping available");
            } else {
                System.out.println("Shipping cost is $2.99");


                }
            }
        }
    }

