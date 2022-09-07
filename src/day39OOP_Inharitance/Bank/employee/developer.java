package day39OOP_Inharitance.Bank.employee;

public class developer extends Employee {



    public developer(double salary, String name, String id, String jobTitle, char gender) {
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }
    public void fixingBug() {
        System.out.println("Fixing Bug " + name);
    }
        public void coding(){
            System.out.println("Coding"+name);

    }
}
