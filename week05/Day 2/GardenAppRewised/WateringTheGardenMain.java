package GardenAppRewised;

public class WateringTheGardenMain {
  public static void main(String[] args) {

    Garden newGarden = new Garden();

    newGarden.addPlants(new Flower("yellow"));
    newGarden.addPlants(new Flower("blue"));
    newGarden.addPlants(new Tree("purple"));
    newGarden.addPlants(new Tree("orange"));

    System.out.println("\n");
    System.out.println("\nwatering with 40");
    newGarden.wateringAll(40);
    System.out.println("\nwatering with 70");
    newGarden.wateringAll(70);
  }
}
