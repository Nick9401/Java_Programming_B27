package day10_if_statements;

public class HomeWork5 {
    public static void main(String[] args) {

        int score =750;

       String message1 = " ";

//        if(score >= 700){
//            message1 = "Loan approved";
//        }else {
 //           message1 ="Loan Rejected";
   //     }


 //       /////--------------------------------

        message1 = (score >= 700) ? "Loan approved" : "Loan Rejected";
        System.out.println(message1);



//     --------------------------------------
        System.out.println((score >= 700) ? "Loan approved" : "Loan Rejected");

    }
}