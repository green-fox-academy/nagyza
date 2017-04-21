import java.text.SimpleDateFormat;
import java.util.Date;

public class Tasks {
  private boolean isDone;
  private String text;
  private String date;
  private int priority;

  Tasks(String text) {
    this.isDone = false;
    this.text = text;
    this.date = taskSetDate();
    this.priority = 2;
  }

  Tasks(String text, int priority) {
    this.isDone = false;
    this.text = text;
    this.date = taskSetDate();
    this.priority = priority;
  }

  Tasks(boolean isDone, String text, String date, int priority) {
    this.isDone = isDone;
    this.text = text;
    this.date = date;
    this.priority = priority;
  }

  int getPriority() {
    return priority;
  }

  void changeDone() {
    this.isDone = !this.isDone;
  }

  void changeToBeDone() {
    this.isDone = true;
  }

  void changeToBeUndone() {
    this.isDone = false;
  }

  private String taskSetDate() {
    Date myDate = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
    return sdf.format(myDate);
  }

  @Override
  public String toString() {
    String isDoneStr = isDone ? "x" : " ";
    return "[" + isDoneStr + "] " + " Priority: " + priority + "  " + date + " - " + text;
  }

  String toFile() {
    String isDoneStr = isDone ? "x" : " ";
    return isDoneStr + ";" + text + ";" + date + ";" + priority;
  }
}