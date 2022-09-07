package day11_if_statements;

public class HomeWorkGradeLevel {
    public static void main(String[] args) {

        int School = 18;

        if (School>=1 && School <=5){
            System.out.println("Elementary school");
        }else if (School >=6 && School<=8){
            System.out.println("Middle school");
        }else if (School>=9 && School <=12){
            System.out.println("High school");
        }else if (School >= 13 && School<=16){
            System.out.println("College");
        }else if (School >= 17 && School<=18 ){
            System.out.println("Grad School");

        }else{
            System.out.println("Is not valid");
        }
        System.out.println(School);


    }
}
