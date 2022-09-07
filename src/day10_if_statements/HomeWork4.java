package day10_if_statements;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");

        int year = input.nextInt();

        String message = " ";

        if (year >= 1346 && year <= 1353) {
            message = "The Black Death";

        } else if (year >= 1665 && year <= 1666) {
            message = "Great Plague of London ";

        } else if (year >= 1770 && year <= 1772){

            message = "Russian plague";

        }else if (year >= 1889 && year <= 1890) {
            message = "Flue Pnademic";

        } else if (year == 1916) {
            message = "American polio qpidemic";

        } else if (year >= 1918 && year <= 2010) {
            message = "Spanish Flue";

        } else if (year >= 2009 && year <= 2016) {
            message = "H1N1 Swine Flu pandemic";

        } else if (year >= 2014 && year <= 2021) {
            message = "West African Ebola  epidemic";

        } else if (year >= 2020 && year <= 2021) {
            message = ("Covid-19");
        } else
            message = "NO PANDEMIC! NICE YEAR !!! EVERYBODY HAPPY";
        System.out.println(message);
    }
    }

