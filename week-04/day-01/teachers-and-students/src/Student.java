/**
 * Created by nagyza on 2017.04.03..
 */
public class Student {
  String name;
  int knowledge;

  public Student(String name) {
    this.name = name;
    this.knowledge = 0;
  }

  public void learn() {
    this.knowledge++;
  }

  public String question(Teacher teacher, String questionToAsk) {
    return teacher.answer(questionToAsk);
  }
}
