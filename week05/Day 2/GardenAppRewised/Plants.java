package GardenAppRewised;

public abstract class Plants {
  private String kindOfPlants;
  private String colorOfPlant;
  private int waterLevel;
  private int needWatering;
  private double absorbingWater;

  Plants(String kindOfPlants, String colorOfPlant, int needWatering, double absorbingWater) {
    this.kindOfPlants = kindOfPlants;
    this.colorOfPlant = colorOfPlant;
    this.waterLevel = 0;
    this.needWatering = needWatering;
    this.absorbingWater = absorbingWater;
  }

  void status() {
    if(kindOfPlants.equals("tree") && waterLevel < needWatering) {
      System.out.println("This " + colorOfPlant + " " +kindOfPlants + " needs water.");
    } else if (kindOfPlants.equals("flower") && waterLevel < needWatering) {
      System.out.println("This " + colorOfPlant + " " +kindOfPlants + " needs water.");
    } else if (kindOfPlants.equals("tree") && waterLevel >= needWatering) {
      System.out.println("This " + colorOfPlant + " " + kindOfPlants + " doesn't need water.");
    } else if (kindOfPlants.equals("flower") && waterLevel >= needWatering) {
      System.out.println("This " + colorOfPlant + " " + kindOfPlants + " doesn't need water.");
    }
  }
  void watering(double wateringAmount) {
      waterLevel += wateringAmount * absorbingWater;
  }

  public String getKindOfPlants() {
    return kindOfPlants;
  }

  int getWaterLevel() {
    return waterLevel;
  }

  int getNeedWatering() {
    return needWatering;
  }
}
