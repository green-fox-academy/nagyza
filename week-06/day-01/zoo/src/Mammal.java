
public class Mammal extends Animal{

  public Mammal(String name) {
    super(name);
  }

  @Override
  public void greet() {
    System.out.println("Hello, I'm a mammal!");
  }

  @Override
  public String wantChild() {
    return "want a child from my uterus!";
  }

  @Override
  public String getName() {
    return this.name;
  }
}
