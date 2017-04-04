package greenfox;

/**
 * Created by nagyza on 2017.04.04..
 */
public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization, int skippedDays) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = skippedDays;
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + " a " + this.getAge() + " year old " + this.getAge() +
            " from " + previousOrganization + "who skipped" + skippedDays + "days from the course already.");
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

}
