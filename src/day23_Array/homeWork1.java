package day23_Array;

import java.util.Arrays;

public class homeWork1 {
       /*   Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position
        Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes

            Ex:
            Input:
                [10, 0, 5, 0, 1, 0]
            Output:
                [10, 5, 1, 0, 0, 0]
     */

    public static void main(String[] args) {

        int [] input = {10, 0, 5, 0, 1, 0 };
        int [] output = new int[input.length];

        int count = 0;

        for (int i = 0; i < input.length; i++) {

            if (input[i] != 0) {

                output[count] = input[i];
                count++;

            }

            // i = 0  --> input[0] = 10   -->   count = 0  /   output[0] = 10    /   count = 1
            // i = 1  --> input[1] = 0    -->   count = 1
            // i = 2  --> input[2] = 5    -->   count = 1  /   output[1] = 5     /   count = 2
            // i = 3  --> input[3] = 0    -->   count = 2
            // i = 4  --> input[4] = 1    -->   count = 2  /   output[2] = 1     /   count = 3
            // i = 5  --> input[5] = 0    -->

        }
        System.out.println(Arrays.toString(output));

    }
}
