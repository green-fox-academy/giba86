package com.example.coloringaround.coloring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blueColor")
public class BlueColor implements MyColor {


  @Override
  public void printColor() {
    System.out.println("It is blue in color...");
  }
}
