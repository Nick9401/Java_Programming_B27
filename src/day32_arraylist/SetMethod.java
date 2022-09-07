package day32_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<String> strs = new ArrayList<>();
        strs.add("friday");
        strs.add("off");
        strs.add("study");
        strs.add("relax");
        System.out.println(strs);

        int indexOfRelax = strs.indexOf("relax");
        strs.set(indexOfRelax, "coding");
        System.out.println(strs);
    }
}
