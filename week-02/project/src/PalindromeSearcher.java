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
    String stringToExamine = "abaindulagorogaludniaba";
    for (int i = stringToExamine.length(); i > 2; i--) {
      for (int j = 0; j < i + 1; j++) {
        if (palTrial(stringToExamine.substring(j, i))) {
          if (stringToExamine.substring(j, i).length() > 2) {
            foundPalindromes.add(stringToExamine.substring(j, i));
          }
        } else {
        }
      }
    }
    System.out.println(removeDuplicates(foundPalindromes));
  }

  public static ArrayList<String> removeDuplicates(ArrayList<String> arraySimplify) {
    ArrayList<Integer> indexRem = new ArrayList<>();
    for (String palind : arraySimplify) {
      indexRem = indexCollector(arraySimplify, palind);
    }
    for (Integer toDelete : indexRem) {
      arraySimplify.remove((int)toDelete);
    }
    return arraySimplify;
  }

  private static ArrayList<Integer> indexCollector(ArrayList<String> arrayCount, String palind) {
    ArrayList<Integer> foundIndexes = new ArrayList<>();
    int counter = -1;
    for (String palindTest : arrayCount) {
      counter++;
      if (palindTest.equalsIgnoreCase(palind)) {
        foundIndexes.add(counter);
      }
    }
    foundIndexes.remove(0);
    return foundIndexes;
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