package PetrolStation;

public class Car {

    int capacity;
    int fuelLevel;

    public Car(){
        this.capacity = 100;
        this.fuelLevel = (int) (Math.random() * capacity + 5);
    }
}
