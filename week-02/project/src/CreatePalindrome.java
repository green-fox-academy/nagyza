import java.util.Scanner;

/**
 * Created by nagyza on 2017.03.24..
 */
public class CreatePalindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type a text! I'll build a palindrome from that. ");
    String typedString = scanner.nextLine();
    String typedBack = "";
    for (int i = typedString.length() - 1; i > -1; i--) {
      Character current = typedString.charAt(i);
      typedBack = typedBack.concat(current.toString());
    }
    System.out.println("The palindrome I made is: " +(typedString + typedBack));
  }
}
