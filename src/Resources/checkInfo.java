package Resources;


import Day38_Encapsulation.CarExample.PersonalInfo;
import day_12_if_statemant.SoccerGame;

public class checkInfo {

    public static void main(String[] args) {

        System.out.println("Name:"+PersonalInfo.name);
        System.out.println("Gender:"+PersonalInfo.gender);

        //System.out.println("Grade: "+PersonalInfo.grade);
        // System.out.println("SSN: "+ PersonalInfo.SSN);
        // System.out.println("ID:"+PersonalInfo.ID);
        //System.out.println("Age: "+ PersonalInfo.age);

        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);

       // System.out.println(obj.grade);
        //System.out.println(obj.SSN);
        //System.out.println(obj.ID);

    }
}
