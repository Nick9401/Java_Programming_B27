package day39OOP_Inharitance.Bank.employee;

import day39OOP_Inharitance.Bank.employee.Employee;

public class tester extends Employee {


    public tester(double salary, String name, String id, String jobTitle, char gender) {
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }
    public void reportingBug(){
        System.out.println("Reporting Bug"+name);
    }
    public void testing(){
        System.out.println("Is testing"+name);
    }
}
