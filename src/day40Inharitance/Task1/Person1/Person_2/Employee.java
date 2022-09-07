package day40Inharitance.Task1.Person1.Person_2;

public class Employee extends Person {

    public double salary;
    public long employeeID;
    public String jobTitle;


    public void setEmployeeInfo(String name, int age, char gender, double salary, long employee, String jobTitle) {
        setPersonInfo(name,age,gender);
        this.employeeID=employee;
        this.jobTitle= jobTitle;
        this.salary= salary;

    }

    public void work (){
        System.out.println(name+"is working");
    }
    public String toString(){
        return "Name:"+name+",Job Title:"+jobTitle+",ID:"+employeeID+",Salary"+salary;
    }


}
