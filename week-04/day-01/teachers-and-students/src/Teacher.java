/**
 * Created by nagyza on 2017.04.03..
 */
public class Teacher {

  public String answer(String question) {
    if (question.length() > 0) {
      return "Yes. Well done!";
    } else {
      return "It's a stupid question.";
    }
  }

  public void teach(Student student) {
    student.learn();
  }

}
