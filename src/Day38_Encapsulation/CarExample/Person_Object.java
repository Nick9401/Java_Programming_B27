package Day38_Encapsulation.CarExample;

public class Person_Object {
    public static void main(String[] args) {

       Person Zarina = new Person("Zarina");

        System.out.println(Zarina.name);
        System.out.println("Zarina SSN"+ Zarina.getSSN());

        Zarina.setSSN(123456);
        System.out.println("Zarina SSN"+ Zarina.getSSN());


    }
}
