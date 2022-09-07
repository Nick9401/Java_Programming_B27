package days05_arithmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double stateTaxRate = 0.08;

        double federalTaxRate = 0.21;

        int salaryBeforeTax = 100_000 ;

        double stateTax = salaryBeforeTax * stateTaxRate ;

        double federalTax = salaryBeforeTax * federalTaxRate ;

        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);

        System.out.println("State tax = $" + stateTax);

        System.out.println("Federal tax =$" + federalTax);

        System.out.println("Total tax =$" + totalTax);

        System.out.println("Net income = $" + salaryAfterTax);
    }
}
