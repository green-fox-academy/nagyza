/**
 * Created by nagyza on 2017.03.21..
 */
public class Exercise_11 {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int wholeDaySeconds = 60 * 60 * 24;
    int passedSeconds = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;
    System.out.println(wholeDaySeconds);
    System.out.println(passedSeconds);
  }
}
