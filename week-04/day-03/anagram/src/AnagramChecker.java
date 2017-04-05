import java.util.Arrays;

public class AnagramChecker {

  private String word1;
  private String word2;

  public AnagramChecker() {
  }

  public AnagramChecker(String word1, String word2) {
    this.word1 = word1;
    this.word2 = word2;
  }

  public boolean isAnagram (String word1, String word2) {
    if (word1.length() == 0 || word2.length() == 0) {
      System.out.println("It doesn't make sense to examine empty string!");
      return false;
    } else if (sortChars(word1).equals(sortChars(word2))) {
      return true;
    } else {
      return false;
    }
  }

  private String sortChars(String word) {
    char[] chars = word.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}