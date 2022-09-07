package day30_practice_wrapper;

public class WrapperClass2 {

    public static void main(String[] args) {

        System.out.println("Byte Min: " + Byte.MIN_VALUE);
        System.out.println("Byte Max: " + Byte.MAX_VALUE);

        System.out.println("Integer Min: " + Integer.MIN_VALUE);
        System.out.println("Integer Max: " + Integer.MAX_VALUE);

        System.out.println(Character.isDigit('4'));
        System.out.println(Character.isLetter('o'));
        System.out.println(Character.isUpperCase('e')); // if(char >= 'A' && char <= 'Z');
    }
}
