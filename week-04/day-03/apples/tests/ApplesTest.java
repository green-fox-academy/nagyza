import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
  @Test
  public void getApple() throws Exception {
    Apples apples1 = new Apples();
    assertEquals("apple", apples1.getApple());
  }
}