import aircraftcarrier.Aircrafts;
import aircraftcarrier.Carrier;

/**
 * Created by nagyza on 2017.04.04..
 */
public class AircraftCarrierMain {
  public static void main(String[] args) {
    Aircrafts aircraft1 = new Aircrafts("F16");
    Aircrafts aircraft2 = new Aircrafts("F35");
    System.out.println(aircraft1.getStatus());
    System.out.println(aircraft2.getStatus());
    aircraft1.refill();
    aircraft2.refill();
    System.out.println(aircraft1.getType());
    System.out.println(aircraft2.getType());
    System.out.println(aircraft1.getStatus());
    System.out.println(aircraft2.getStatus());
    Carrier carrier1 = new Carrier();
    Carrier carrier2 = new Carrier(3000, 15000);
    carrier1.addAircraft("F16");
    carrier1.addAircraft("F35");
    carrier1.addAircraft("F16");
    carrier2.addAircraft("F16");
    carrier2.addAircraft("F35");
    carrier2.addAircraft("F16");
    carrier2.addAircraft("F16");
    carrier2.addAircraft("F35");
    carrier2.addAircraft("F16");
    System.out.println(carrier1.getStatus());
    System.out.println(carrier2.getStatus());
    carrier1.fill();
    carrier2.fill();
    carrier2.fight(carrier1);
    carrier1.fight(carrier2);
    carrier2.fill();
    carrier1.fill();
    System.out.println(carrier1.getStatus());
    System.out.println(carrier2.getStatus());
    carrier2.fight(carrier1);
    carrier2.fill();
    carrier2.fight(carrier1);
    System.out.println(carrier1.getStatus());
    System.out.println(carrier2.getStatus());
  }
}
