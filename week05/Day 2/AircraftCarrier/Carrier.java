package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private List<Aircraft> megaCarrier;
  private int storedAmmo;
  int carrierHP;
  private int totalDamage;

  public Carrier(int ammo) {
    this.megaCarrier = new ArrayList<>();
    this.storedAmmo = ammo;
    carrierHP = 5000;
  }

  public void addAircraft(Aircraft aircraft) {
    megaCarrier.add(aircraft);
  }

  public void fill() {
    for (int i = 0; i < megaCarrier.size(); i++) {
      if (megaCarrier.get(i).isPriority()) {
        megaCarrier.get(i).refill(storedAmmo);
        storedAmmo -= megaCarrier.get(i).ammoLevel;
        if (storedAmmo == 0) {
          System.out.println("No more ammo!!");
          break;
        }
      }
    }
    for (int i = 0; i < megaCarrier.size(); i++) {
      megaCarrier.get(i).refill(storedAmmo);
      storedAmmo -= megaCarrier.get(i).ammoLevel;
      if (storedAmmo == 0) {
        System.out.println("No more ammo!!");
        break;
      }
    }
  }

  public int getTotalDamage() {
    totalDamage = 0;
    for (int i = 0; i < megaCarrier.size(); i++) {
      totalDamage += megaCarrier.get(i).ammoLevel * megaCarrier.get(i).baseDamage;
    }
    return totalDamage;
  }

  public void fight(Carrier carrier) {
    System.out.println("Battle is started!");
    int ourWarScore = carrierHP - carrier.totalDamage;
    int opponentWarSc = carrier.carrierHP - totalDamage;
    System.out.println("Our warscore: " + ourWarScore + " their warscore: " + opponentWarSc);
    int ourCounter = 0;
    int opponentCounter = 0;
    while (carrierHP <= 0 || carrier.carrierHP <= 0 || storedAmmo <= 0 || carrier.storedAmmo <= 0) {
      if (ourCounter >= megaCarrier.size()) {
        ourCounter = 0;
        for (int i = 0; i < megaCarrier.size(); i++) {
          megaCarrier.fill();
        }
      } else if (opponentCounter >= carrier.megaCarrier.size()) {
        opponentCounter = 0;
        carrier.fill();
      }
      carrierHP -= carrier.megaCarrier.get(opponentCounter).fight(megaCarrier);
      carrier.carrierHP -= megaCarrier.get(ourCounter).fight(carrier);
      }

  }

   public String getStatus() {
    List statusList = new ArrayList();
    for (int i = 0; i < megaCarrier.size(); i++) {
      statusList.add(megaCarrier.get(i).getStatus() + "\n");
    }
   return  "HP: " + carrierHP + ", Aircraft Count: " + megaCarrier.size() + ", Ammo Storage: " + storedAmmo + ", Total Damage: " + totalDamage +
           "\n Aircrafts: " + statusList + "\n";
  }
}
