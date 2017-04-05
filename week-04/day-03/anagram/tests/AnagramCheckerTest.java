import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramCheckerTest {
  @Test
  public void isAnagramEqualStrings() throws Exception {
    AnagramChecker trial = new AnagramChecker();
    assertTrue(trial.isAnagram("valami", "valami"));
  }
}