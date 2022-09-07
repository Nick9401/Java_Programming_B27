package day35_custom_classes.Employee;

public class Employee {


    String name ;
    int ID ;
    String JobTitle;
    Double Salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public Employee(String inputname, int inputID, String inputJobTitle, Double inputSalary){

        name = inputname;
        ID = inputID;
        JobTitle = inputJobTitle;
        Salary = inputSalary;

    }

    public void goToMeeting(){

        name = name + "is going to meeting";
    }
}
