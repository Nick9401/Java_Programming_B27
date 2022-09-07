package day40Inharitance.Task1.Person1;

import Resources.Accessmodifiers;

public class TestData2 extends Accessmodifiers {


    public static void main(String[] args) {
        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.protectedVariable);
        //System.out.println(TestData2.defaultVariable);

        TestData2.publicMethod();
        TestData2.protectedMethod();
        //TestData2.defaultMethod();


    }

}
