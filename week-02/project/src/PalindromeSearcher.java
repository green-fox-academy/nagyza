import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nagyza on 2017.03.23..
 * Palindrome searcher as a weekly project in the second week
 * in the Greenfox Academy Junior Software Developer training
 */
public class PalindromeSearcher {
  public static void main(String[] args) {
    ArrayList<String> foundPalindromes = new ArrayList<>(); // todo probably indicate <String>
    String stringToExamine = "dog goat dad duck doodle never";
    for (int i = 3; i < stringToExamine.length() - i; i++) {


    }

  }
  private static ArrayList<String> examineString(String stringToEx, int palLen) {
    String palTry = "";
    for (int i = 0; i < stringToEx.length() - palLen; i++) { // todo lehet hogy a kozepen jatszani kell
      palTry = stringToEx.substring(i, (i + palLen);

    }
  }

  private static boolean palTrial(String palTry) {
    for (int j = 0; j < (palTry.length()/2); j++) {
      System.out.println("j " + j + " len/2 " + (palTry.length()/2));
      int charNum = j;
      if (palTry.charAt(charNum) != palTry.charAt((palTry.length() - 1) - charNum)) {
        System.out.println((palTry.charAt(charNum)) + " " + (palTry.charAt((palTry.length() - 1) - charNum)));
        return false;
      }
    }
    return true;
  }
}