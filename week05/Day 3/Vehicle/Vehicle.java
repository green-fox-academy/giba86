package Vehicle;

public abstract class Vehicle {
  private String name;
  private String type;
  private int enjoyLevel;

  public Vehicle(String name, String type, int enjoyLevel) {
    this.name = name;
    this.type = type;
    this.enjoyLevel = enjoyLevel;
  }

  public Vehicle() {

  }
}
