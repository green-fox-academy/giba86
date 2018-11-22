package Cloneable;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {
    Student john = new Student("John", 20, "male", "BME");

    Student cloneJohn = (Student) john.clone();

  }
}
