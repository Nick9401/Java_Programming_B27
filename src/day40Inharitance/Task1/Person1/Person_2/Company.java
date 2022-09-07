package day40Inharitance.Task1.Person1.Person_2;

public class Company {

    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static{
        employee1 = new Employee();
        employee1.setEmployeeInfo("Vasya", 36, 'm', 298373, 43534345, "vice president");


        employee2 = new Employee();
        employee2.setEmployeeInfo("Masya", 36, 'm', 298373, 43534345, "vice president");


        employee3 = new Employee();
        employee3.setEmployeeInfo("Pasya", 36, 'm', 298373, 43534345, "vice president");

    }

    public static void main(String[] args) {

        Employee[] employees = {employee1, employee2, employee3};
        for (int i = 0; i < employees.length; i++) {
            // System.out.println(employees[i]);
            System.out.println("Name: " + employees[i].name + ", ID: " + employees[i].employeeID);
        }
    }
    }
