package day39OOP_Inharitance.Bank.Animal1;

public class Dog extends Animal {

    public void bark(){
        System.out.println(Name+" is barking");
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.Name = "Lucy";

        System.out.println(dog1.Name);

        dog1.move();
        dog1.eat();
    }
}
