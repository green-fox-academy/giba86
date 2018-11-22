package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    super("Screech", 4);
  }

  @Override
  public void play() {
    System.out.println("Violin, a " + numberOfStrings + "-stringed instrument that goes " + getName());
  }
}
