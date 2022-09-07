package day11_if_statements;

public class HomeWorkMouvie {
    public static void main(String[] args) {

        double time = 3;


        if (time <= 0) {
            System.out.println("Movies cannot be less than 0 minutes");
        } else if (time > 4) {
            System.out.println("Movies cannot be more than 4 hours ");
        } else {
            System.out.println("for all other duration uses the following values to display the price of the tickets");


            if (time == 1) {
                System.out.println("The price of the ticket is: 8.99");
            } else if (time == 1.5) {
                System.out.println("The price of the ticket is: 10.50");
            } else if (time == 2.0) {
                System.out.println("The price of the ticket is: 12.99");
            } else if (time == 2.5) {
                System.out.println(" The price of the ticket is: 14.50");
            } else {
                if (time == 3 && time == 3.5 && time == 4) {
                }
                {
                    System.out.println("The price of the ticket is: 15.99");


                }
            }

        }

    }}
