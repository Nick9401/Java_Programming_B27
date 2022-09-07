package day9_if_statements;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("character ");

        int character = input.nextInt();
        System.out.println(character);

        char letter = 'G';
        char number = '9';
        char specialCharacter = '$';

        if (character == letter ){
            System.out.println('G');
        }
        else if  ( character == number){
            System.out.println("9");
        }
        else if (character ==specialCharacter){
            System.out.println('$');
        }

    }
}


