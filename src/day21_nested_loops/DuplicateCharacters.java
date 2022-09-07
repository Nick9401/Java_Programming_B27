package day21_nested_loops;

public class DuplicateCharacters {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                for (int k = 1; k <=5 ; k++) {

                    if (i!=k && i !=j && j!=k){
                        System.out.println(""+i+j+k);


                    }

                }

            }

        }







    }
}