package day20_Loops;

import java.util.Scanner;

public class HomeWorkCountWord {
    public static void main(String[] args) {
        /*
        Count Words
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4
         */
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;

        str.trim();
        for(int i = 0 ; i <=str.length()-1 ; i++ ){

            if (str.charAt(i) == (' ') && !(str.charAt(i+1) == (' '))){
                count++;
            }
        }
        count=count+1;


        System.out.println("The sentence has " + count+" words " );
    }
}
