import java.util.Scanner;

/**
 * Created by nagyza on 2017.03.22..
 */
public class Exercise_30 {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for (int i = 0; i < number; i++) {
      if (i == 0) {
        for (int j = 0; j < number; j++) {
          if (j < (number - 1)) {
            System.out.print("%");
          } else {
            System.out.println("%");
          }
        }
      } else if (i > 0 && i < number - 1) {
        for (int k = 0; k < number; k++) {
          if (k == 0) {
            System.out.print("%");
          } else if (k > 0 && k < number -1) {
            System.out.print(" ");
          } else {
            System.out.println("%");
          }
        }
      } else {
        for (int l = 0; l < number; l++) {
          System.out.print("%");
        }
      }
    }
  }
}
