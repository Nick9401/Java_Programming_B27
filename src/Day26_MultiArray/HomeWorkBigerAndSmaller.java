package Day26_MultiArray;

public class HomeWorkBigerAndSmaller {
    public static void main(String[] args) {
        /*   Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12

Extra: Find the max and min between each inner array

     */



            int[][] array2D = {
                    {1, 5, 2, 23},
                    {-12, 41, -5, -2},
                    {1, 5, 1, 5}
            };

            int min = 1000_000;
            int max = -1000_000;

            for (int[] innerArray : array2D) {      //  outer loop: arrays

                for (int number : innerArray) {     // inner loop : each element outer loop
                    if (number > max) {
                        max = number;
                    }

                    if (number < min) {
                        min = number;
                    }
                }
            }

            System.out.println("max = " + max);
            System.out.println("min = " + min);


        }
}
