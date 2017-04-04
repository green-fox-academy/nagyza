package greenfox;

import java.util.*;

/**
 * Created by nagyza on 2017.04.04..
 */
public class LagopusClass {
  private String className;
  private List<Student> students;
  private List<Mentor> mentors;

  public LagopusClass(String className) {
    this.className = className;
    this.mentors = new ArrayList<>();
    this.students = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("Lagopus " + className + " class has " + students.size() + " students and " + mentors.size() +
            " mentors.");
  }
}
