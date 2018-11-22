package main.java.music;

public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;

  public StringedInstrument(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstrument() {

  }

  public void sound() {
    play();
    System.out.println("\n");
  }
}
