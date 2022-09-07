package day39OOP_Inharitance.Bank.Animal1;

public class fish extends Animal {

public void swim(){
    System.out.println(Name+"is swimming");
}

    public static void main(String[] args) {
        fish obj1 = new fish();
        obj1.Name = "Nemo";
        obj1.weight=5;
        obj1.size = "Small";

        obj1.eat();
        obj1.move();
        obj1.swim();
    }
}
