package com.example.hellobeanworld.hellobeanworld;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

  private Printer printer;
  public Printer() {
    System.out.println("The Printer itself: ");
  }

  public void log(String message) {
    System.out.println("   " + LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
  }


}
