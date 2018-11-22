package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super("Duum-duum-duum", 4);
  }

  public BassGuitar(int numberOfStrings) {
    super("Duum-duum-duum", numberOfStrings);
  }

  @Override
  public void play() {
    System.out.println("Bass Guitar, a " + numberOfStrings + "-stringed instrument that goes " + getName());
  }
}
