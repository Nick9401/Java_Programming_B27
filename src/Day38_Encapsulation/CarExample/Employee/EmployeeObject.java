package Day38_Encapsulation.CarExample.Employee;

import Day38_Encapsulation.CarExample.Employee.Employee;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jon");
        System.out.println(employee1);

        Employee employee2 =new Employee("Colea","IT admin");
        System.out.println(employee2);

        Employee employee3 = new Employee("George","Carpenter",123);
        System.out.println(employee3);

        Employee employee4 = new Employee("Victor","Mover",124,50000);
        System.out.println(employee4);

        Employee employee5 = new Employee("Alex","Mechanic",888,90000,'M');
        System.out.println(employee5);
    }
}
