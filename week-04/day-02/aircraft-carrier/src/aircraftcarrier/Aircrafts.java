package aircraftcarrier;

/**
 * Created by nagyza on 2017.04.04..
 */
public class Aircrafts {
  private int ammo;
  private int maxAmmo;
  private int baseDamage;
  private String type;
  private int allDamage;

  public Aircrafts(String type) {
    this.type = type;
    this.ammo = 0;
    if (type.equals("F16")) {
      this.maxAmmo = 8;
      this.baseDamage = 30;
    } else {
      this.maxAmmo = 12;
      this.baseDamage = 50;
    }
    this.allDamage = this.maxAmmo * this.baseDamage; //todo this is unnecessary maybe
  }

  public void refill() {
    this.ammo += this.neededAmmo(); //todo needed amount of ammo will not always available
  }

  public int fight() {
    this.ammo = 0;
    return ammo * baseDamage;
  }

  public int neededAmmo() {
    return maxAmmo - ammo;
  }

  public int getAmmo() {
    return ammo;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type: " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + "All Damage: " + (ammo * baseDamage);
  }

}
