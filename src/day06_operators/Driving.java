package day06_operators;

public class Driving {
    public static void main(String[] args) {

        int currentspeed =45;
        int speedLimit =50;
        boolean isSpeeding = currentspeed>speedLimit;
        System.out.println("Is speeding:"+isSpeeding);

        int number = -4;
        boolean isPsitive = number >0;
        boolean isNegative = number <0;
        boolean isZero =  number == 0;
        System.out.println("isPositive ="+isPsitive);
        System.out.println("isNegative="+isNegative);
        System.out.println("isZero="+isZero);
    }
}
