package Home_Works.customs_classes;

public class RecatangleWorking {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();

        rec1.base = 10;
        rec1.height = 20;
        rec1.x = 5;
        rec1.y = 12;
        System.out.println(rec1);

        rec1.calculatePerimeter();
        System.out.println(rec1);

        rec1.calculateArea();
        System.out.println(rec1);
    }
}
