/**
 * Created by nagyza on 2017.03.30..
 */
public class String3 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".

    System.out.println(putAsterics("valami mas"));
  }

  public static String putAsterics(String text) {
    int index;
    if (text.substring(text.length() - 2, text.length() - 1).equals("*")) {
      return text;
    } else {
      if (text.lastIndexOf("*") + 2 == text.length()) {
        return text;
      } else {
        index = text.lastIndexOf("*");
        return putAsterics(text.substring(0, index + 2) + "*" + text.substring(index + 2, text.length()));
      }
    }
  }
}
