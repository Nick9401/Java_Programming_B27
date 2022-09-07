package day10_if_statements;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Language");

        int Language = input.nextInt();
        System.out.println(Language);

        if (Language == 1) {
            System.out.println("English- hello, thank for your");

        } else if (Language == 2) {
            System.out.println("Spanish- hola, gracias para llamar");

        }else if (Language== 3){
            System.out.println("Turkish- merhaba, aradiginiz icin tesekkurler");

        }else if (Language ==4){
            System.out.println("Russian- privet, spasibo za vash zvonok");
        }else if (Language ==5){
            System.out.println("French-Merci ,pour votre appel");
        }else{
            System.out.println("We will use English by default ");
        }


    }
}