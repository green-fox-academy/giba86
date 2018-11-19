package PetrolStation;

public class Station {
    int gasAmount;
    int refueled;

    public Station(){
        this.gasAmount = 1000;
    }

    public void refill(Car x){
        this.refueled = x.capacity - x.fuelLevel;
        this.gasAmount -= refueled;
        x.fuelLevel += refueled;
    }
}
