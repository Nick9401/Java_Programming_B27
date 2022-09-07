package day39OOP_Inharitance.Bank.employee;

public class ObjectsEmployee {
    public static void main(String[] args) {

        tester Person1 = new tester(20000,"Nikolae","01","SDET",'M');

        System.out.println(Person1);
//        Person1.salary = 200000;
//        Person1.name = "Nikolae";
//        Person1.id  = "01";
//        Person1.jobTitle="SDET";
//        Person1.gender = 'M';
//        System.out.println(Person1);
        Person1.reportingBug();
        Person1.testing();

        System.out.println("===================");

        developer Person2 = new developer(20000,"Jhon","02","Developer",'M');
        System.out.println(Person2);
//            Person2.salary=200000;
//            Person2.name = "Jhon";
//            Person2.id = "02";
           Person2.jobTitle="Developer";
           Person2.gender = 'M';


        Person2.fixingBug();
        Person2.coding();
        System.out.println(Person2);

        System.out.println("========================");

        BusinessAnalyst Person3 =new BusinessAnalyst();

        Person3.salary= 300000;
        Person3.name = "Albert";
        Person3.id = "03";
        Person3.jobTitle="BusinessAnalyst";
        Person3.gender='M';

        Person3.writingRequirements();
        Person3.gathering();

        System.out.println(Person3);




    }

}
