package day15_Strings;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {


    /*
    create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter the second word");
        String word2 = input.next();
        System.out.println("Enter the third word");
        String word3 = input.next();

        if(word1.length() > word2.length() && word1.length() > word3.length() && word1.contains("a")){
            System.out.println("Longest word that contain 'a' is:" + word1);
        }else if( word2.length() > word1.length() || word2.length() > word3.length() && word2.contains("a")) {
            System.out.println("Longest word that contain 'a' is" + word2);
        } else if (word3.length() > word1.length() || word3.length() > word2.length() && word3.contains("a")) {
            System.out.println("Longest word that contain 'a' is:" + word3);

        }}}



