package com.example.day4.dependencytasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencytasksApplication implements CommandLineRunner {

  @Autowired
  private Printer printer;

  @Autowired
  @Qualifier("redColor")
  MyColor red;

  @Autowired
  @Qualifier("blueColor")
  MyColor blue;

  public static void main(String[] args) {
    SpringApplication.run(DependencytasksApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("\n" + blue.printColor() + "\n" + red.printColor());
  }
}

