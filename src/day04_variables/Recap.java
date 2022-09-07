package day04_variables;

public class Recap {
    public static void main(String[] args) {

        //1-declare variables
        double temperature;
        byte numberOfJvaDays;
        short numberOfSoftSkillsDays;

        //2-assigning value to variables
        temperature = 74.2;
        numberOfJvaDays=4;
        numberOfSoftSkillsDays=2;

        System.out.println("temperature = " + temperature+"celcius");//soutv
        System.out.println("numberOfJvaDays = " + numberOfJvaDays); //soutv
        System.out.println("numberOfSoftSkillsDays = " + numberOfSoftSkillsDays); //soutv

        //Decalare and assign at same time
        int numberOfCffeeCups = 2;
        float ratingOfMovie = 8.9F; //compiler takes 8.9 as double type,we add F to the end to make it the float type
        long waterInOcean = 2000_000_000_000_000L;//cOMPILER TAKES 2000000000000 AS INT TYPE,BUT THIS NUMBER IS TOO BIG FOR INT,SO DOESNT compile we need to add L to make it a long type

        System.out.println("numberOfCffeeCups = " + numberOfCffeeCups);
        System.out.println("ratingOfMovie = " + ratingOfMovie);
        System.out.println("waterInOcean = " + waterInOcean+"lters");
    }
}
