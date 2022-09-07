package day22_array;

public class FirstArray {
    public static void main(String[] args) {

        int [] nums ; //declaring an int array
        nums = new int [5];//initializzing the array with 5 spaces
        // so far this our array : [0, 0, 0, 0, 0,]
                               //   0  1  2  3  4

        System.out.println(nums[0]);

        // change the first element to be 10
        nums [0] = 10; //assigning the value 10 un position 0 of the array

        System.out.println(nums[0]);

        nums [3] = 25;

        System.out.println(nums[3]);
        //at this point the whole array : [10, 0, 0, 25, 0]

        //declaring an initializing with the values:

        int[] other = {5, 7, 10, -8, 20, 12};
        System.out.println(other[1]);
        System.out.println(other[4]);

    }

}
