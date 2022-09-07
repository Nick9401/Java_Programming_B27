package day11_if_statements;

public class HomeWorkSoccer {
    public static void main(String[] args) {

        int number = 59;

        if (number >= 0 && number <= 90) {


            if (number <= 0) {
                System.out.println("minutes cannot be a negative number");

            }else if (number >= 90) {
                System.out.println("games cannot be longer than 90 minute");
            }else if (number >= 75 && number <= 90) {
                System.out.println("just getting started");
            }else if (number >= 60 && number <= 74 ) {
                System.out.println("players are doing their best");
            }else if (number >= 30 && number <= 59) {
                System.out.println("middle of the game is going great ");
            }else if (number == 0 && number <= 29) {
                System.out.println("the end of the same is approaching");
            }else {
                System.out.println("Not valid minutes");
            }

        }
    }
}
