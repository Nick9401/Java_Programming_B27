package day40Inharitance.Task1.Person1;




class test {
    public test(){
        System.out.println("A");
    }
}




public class Constructor extends test {

    public Constructor(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        test obj = new test();
    }

}
