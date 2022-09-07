package day11_if_statements;
/*
              ? -if
              : - else
 */
public class Loan {
    public static void main(String[] args) {

        double creditScore = 800;
        String result = creditScore > 700 ?"Loan approved" : "Loan rejected";

        System.out.println(result);
    }
}
