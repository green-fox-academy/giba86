package PetrolStation;

public class PetrolStation {
    public static void main(String[] args) {

        Station ripUoff = new Station();
        Car verda = new Car();

        System.out.println("verda's fuel level: " + verda.fuelLevel);
        System.out.println("Amount of gas at ripUoff petrol station: " + ripUoff.gasAmount);
        ripUoff.refill(verda);
        System.out.println("verda's fuel level after refill: " + verda.fuelLevel + " after you refill " + ripUoff.refueled);
        System.out.println("Amount of gas at ripUoff after refill: " + ripUoff.gasAmount);
    }
}
