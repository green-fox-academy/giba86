package main.java.animals;

import main.java.animals.Animal;

public class Reptile extends Animal {
  public Reptile(String name) {
    super(name);
  }

  @Override
  public String breed() {
    super.breed();
    return  "laying eggs.";
  }
}
