package com.example.day4.dependencytasks;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("redColor")
public class RedColor implements MyColor {


  @Override
  public String printColor() {
    return "It is red in color...";
  }
}
