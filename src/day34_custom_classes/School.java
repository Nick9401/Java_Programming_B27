package day34_custom_classes;

public class School {

    public static void main(String[] args) {
        Student studentOne = new Student();
        System.out.println(studentOne); // print the objects, but we get some hash values

        studentOne.name = "Olena";
        studentOne.batchNumber = 27;
        studentOne.program = "SDET";
        studentOne.grade = 99.99;

        System.out.println(studentOne); // this still does not show us anything useful

        System.out.println(studentOne.name);
        System.out.println(studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);





    }
}
