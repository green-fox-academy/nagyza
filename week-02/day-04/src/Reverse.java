/**
 * Created by nagyza on 2017.03.23..
 */
public class Reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a function that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    String temporaryString = "";
    int countBack = reversed.length();
    for (int i = reversed.length() - 1; i > 0; i--) {
      StringBuilder makeString = new StringBuilder();
      temporaryString = temporaryString.concat(Character.toString(reversed.charAt(i)));
    }
    reversed = temporaryString;
    System.out.println(reversed);
  }
}
