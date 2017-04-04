/**
 * Created by nagyza on 2017.04.04..
 */
public class Person {

  protected String name;
  protected int age;
  protected String gender;
  private final String goal = "My goal is: Live for the moment!";

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  protected void introduce() {
    System.out.println("Hi, I'm " + this.name + " a " + this.age + " year old " + gender + ".");
  }

  public String getGoal() {
    return goal;
  }
}