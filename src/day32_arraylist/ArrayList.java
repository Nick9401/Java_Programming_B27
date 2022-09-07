package day32_arraylist;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list1 = new java.util.ArrayList<>();
        list1.add("friday");
        list1.add("java");
        list1.add("movies");
        list1.add("sports");
        System.out.println(list1);

        java.util.ArrayList<String> list2 = list1; // make another reference for the same object
        list2.add("soft skills");

        System.out.println(list1);
        System.out.println(list2);

        java.util.ArrayList<String> list3 = new java.util.ArrayList<>(list1); // creating a new ArrayList object with the same values as the list1
        list3.remove(0);

        System.out.println("list 1: " + list1);
        System.out.println("list 3: " + list3);

    }
}
