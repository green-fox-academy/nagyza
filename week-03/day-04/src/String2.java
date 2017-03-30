/**
 * Created by nagyza on 2017.03.30..
 */
public class String2 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.

    System.out.println(removeSubstring("xvxalxxaxmix"));
  }

  public static String removeSubstring(String text) {
    int index;
    if (!text.contains("x")) {
      return text;
    } else {
      index = text.indexOf("x");
      return removeSubstring(text.substring(0, index) + text.substring(index + 1, text.length()));
    }
  }
}
