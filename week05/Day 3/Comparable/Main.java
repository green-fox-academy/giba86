package Comparable;

import java.awt.*;
import java.awt.print.PageFormat;


import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    Collections.sort(dominoes);

    System.out.println(dominoes);   //sorting the dominoes with left side values

    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing one = new Thing("Get Milk");
    fleet.add(one);

    Thing two = new Thing("Remove the obstacles");
    fleet.add(two);

    Thing three = new Thing("Stand up");
    fleet.add(three);
    three.complete();

    Thing four = new Thing("eat Lunch");
    fleet.add(four);
    four.complete();

    Thing five = new Thing("amplifire");
    fleet.add(five);

    Thing six = new Thing("Bravo maistro");
    fleet.add(six);

    System.out.println(fleet);

    Collections.sort(fleet.getThings());

    System.out.println(fleet);

    for (Domino d : dominoes) {
      d.printAllFields();
    }

    for (Thing t : fleet.getThings()) {
      t.printAllFields();
    }

  }

}
