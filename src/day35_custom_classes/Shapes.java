package day35_custom_classes;

import Home_Works.customs_classes.Rectangle;

public class Shapes {
    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle();
        rectangle1.base = 4.5;
        rectangle1.height = 8.2;
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle1);

    }
}
