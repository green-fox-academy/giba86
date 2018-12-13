package com.example.day4.dependencytasks;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

  public void log(String myColor) {
    System.out.println("\n" + LocalDateTime.now() + " MY PRINTER SAYS : " + myColor);
  }
}
