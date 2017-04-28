import java.text.SimpleDateFormat;
import java.util.Date;

public class Tasks {
  private boolean isDone;
  private String text;
  private String dateStart;
  private String dateEnd;
  private int priority;

  Tasks(String text) {
    this.isDone = false;
    this.text = text;
    this.dateStart = taskSetDate();
    this.dateEnd = "";
    this.priority = 2;
  }

  Tasks(String text, int priority) {
    this.isDone = false;
    this.text = text;
    this.dateStart = taskSetDate();
    this.dateEnd = "";
    this.priority = priority;
  }

  Tasks(boolean isDone, String text, String dateStart, String dateEnd, int priority) {
    this.isDone = isDone;
    this.text = text;
    this.dateStart = dateStart;
    this.dateEnd = dateEnd;
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

  private String getIsDoneString() {
    return isDone ? "x" : " ";
  }

  @Override
  public String toString() {
    return "[" + getIsDoneString() + "] " + " Priority: " + priority + "  " + dateStart + " - " + dateEnd + " - " + text;
  }

  String toFile() {
    return getIsDoneString() + ";" + text + ";" + dateStart + ";" + dateEnd + ";" + priority;
  }
}