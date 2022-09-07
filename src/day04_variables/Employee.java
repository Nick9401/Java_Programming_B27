package day04_variables;

public class Employee {
    public static void main(String[] args) {
        String FirstName="Nicolae";
        String LastName = "Sultan";
        String CompanyName="Premier Carfters";
        String JobTitle = "Superviser";
        byte suite;
        suite = 4;
        byte employeeId;
        employeeId=1;
        int numberOfPto =13;
        double salary =1_500;
        boolean isFullTime=true;

        System.out.println("FirstName = " + FirstName);
        System.out.println("LastName = " + LastName);
        System.out.println("CompanyName = " + CompanyName);
        System.out.println("JobTitle = " + JobTitle);
        System.out.println("suite = " + suite);
        System.out.println("employeeId = " + employeeId);
        System.out.println("numberOfPto = " + numberOfPto);
        System.out.println("isFullTime = " + isFullTime);

        String fullName = "Emplyment information for Nicolae Sultan";
        String email = "sultan.nicolae1994@gmail.com,supervisor at Premier Crafters.com";
        String benefits= "salary 1500,20 PTU and work from home";
        System.out.println("fullName = " + fullName);
        System.out.println("email = " + email);
        System.out.println("benefits = "+ benefits);

   }
}
