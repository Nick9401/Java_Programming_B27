package Day38_Encapsulation.CarExample.Employee;

import javax.lang.model.element.Name;

public class Employee {

    String name;
    String jobTitle;
   int ID;
    double salary;
    char gender;
    static String  companyName = "BOA";


    public Employee(String name){
        this.name=name;
    }

    public Employee(String name,String jobTitle){
        this(name);
        this.jobTitle=jobTitle;
    }

    public Employee(String name,String jobTitle,int ID){
        this(name,jobTitle);
        this.ID=ID;
    }

    public Employee(String name, String jobTitle,int ID,double salary){
        this(name,jobTitle,ID);
        this.salary= salary;

    }

    public Employee(String name, String jobTitle, int ID, double salary, char gender) {
        this(name,jobTitle,ID,salary);
        this.gender = gender;
    }

    public String toString(){
        return "Name:"+name+" "+"Id: ,"+ID+ "job Title: ,"+jobTitle+"Company Name: ,"+companyName+"Salary ,"+salary+"Gender: ,"+gender;
    }
}
