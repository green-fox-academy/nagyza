import com.sun.org.apache.xpath.internal.SourceTree;

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

  String name;
  int hunger;
  int thirst;

  public Animal(String name) {
    this.name = name;
    this.hunger = 50;
    this.thirst = 50;
  }

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

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }

  public void play() {
    this.thirst += 1;
    this.hunger += 1;
  }

  @Override
  public String toString() {
    return  "name='" + name + '\'' +
            ", hunger=" + hunger +
            ", thirst=" + thirst +
            '}';
  }

  public static void main(String[] args) {
    Animal animal1 = new Animal("Bestia");
    Animal animal2 = new Animal("Vadállat");

    animal1.eat();
    System.out.println(animal1.getHunger());
    animal2.play();
    System.out.println(animal1);
    System.out.println(animal2);
  }

}
