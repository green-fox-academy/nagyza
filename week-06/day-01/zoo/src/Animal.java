
public abstract class Animal {
  String name;
  int age;
  String gender;
  String continentOfOrigin;

  public Animal(String name) {
    this.name = name;
  }

  abstract void greet();

  abstract String wantChild();

  abstract String getName();

}
