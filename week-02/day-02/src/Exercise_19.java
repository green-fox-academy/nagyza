import java.util.Scanner;

/**
 * Created by nagyza on 2017.03.22..
 */
public class Exercise_19 {
  public static void main(String[] args) {
    // Write a program that reads a number form the standard input,
    // If the number is zero or smaller it should print: Not enough
    // If the number is one it should print: One
    // If the number is two it should print: Two
    // If the number is more than two it should print: A lot
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write me a number, please!");
    int number = scanner.nextInt();
    if (number <= 0) {
      System.out.println("Not enough!");
    } else if (number == 1) {
      System.out.println("One");
    } else if (number == 2) {
      System.out.println("Two");
    } else {
      System.out.println("A lot");
    }
  }

}
