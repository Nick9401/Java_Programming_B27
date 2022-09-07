package day33_arraylist;

public class CallingRectangle {
    public static void main(String[] args) {


        Rectangle n = new Rectangle();

        n.base = 4;
        n.height = 3.20;
//        n.perimeter = 98.04;
//        n.area = 17.09;

        System.out.println(n);
        n.calculatePerimeter();
    }
}


