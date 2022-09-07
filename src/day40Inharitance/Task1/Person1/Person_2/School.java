package day40Inharitance.Task1.Person1.Person_2;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("Nargiz", 27, 'f', 2353, "testing");
        student3.setStudentInfo("Abai" , 45, 'm', 3425, "developer");
        student3.setStudentInfo("Micheal", 32, 'm', 4353, "sdet");

        ArrayList<Student>StudentList=new ArrayList<>();
        StudentList.addAll(Arrays.asList(student1,student2,student3));

        for(Student each:StudentList){
            System.out.println("name"+each.name+",ID:"+each.studentID);

        }



    }
}
