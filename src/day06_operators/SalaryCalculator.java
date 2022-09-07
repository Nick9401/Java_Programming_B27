package day06_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 100_00;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax,federalTax,totalTax,salaryAfterTax;

        stateTax = salary *stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        String taxReport = "Saary" + salary +"state tax rate:" + stateTaxRate + "Federal tax rate " + federalTaxRate
                + "\nState tax:"+ stateTax + "Fedral tax " + federalTax + "\nTotal salry after taxes"+
                salaryAfterTax;

        System.out.println(taxReport);


    }
}
