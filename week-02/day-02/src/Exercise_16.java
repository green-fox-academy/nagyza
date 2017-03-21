import java.util.Scanner;

/**
 * Created by nagyza on 2017.03.21..
 */
public class Exercise_16 {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The seconf represents the number of pigs the farmer has
    // It should print how many legs all the animals have
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("How many chicken you have? ");
    int numberOfChicken = scanner1.nextInt();
    System.out.println("How many pigs you have? ");
    int numberOfPigs = scanner2.nextInt();
    System.out.println("Your livestocks have " + (numberOfChicken * 2 + numberOfPigs * 4) + " legs." );
  }
}
