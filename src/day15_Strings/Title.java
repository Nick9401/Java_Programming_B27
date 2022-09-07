package day15_Strings;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {

        /*
        create a class Title
ask the user to enter their name including titles
use the following titles to determine how to refer to the person

handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

	titles:

		Mr or Mister
		Ms or Miss or Madam
		Dr

	and some titles can come after a name:

		Sr
		Jr

Based on both starting and ending titles print the following messages:

		Mr or Mister: Hello Sir
		Ms or Miss or Madam: Hello Ma'am
		Dr: Hello Doctor

		Sr: Nice to meet you Senior
		Jr: Nice to meet you Junior

Note: It is possible to have both beginning and ending titles, one of them, or none of them
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name including titles");
        String name = input.next();

        if (name.startsWith("Mr") && name.startsWith("Mister")) {
            System.out.println("HelloSir");


        } else if (name.startsWith("Ms") || name.startsWith("Miss") || name.startsWith("Madam")) {
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("Dr")) {
            System.out.println("Hello Doctor");
        } else if (name.endsWith("Sr")) {
        System.out.println("Nice to meet you Senior");
        }else if (name.endsWith("Jr")){
            System.out.println("Nice to meet you Junior");
        }else{
            System.out.println("Sorry not a correct tittle");
        }
}}