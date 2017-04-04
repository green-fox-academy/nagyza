package greenfox;

/**
 * Created by nagyza on 2017.04.04..
 */
public class Mentor extends Person {
  private String level;

  public Mentor() {
    super();
    this.level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " years old " + this.getGender() +
            level + " mentor.");
  }
}
