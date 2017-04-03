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

  @Override
  public String toString() {
    return  "name='" + name + '\'' +
            ", knowledge=" + knowledge +
            '}';
  }

  public String question(Teacher teacher, String questionToAsk) {
    return teacher.answer(questionToAsk);
  }

  public static void main(String[] args) {
    Teacher teacher1 = new Teacher("Marika");
    Student student1 = new Student("Marci");
    System.out.println(student1.question(teacher1, "Is that method works well?"));
    teacher1.teach(student1);
  }
}
