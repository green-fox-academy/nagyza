package aircraftcarrier;

/**
 * Created by nagyza on 2017.04.04..
 */
public class Aircrafts {
  private int ammo;
  private int maxAmmo;
  private int baseDamage;
  private String type;
  private int typeNumber;
  private int allDamage;

  public Aircrafts(String type) {
    this.type = type;
    this.typeNumber = Integer.parseInt(type.substring(1, 3));
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

  public void refill(int neededAmmo) {
    this.ammo += neededAmmo;
  }

  public int fight() {
    this.ammo = 0;
    return ammo * baseDamage;
  }

  public int getAmmo() {
    return ammo;
  }

  public String getType() {
    return type;
  }

  public int getTypeNumber() {
    return typeNumber;
  }

  public String getStatus() {
    return "Type: " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + "All Damage: " + (ammo * baseDamage);
  }

}
