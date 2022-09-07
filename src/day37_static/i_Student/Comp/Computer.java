package day37_static.i_Student.Comp;

public class Computer {

    double price;
    String brand;
    String Color;
    int memory;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;
    static {

        hasScreen= true;
        hasBattery = true;
        hasMemory = true;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", Color='" + Color + '\'' +
                ", memory=" + memory +
                '}';
    }

    public Computer(double price, String brand, String color, int memory) {
        this.price = price;
        this.brand = brand;
        this.Color = color;
        this.memory = memory;
    }
}
