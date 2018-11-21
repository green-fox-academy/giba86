package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private List<Aircraft> megaCarrier;
  private int storedAmmo;
  private int carrierHP;
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
