import java.util.Random;
import java.util.Scanner;

/**
 * Created by nagyza on 2017.03.22..
 */
public class Exercise_33 {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8
    int randomNumber = (int) (Math.random() * 10) + 1;
    System.out.println(randomNumber);
    Scanner scanner = new Scanner(System.in);
    System.out.println("I generated a number. Try to guess it!");
    int guessNumber = scanner.nextInt();
    while (guessNumber != randomNumber) {
      if (guessNumber < randomNumber) {
        System.out.println("The stored number is higher. Try again!");
        guessNumber = scanner.nextInt();
      } else {
        System.out.println("The stored number is lower. Try again!");
        guessNumber = scanner.nextInt();
      }
    }
    System.out.println("You found the number: " + randomNumber);
  }
}
