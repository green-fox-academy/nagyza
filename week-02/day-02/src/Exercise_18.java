import java.util.Scanner;

/**
 * Created by nagyza on 2017.03.22..
 */
public class Exercise_18 {
  public static void main(String[] args) {
    // Write a program that reads a number form the standard input,
    // Than prints "Odd" if the number is odd, or "Even" it it is even.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write me an integer, please! ");
    int number = scanner.nextInt();
    if (number % 2 == 0) {
      System.out.println("It's an even number.");
    } else {
      System.out.println("It's an odd number.");
    }

  }
}
