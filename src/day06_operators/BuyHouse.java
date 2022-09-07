package day06_operators;

public class BuyHouse {
    public static void main(String[] args) {
        //create a class BuyHouse
        //
        //    declare and assign a credit score variable
        //    declare and assign a salary
        //
        //    determine if you can get a loan to buy a house
        //    there is two ways to get a loan:
        //        credit score of 720 or above and salary of 100,000 or above
        //        credit score of 740 or above and salary of 80,000 or above

        int creditScore   = 720;
        int creditScore2  = 740;
        int salary        = 100_000;
        int salary2       = 80_000;

        boolean youCanGetaLoan   =720>=720==100_000>=100_000;
        boolean youCanGetaLoan2  =740>=740==80_000>=80_000;



        System.out.println("You can get a loan if your credit score is 720 or above and if salary of 100,000 or above"+"\t"+youCanGetaLoan );
        System.out.println("You can get a loan if your credit score is 740 or above and if salary of 80,000 or above"+"\t"+youCanGetaLoan2);

    }
}
