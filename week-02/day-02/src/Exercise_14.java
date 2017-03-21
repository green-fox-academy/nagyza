import java.util.Scanner;

/**
 * Created by nagyza on 2017.03.21..
 */
public class Exercise_14 {
  public static void main(String[] args) {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "!");
  }
}
