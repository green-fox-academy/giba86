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
    for (int i = 0; i < megaGarden.size(); i++) {
      if (megaGarden.get(i).getWaterLevel() < megaGarden.get(i).getNeedWatering()) {
          megaGarden.get(i).watering(waterForEach);
      }
      megaGarden.get(i).status();
    }
  }
}
