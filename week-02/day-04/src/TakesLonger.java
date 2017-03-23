/**
 * Created by nagyza on 2017.03.23..
 */
public class TakesLonger {
  public static void main(String[] args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    System.out.println(stringBuilder(quote, "It", "you", "always takes longer than"));
  }

  public static String stringBuilder(String quote, String beforeString, String afterString, String  stringToInsert) {
    int beforeIndex = quote.indexOf(beforeString) + beforeString.length();
    int afterIndex = quote.indexOf(afterString);
    String firstPart = (quote.substring(0, beforeIndex)).trim() + " ";
    String lastPart = " " + (quote.substring(afterIndex)).trim();
    String correctedString = (firstPart + stringToInsert.trim() + lastPart);
    return correctedString;
  }
}
