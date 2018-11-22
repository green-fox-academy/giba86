package Reservations;

import java.util.Random;

public class Reservations implements Reservationy {

  private int lengthOfCode = 8;
  private String theCode = "";

  private String reservationCode() {
    Random randCharacter = new Random();
    for (int i = 0; i < lengthOfCode; i++) {
      int asciiCode = randCharacter.nextInt(43) + 48;
      if (asciiCode > 57 && asciiCode < 65) {
        while (asciiCode > 57 && asciiCode < 65) {
          asciiCode = randCharacter.nextInt(43) + 48;
        }
      }
      theCode = theCode + (char) asciiCode;
    }
    return theCode;
  }

  private String daysShortend() {
    String[] shortedDays = new String[7];
    String[] dows = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    for (int i = 0; i < dows.length; i++) {
      shortedDays[i] = dows[i].toUpperCase().substring(0,3);
    }
    Random randDay = new Random();
    int chosenDay = randDay.nextInt(7);
    return shortedDays[chosenDay];
  }

  @Override
  public String getDowBooking() {
    return "Booking# " + reservationCode() + " for " + daysShortend();
  }

  @Override
  public String getCodeBooking() {
    return getDowBooking().substring(9, 17);
  }
}
