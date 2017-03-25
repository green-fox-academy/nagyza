/**
 * Created by nagyza on 2017.03.23..
 */
public class TakesLongerStringBuilder {
  public static void main(String[] args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    System.out.println(stringBuilder(quote, "It", "always takes longer than"));
  }

  public static StringBuilder stringBuilder(String quote, String beforeString, String  stringToInsert) {
    StringBuilder quota = new StringBuilder(quote);
    int beforeIndex = quote.indexOf(beforeString) + beforeString.length();
    quota.insert(beforeIndex, ((" " + stringToInsert)));
    return quota;
  }
}