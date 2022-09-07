package day03_variables;

public class Store {
    public static void main(String[] args) {

        int numberOfItems=1000;
        System.out.println(numberOfItems+"in the store");

        numberOfItems=700;
        System.out.println(numberOfItems+"after the sale");

        int totalAfterShipment=numberOfItems+5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment);//soutv


        double totalCost=1_000_000.99;//10,000.000.99
        System.out.println(totalCost);
        float f=19.99F;//adding the letter f/F will tell the compiler
        //this is a float number,not a double number
        float f2=100;
        System.out.println(f);
        System.out.println(f2);

        //int f2=100; valid if i wanted
        //float f2=100F;
        //FLOAT f2=100.99F;

        long population =8_000_000_000L;//Adding l/L to the number will change the type from int(the default)
        //to a long type,because 8 billion was too big to be held in an int type
        System.out.println(population);
        long pop2=1_000_000;//L is needed beacouse 1 ,illion a valid number for int types,and theat type can auto,
        // atically be converted to a bigger type
        System.out.println(pop2);
    }
}
