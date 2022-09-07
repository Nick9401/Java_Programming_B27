package day21_nested_loops;

public class NestedLoop2 {
    public static void main(String[] args) {
        for(int i = 0; i < 9; i++){ // i = 2
            for(int j = 0; j <= 8; j++){ // j = 0
                System.out.print(" * ");
            }
            System.out.println();

        }

        System.out.println("______________");



        for (int i = 0; i < 8; i++) {
            for (int j = 8; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }}

