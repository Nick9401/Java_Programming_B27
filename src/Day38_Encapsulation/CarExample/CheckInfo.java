package Day38_Encapsulation.CarExample;

public class CheckInfo {
    public static void main(String[] args) {




        System.out.println("Name"+ PersonalInfo.name);
        System.out.println("Gender"+PersonalInfo.gender);

        System.out.println("Grade"+PersonalInfo.grade);
        System.out.println("Age"+PersonalInfo.age);

        // System.out.println(PersonalInfo.SSN);
        // System.out.println(PersonalInfo.ID);

        PersonalInfo obj = new PersonalInfo();

        System.out.println(obj.name);
        System.out.println(obj.gender);

        System.out.println(obj.grade);
        System.out.println(obj.age);
    }
}
