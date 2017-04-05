import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramCheckerTest {
  @Test
  public void isAnagramEqualStrings() throws Exception {
    AnagramChecker trial = new AnagramChecker();
    String word = "valami";
    assertTrue(trial.isAnagram(word, word));
  }

  @Test
  public void isAnagramAnagramStrings() throws Exception {
    AnagramChecker trial = new AnagramChecker();
    String word1 = "valami";
    String word2 = "vamali";
    assertTrue(trial.isAnagram(word1, word2));
  }

  @Test
  public void isAnagramOneEmptyString() throws Exception {
    AnagramChecker trial = new AnagramChecker();
    String word1 = "valami";
    String word2 = "";
    assertFalse(trial.isAnagram(word1, word2));
  }

}