package day23_Array;

import java.util.Arrays;

public class homeWork2 {
    public static void main(String[] args) {
          /*       • Write a program that can return the shortest string element from a String array
            • Write a program that can return the longest string element from a String array
     */



            String[] strArray = {"Write",  "program",  "that",  "can",  "return",  "the",  "shortest",  "string"} ;

            System.out.println(Arrays.toString(strArray));

            int maxLength = 0;
            String longestWord = "";

            int minLength = 1000000;
            String shortestWord = "";

            for (String eachWord : strArray) {

                if (eachWord.length() > maxLength) {

                    maxLength = eachWord.length();   // = 5
                    longestWord = eachWord;
                }


                if (eachWord.length() < minLength ) {

                    shortestWord = eachWord;
                    minLength = eachWord.length();
                }

            }
            System.out.println("Longest Word \"" + longestWord + "\" with length " + maxLength);
            System.out.println("Shortest Word \"" + shortestWord + "\" with length " + minLength);


    }
}
