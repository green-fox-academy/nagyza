
public class Bird extends Animal {
  public Bird(String name) {
    super(name);
  }

  @Override
  public void greet() {
    System.out.println("Hello, I'm a bird!");
  }

  @Override
  String wantChild() {
    return "want a child from an egg!";
  }

  @Override
  String getName() {
    return this.name;
  }
}
