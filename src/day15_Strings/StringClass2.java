package day15_Strings;

public class StringClass2 {
    public static void main(String[] args) {
        String word = "java";

        System.out.println(word.startsWith("j"));
        System.out.println(word.startsWith("ja"));
        System.out.println(word.startsWith("jae"));

        System.out.println("------------------------");

        System.out.println(word.endsWith("a"));
        System.out.println(word.endsWith("A"));
        System.out.println(word.endsWith("java"));
        System.out.println(word.endsWith("va"));
        System.out.println(word.endsWith("va "));

        boolean b = word.startsWith("hello");

    }
}
