/**
 * Created by nagyza on 2017.04.03..
 */
public class Teacher {

  String name;
  int satisfacton;

  public Teacher() {
    this.satisfacton = 50;
  }

  public Teacher(String name) {
    this.name = name;
    this.satisfacton = 50;
  }

  public String answer(String question) {
    if (question.length() > 0) {
      satisfacton++;
      return "Yes. Well done!";
    } else {
      satisfacton--;
      if (satisfacton == 0) {
        return "Director should kick you out!";
      }
      return "It's a stupid question.";
    }
  }

  public void teach(Student student) {
    student.learn();
    satisfacton++;
  }
}
