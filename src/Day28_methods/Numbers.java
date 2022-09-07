package Day28_methods;

import java.util.Scanner;

public class Numbers {

    public static void checkNum(int n){

        if(n > 0){
            System.out.println(" positive ");
        } else if (n < 0) {
            System.out.println(" negative ");

        }else{
            System.out.println(" zero ");
        }
    }

    public static void main(String[] args) {
        checkNum(51);
        checkNum(0);
        checkNum(-14);

        Scanner input = new Scanner (System.in);
        checkNum((input.nextInt()));

        //or
        int n = 3;
        checkNum(n);
    }
}
