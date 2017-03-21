/**
 * Created by nagyza on 2017.03.21..
 */
public class Exercise_06 {
  public static void main(String[] args) {
    int dailyCodingHours = 6;
    int numberOfWeeks = 17;
    int totalHours = dailyCodingHours * 5 * numberOfWeeks;
    System.out.println("An attendee will write codes a total of " + totalHours + " hours.");
    int weeklyHours = 52;
    double percentageOfCoding;
    double allAvailableHours = weeklyHours * numberOfWeeks;
    percentageOfCoding = (double) totalHours / (allAvailableHours / 100.);
    System.out.println("An attendee spend " + percentageOfCoding + " percent of his/her time with coding.");
  }
}
