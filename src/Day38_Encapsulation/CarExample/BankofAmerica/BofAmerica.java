package Day38_Encapsulation.CarExample.BankofAmerica;

public class BofAmerica {
    public static void main(String[] args) {

        NewEmplye Jon = new NewEmplye();

        Jon.setAddress("7601 Lord Snowden cir");

        System.out.println(Jon.getAddress());
        System.out.println(Jon.companyName);
        Jon.setSalary(120000);
        System.out.println(Jon.getSalary());
        Jon.setID(152);
        System.out.println(Jon.getID());

    }

}
