package Comparable;
/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing>, Printable {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing o) {
    if (this.completed == o.completed) { // checks that weather thing is completed
      return name.compareTo(o.name); //giving the abc order     -   toLowerCase().charAt(0) - o.name.toLowerCase().charAt(0) compares only the first character
    } else if (this.completed){
      return -1;                          // if -1, completed things comes first. Otherwise with +1 goes to the back
    } else {
      return 1;
    }
  }

  @Override
  public void printAllFields() {
    System.out.println(name + " is " + (completed ? "done" : "not done"));
  }
}