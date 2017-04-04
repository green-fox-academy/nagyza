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
  private String carrierClass;

  public Carrier() {
    this.storedAircrafts = new ArrayList<>();
    this.ammoStorage = 2500;
    this.health = 10000;
    this.totalDamage = 0;
    this.carrierClass = "Essex";
    this.fightDamage = 0;
  }

  public Carrier(int ammoStorage, int health) {
    this.storedAircrafts = new ArrayList<>();
    this.ammoStorage = ammoStorage;
    this.health = health;
    this.totalDamage = 0;
    this.fightDamage = 0;
    if (this.ammoStorage > 2500) {
      this.carrierClass = "Nimitz";
    } else {
      this.carrierClass = "Essex";
    }
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
        aircraft.autoRefill(12);
        this.ammoStorage -= 12;
      } else if (aircraft.getType().equals("F35")) {
        aircraft.autoRefill(ammoStorage);
        this.ammoStorage = 0;
      } else if (aircraft.getType().equals("F16") && ammoStorage >= 8) {
        aircraft.autoRefill(8);
        this.ammoStorage -= 8;
      } else {
        aircraft.autoRefill(ammoStorage);
        this.ammoStorage = 0;
      }
    }
  }

  public void fight(Carrier attackedCarrier) {
    for (Aircrafts aircraft : storedAircrafts) {
      if (aircraft.getType().equals("F35")) {
        this.fightDamage += aircraft.fight();
        this.totalDamage += this.fightDamage;
      } else {
        this.fightDamage += aircraft.fight();
        this.totalDamage += this.fightDamage;
      }
    }
    attackedCarrier.setHealth(this.fightDamage);
  }

  public void setHealth(int fightDamage) {
    this.health -= fightDamage;
  }

  public String getStatus() {
    String status = "";
    status = status + "Carrier Class: " + this.carrierClass + ", Aircraft count: " + storedAircrafts.size() + ", Ammo Storage: " + this.ammoStorage + ", Total damage: " +
            this.totalDamage + ", Health: " + this.health + "\n";
    for (Aircrafts aircraft : storedAircrafts) {
      status = status + aircraft.getStatus() + "\n";
    }
    return status;
  }
}
