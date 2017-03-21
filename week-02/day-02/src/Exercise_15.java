import java.util.Scanner;

/**
 * Created by nagyza on 2017.03.21..
 */
public class Exercise_15 {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    //1 km is 0.621371192237 miles
    Scanner scanner = new Scanner(System.in);
    System.out.println("Add meg a tavolsagot km-ben! ");
    double km = scanner.nextDouble();
    double miles = km * 0.621371192237;
    System.out.println(km + "km = " + miles + " merfold.");
  }
}
