package day40Inharitance.Task1.Person1.Person_2;

import day40Inharitance.Task1.Person1.Person_2.Person;

public class Student extends Person {

    public long studentID;
    public String clazz;

    public static String schoolName = "Cydeo";

    public void setStudentInfo(String name,int age,char gender,long studentID,String clazz){
        setPersonInfo(name,age,gender);
        this.studentID=studentID;
        this.clazz=clazz;

    }

    public void attendClass(){
        System.out.println(name+"is attending"+clazz);
    }

    public void code(){
        System.out.println(name+" is coding");
    }


    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", clazz='" + clazz + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender + "school"+schoolName;


}



}
