package main.java.animals;

public class Animal {
  protected String name;
  protected int age;

  public Animal(String name) {
    this.name = name;
  }

  public Animal() {

  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String breed() {
    return "breeding to create more and more";
  }

  public void eating() {
    System.out.println("eating some tasty animal food");
  }

  public void sleeping() {
    System.out.println("going to the animal house to get sleep in an animal bed");
  }

  public void moving() {
    System.out.println("this animal is changing place");
  }

}
