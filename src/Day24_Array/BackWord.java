package Day24_Array;

import java.util.Arrays;

public class BackWord {
    public static void main(String[] args) {
        String str = "Today is Friday. Have a good weekend!";

        // reverse: weekend! good a Have Friday. is Today

        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String reverse = "";

        for (int i = words.length - 1; i >= 0; i--){
            reverse += words[i] + " ";
        }

        System.out.println(reverse.trim());
    }
}
