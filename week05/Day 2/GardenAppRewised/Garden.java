package GardenAppRewised;
import java.util.ArrayList;
import java.util.List;

class Garden {

  private List<Plants> megaGarden;

  Garden() {
    this.megaGarden = new ArrayList<>();
  }

  void addPlants(Plants plants) {
    megaGarden.add(plants);
  }

  void wateringAll(int waterAmount) {
    double waterForEach = waterAmount / megaGarden.size();
    for (Plants plants : megaGarden) {
      if (plants.getWaterLevel() < plants.getNeedWatering()) {
        plants.watering(waterForEach);
      }
      plants.status();
    }
  }
}
