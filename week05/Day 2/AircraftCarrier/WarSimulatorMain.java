package AircraftCarrier;

public class WarSimulatorMain {
  public static void main(String[] args) {

    Carrier ourCarrier = new Carrier(70);
    Carrier oppoentCar = new Carrier(60);

    ourCarrier.addAircraft(new F16());
    ourCarrier.addAircraft(new F35());
    ourCarrier.addAircraft(new F35());
    ourCarrier.addAircraft(new F16());
    ourCarrier.addAircraft(new F16());

    oppoentCar.addAircraft(new F35());
    oppoentCar.addAircraft(new F35());
    oppoentCar.addAircraft(new F16());
    oppoentCar.addAircraft(new F35());
    oppoentCar.addAircraft(new F35());
    oppoentCar.addAircraft(new F16());


    ourCarrier.fill();
    oppoentCar.fill();

    ourCarrier.getTotalDamage();
    oppoentCar.getTotalDamage();


    System.out.println(ourCarrier.getStatus());
    System.out.println(oppoentCar.getStatus());

    ourCarrier.fight(oppoentCar);

  }
}
