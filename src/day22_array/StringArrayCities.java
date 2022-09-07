package day22_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringArrayCities {
    public static void main(String[] args) {

        // Cities as separate String variables
        String city1 = "Chicago";
        String city2 = "West Palm";
        String city3 = "Miami";
        String city4 = "New York";
        String city5 = "Toronto";
        String city6 = "Huston";

        //make an array to store the cities

        String[] cities = {"Chicago", "West Palm", "Miami", "New York", "Toronto", "Huston"};

        //access & print each city one at a time

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);

        //print the whole array

        System.out.println(cities);// not readable
        System.out.println(Arrays.toString(cities));   // Arrays.toString(cities); -->return your array objesct as in a String format










    }
}
