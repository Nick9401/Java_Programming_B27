package day_12_if_statemant;

import com.sun.source.doctree.SummaryTree;

public class SeasonFinder {
    public static void main(String[] args) {

        /*
        Season Finder

declare and assign a month number. Bases on the below data determine what season it is
and what kind of clothes to wear. You can create your own expectations of what kind of clothes
to wear based on the month


	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall

Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat

         */

       int month = 5;

        switch (month){

            case 12 :
                System.out.println("Winter");
                break;
            case 1 :
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6 :
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Summer");
                break;
            case 10 :
                System.out.println("Fall");
                break;
            case 11:
                System.out.println("Fall");
                break;

        }

    }


}
