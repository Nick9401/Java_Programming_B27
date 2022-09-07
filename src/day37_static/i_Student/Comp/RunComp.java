package day37_static.i_Student.Comp;

public class RunComp {
    public static void main(String[] args) {

        Computer Computer1 = new Computer(1000,"HP","Grey",500);
        System.out.println(Computer1);

        System.out.println("Computer has Screen: " +Computer.hasScreen);
        System.out.println("Computer has Battery: " +Computer.hasBattery);
        System.out.println("Computer has Memory: " +Computer.hasMemory);



    }
}
