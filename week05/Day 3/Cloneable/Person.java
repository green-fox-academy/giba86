package Cloneable;

public class Person implements java.lang.Cloneable {

    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void introduce() {
        System.out.println("I am " + name + ", a " + age + " years old " + gender);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

}
