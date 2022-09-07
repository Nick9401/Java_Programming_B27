package day31_arraylist;
import java.util.ArrayList;
public class RemovingMethod {
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);

        words.remove(2);
        System.out.println(words);

        System.out.println("__________________");

        System.out.println(words.remove(0));
        System.out.println(words);


        System.out.println("__________________________");
        words.clear();           // remove all array
        System.out.println(words);
        System.out.println("_________________");

        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);

        System.out.println("___________________");

        words.remove("barn");
        System.out.println(words);

        System.out.println("___________________");

        System.out.println(words.remove("Caw"));
        System.out.println(words);

        System.out.println("____________________");

        System.out.println(words.remove("chicken"));
        System.out.println(words);


        System.out.println("_______________________________________________________");


        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);
// How to remove a number from array
        nums.remove(0);
        System.out.println(nums);

        Integer a = 0;
        nums.remove(a);            //remove index or element ?
        System.out.println(nums);

        nums.remove((Integer) 2);
        System.out.println(nums);

        nums.add(0,4);
        System.out.println(nums);
        nums.remove((Integer)4);
        System.out.println(nums);



    }
}
