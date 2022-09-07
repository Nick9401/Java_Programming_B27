package day21_nested_loops;

public class homeWork {
    public static void main(String[] args) {
        String str = "1244334455666777888";
        int count = 0;
        String doubleChar = "";

        for (int i = 0; i < str.length() ; i++) { // outer loop takes the char from  1st to the last

            //1 takes

            for (int j = 0; j <str.length(); j++){ // inner loop will compare char from outer with all chars in the string
                // compare:
                // 1-2
                //1-3
                //1-4

                if (str.charAt(i) == str.charAt(j)){
                    count ++;
                }
            }
            if (count >= 2) {
                if(!doubleChar.contains("" + str.charAt(i))){    //Variant 1
                    doubleChar += str.charAt(i);
                    System.out.println(str.charAt(i));

                    //  System.out.println(str.charAt(i));   //var  2
                    //    System.out.println(" has index -" + i);
                    //   break;

                }
                if (count == 1){
                    System.out.println(str.charAt(i)); // var 3
                    System.out.println(" has index - " + i);
                    break;
                }
                count = 0;
            }}
    }}
