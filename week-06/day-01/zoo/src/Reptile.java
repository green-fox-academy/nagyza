
public class Reptile extends Animal {

  public Reptile(String name) {
    super(name);
  }

  @Override
  public void greet() {
    System.out.println("Hello, I'm a reptile!");
  }

  @Override
  public String wantChild() {
    return "want a child from an egg!";
  }

  @Override
  public String getName() {
    return this.name;
  }
}
