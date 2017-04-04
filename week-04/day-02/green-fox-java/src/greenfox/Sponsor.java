package greenfox;

/**
 * Created by nagyza on 2017.04.04..
 */
public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company, int hiredStudents) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = hiredStudents;
  }

  public void hire() {
    this.hiredStudents++;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " years old " + this.getGender() +
            " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }
}
