package week10.rest.Models;

public class Greeter {

  private String name;
  private String title;

  public Greeter() {
  }

  public Greeter(String name, String title) {
    this.name = name;
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
