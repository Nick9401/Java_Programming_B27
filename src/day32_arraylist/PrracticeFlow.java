package day32_arraylist;

import java.util.ArrayList;

public class PrracticeFlow {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("hat");
        words.add("shoes");
        words.add(1,"Jacket");
        words.add(0,"Towel");
        words.add(1,"Car");
        System.out.println(words);


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(800);
        nums.add(300);
        nums.add(400);
        nums.add(300);
        System.out.println(nums);

        nums.remove((Integer)300);
        System.out.println(nums);
        nums.remove(nums.lastIndexOf(300));

        ArrayList<Character> name = new ArrayList<>();
        name.add('S');
        name.add('a');
        name.add('i');
        name.add('m');







    }
}
