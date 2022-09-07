package day40Inharitance.Task1.Person1.Person_2;

public class Person {

  public String name;
  public int age;
  public char gender;

  public void setPersonInfo(String name,int age,char gender){
    this.name = name;
    this.age = age;
    this.gender= gender;

  }
   public void eat(String food){
    System.out.println(name+"is eating meal "+food);
  }
   public void sleep(){
  System.out.println(name+"is sleeping");
}
   public void walk(){
  System.out.println(name+"is walking ");
}
   public void drink (String drink){
  System.out.println(name+"is drinking"+ drink);
}

}
