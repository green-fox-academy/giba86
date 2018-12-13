package com.example.day4.dependencytasks;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blueColor")
public class BlueColor implements MyColor {


  @Override
  public String printColor() {
    return "It is blue in color...";
  }
}
