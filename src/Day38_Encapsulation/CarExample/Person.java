package Day38_Encapsulation.CarExample;


public class Person {

    public String name;

    private long SSN;
    private int ID;

    public Person(String name ){
        this.name = name;

    }

    public long getSSN(){
        return SSN;
    }
    public void setSSN(long SSN){
        this.SSN = SSN;

    }
    public int getID(){
        return ID;
    }
    public void setID(){
        this.ID =ID;

    }


}
