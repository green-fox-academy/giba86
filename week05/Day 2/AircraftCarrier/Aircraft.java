package AircraftCarrier;

public class Aircraft {
  int ammoLevel;
  private int maxAmmo;
  int baseDamage;
  private int damage;
  String[] aircraftTypes = {"F16 - Fighting Falcon", "F35 - Lightning II", "Top Secret"};
  private String type;

  public Aircraft(String type, int maxAmmo, int baseDamage) {
    this.type = type;
    this.ammoLevel = 0;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
  }

  public void fight(Carrier carrier) {
    damage = ammoLevel * baseDamage;
    ammoLevel = 0;
    carrier.carrierHP -= damage;
  }


  public void refill(int refill) {
    if (refill >= maxAmmo) {
      ammoLevel = maxAmmo;
    } else {
      ammoLevel = refill;
    }
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type: " + getType() + ", Ammo: " + ammoLevel + ", Base Damage: " + baseDamage + ", Total Damage: " + (ammoLevel * baseDamage);
  }

  public boolean isPriority() {
    return getType().equals("F35 - Lightning II");
  }

  public int getDamage() {
    return damage;
  }
}
