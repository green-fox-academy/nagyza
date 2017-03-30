/**
 * Created by nagyza on 2017.03.30..
 */
public class String1 {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    System.out.println(changeChars("valxax kjhkasx"));

  }

  public static String changeChars(String text) {
    int index = 0;
    if (!text.contains("x")) {
      return text;
    } else {
      index = text.indexOf("x");
      return changeChars(text.substring(0, index) + "y" + text.substring(index + 1, text.length()));
    }
  }


}
