package day20_Loops;

import java.util.Scanner;

public class HomeWorkSylables {
    public static void main(String[] args) {
        /*
        Syllables
    Given a String separated by dashes calculate how many syllables the words are
        Ex:
            Input:
                ja-va
            Output:
                2
         */
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;

        str.trim();
        for(int i = 0 ; i <=str.length()-1 ; i++ ){

            if (str.charAt(i) == ('-') && !(str.charAt(i+1) == ('-'))){
                count++;
            }
        }
        count=count+1;


        System.out.println("The sentence has " + count+" words " );
    }
}
