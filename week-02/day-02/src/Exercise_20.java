import java.util.Scanner;

/**
 * Created by nagyza on 2017.03.22..
 */
public class Exercise_20 {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Write the first number, please!");
    int number1 = scanner1.nextInt();
    System.out.println("Write the second number, please!");
    int number2 = scanner2.nextInt();
    if (number1 > number2) {
      System.out.println("The bigger is the first: " + number1);
    } else if (number1 < number2) {
      System.out.println("The bigger is the second: " + number2);
    } else {
      System.out.println("It's equal");
    }
  }
}

