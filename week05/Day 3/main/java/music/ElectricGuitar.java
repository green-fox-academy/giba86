package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  public ElectricGuitar() {
    super("Twang", 6);
  }

  public ElectricGuitar(int numberOfStrings) {
    super("Twang",numberOfStrings);

  }

  @Override
  public void play() {
    System.out.println("Electric Guitar, a " + numberOfStrings + "-stringed instrument that goes " + getName());
  }
}
