package day33_arraylist;

public class Rectangle {

    int base;
    double height;
    double perimeter;
    double area;

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    public void calculatePerimeter (){
        perimeter += (base + height) * 2;
        System.out.println(perimeter);

    }
    public void calculateArrea(){
        area +=(base * height);
        System.out.println(area);
    }
}
