package Day38_Encapsulation.CarExample.BankofAmerica;

public class NewEmplye {

    private double  salary;
    private long SSN;
    private int ID;
    private String Address;

    public static String companyName = "Cybertek";

public double getSalary(){
   return salary;
}
public void setSalary(double salary){
    this.salary=salary;
}
public long getSSN(){
    return SSN;
}
public void setSSN(long SSN){
    this.SSN=SSN;
}
public int getID(){
    return ID;
}
public void setID(int ID){
    this.ID=ID;
}
public String getAddress(){
    return Address;
}
public void setAddress(String address){
    this.Address=Address;
}


}
