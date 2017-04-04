package aircraftcarrier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by nagyza on 2017.04.04..
 */

public class Carrier {
  private ArrayList<Aircrafts> storedAircrafts;
  private int ammoStorage;
  private int health;
  private int totalDamage;
  private int fightDamage;

  public Carrier() {
    this.storedAircrafts = new ArrayList<>();
    this.ammoStorage = 2500;
    this.health = 3000;
    this.totalDamage = 0;
  }

  public Carrier(int ammoStorage, int health) {
    this.storedAircrafts = new ArrayList<>();
    this.ammoStorage = ammoStorage;
    this.health = health;
    this.totalDamage = 0;
  }

  public void addAircraft(String type) {
    this.storedAircrafts.add(new Aircrafts(type));
  }

  public void fill() {
    Collections.sort(storedAircrafts, new Comparator<Aircrafts>() {
      @Override
      public int compare(Aircrafts o1, Aircrafts o2) {
        return Integer.valueOf(o2.getTypeNumber()).compareTo(o1.getTypeNumber());
      }
    });

    for (Aircrafts aircraft : storedAircrafts) {
      if (ammoStorage == 0) {
        System.out.println("There is no more ammo int the Ammo Storage");
        break;
      } else if (aircraft.getType().equals("F35") && ammoStorage >= 12) {
        aircraft.refill(12);
      } else if (aircraft.getType().equals("F35")) {
        aircraft.refill(ammoStorage);
      } else if (aircraft.getType().equals("F16") && ammoStorage >= 8) {
        aircraft.refill(8);
      } else {
        aircraft.refill(ammoStorage);
      }
    }
  }

  public void fight(Carrier carrier) {
    for (Aircrafts aircraft : storedAircrafts) {
      if (aircraft.getType().equals("F35")) {
        this.totalDamage = aircraft.fight();
        this.fightDamage = aircraft.fight();
      } else {
        this.totalDamage = aircraft.fight();
        this.fightDamage = aircraft.fight();
      }
    }
    carrier.setHealth(fightDamage);
    this.fightDamage = 0;
  }

  public void setHealth(int damage) {
    this.health -= damage;
  }

  public String getStatus() {
    String status = "";
    status = status + "Aircraft count: " + storedAircrafts.size() + ", Ammo Storage: " + this.ammoStorage + ", Total damage: \n";
    for (Aircrafts aircraft : storedAircrafts) {
      status = status + aircraft.getStatus() + "\n";
    }
    return status;
  }
}
