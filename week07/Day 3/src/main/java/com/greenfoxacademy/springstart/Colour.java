package com.greenfoxacademy.springstart;

import java.util.Random;

public class Colour {
  Random randColors = new Random();

  private int r = randColors.nextInt(256);
  private int g = randColors.nextInt(256);
  private int b = randColors.nextInt(256);

  @Override
  public String toString() {
    return "rgb(" + r + ", " + g + ", " + b +")";
  }
}
