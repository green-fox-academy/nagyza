/**
 * Created by nagyza on 2017.04.03..
 */

/* Create Animal class
 * Every animal has a hunger value, which is a whole number
 * Every animal has a thirst value, which is a whole number
 * when creating a new animal object these values are created with the default 50 value
 * Every animal can eat() which decreases their hunger by one
 * Every animal can drink() which decreases their thirst by one
 * Every animal can play() which increases both by one
 */

public class Animal {

  int hunger;
  int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    this.hunger -= 1;
  }

  public void drink() {
    this.thirst -= 1;
  }

  public void play() {
    this.thirst += 1;
    this.hunger += 1;
  }
}
