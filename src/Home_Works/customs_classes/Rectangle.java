package Home_Works.customs_classes;

public class Rectangle {
    /*
    Create a class Rectangle

create instance variables:
    base, height, perimeter, area

create instance methods:

    - toString(): [return String]
        returns all the information of the Rectangle objects, including the perimeter and area

    - calculatePerimeter(): [void]
        calculate the perimeter and store the result into the perimeter instance variable

        a perimeter of a rectangle is the 4 sides added together

    - calculateArea(): [void]
        calculate the area and store the result into the area instance variable

        an area of a rectangle is the height x width
     */

    public double base;
    public double height;
    double perimeter;
    int x;
    int y;
    double area ;


    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", x=" + x +
                ", y=" + y +
                ", area=" + area +
                '}';
    }

    public void calculatePerimeter(){
        perimeter = (base + height) * 2;
    }

    public void calculateArea (){
        area = base * height;
    }
}
