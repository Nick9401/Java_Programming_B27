package day17_String;

public class loop {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        // infinite loop, doesn't stop
//        while(true){
//            System.out.println("Hello World");
//        }

        System.out.println();
        // print 50 times
        int counter = 1; // 0 loop counter < 50

        while(counter <= 50){
            System.out.println("Hello World " + counter);
            counter++; // this line adds 1 to the number each iteration, it allows the loop to stop at some point
        }

        char first = 'A';

        while (first <= 'Z') {
            System.out.print(first++);
        }

        System.out.println();

        // prinintg z - a
        char backwards = 'z';
        while(backwards >= 'a'){
            System.out.print(backwards--);
        }

        /*

            iteration 1:
                first = 'A'
                   'A' < 'Z' true
                   loop runs
                   prints(first) -> A
                   then increments because of post increment
                   first++ -> B

            iteration 2:
                first = B
                    B < Z true
                    loop runs
                    print(first) -> B
                    first++ -> C

         */

    }
}
