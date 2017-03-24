import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nagyza on 2017.03.23..
 * Palindrome searcher as a weekly project in the second week
 * in the Greenfox Academy Junior Software Developer training
 */
public class PalindromeSearcher {
  public static void main(String[] args) {
    ArrayList<String> foundPalindromes = new ArrayList<>();
    String stringToExamine = "dog goat dad duck doodle never";
    for (int i = stringToExamine.length(); i > 2; i--) { // todo egybetuseket kizarni
      for (int  j = 0; j < i + 1; j++) {
        if (palTrial(stringToExamine.substring(j, i))) {
          System.out.println("j " + j + "i" + i + "bent " + stringToExamine.substring(j, i));
          foundPalindromes.add(stringToExamine.substring(j, i));
        }
      }
    }
    System.out.println(foundPalindromes);
  }

  private static boolean palTrial(String palTry) {
    for (int j = 0; j < (palTry.length()/2); j++) {
      int charNum = j;
      if (palTry.charAt(charNum) != palTry.charAt((palTry.length() - 1) - charNum)) {
        return false;
      }
    }
    return true;
  }
}