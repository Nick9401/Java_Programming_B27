package day06_operators;

public class LogicalExample {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isGoodTemp = true;
        boolean doBbq = isWeekend && isGoodTemp;

        System.out.println(doBbq);
    }
}
