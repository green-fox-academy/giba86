package main.java.music;


public abstract class Instrument {

  private String name;

  public Instrument(String name) {
    this.name = name;
  }

  Instrument() {

  }

  public String getName() {
    return name;
  }

  public abstract void play();



}
