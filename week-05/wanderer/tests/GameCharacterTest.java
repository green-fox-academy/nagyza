import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameCharacterTest {
  @Test
  public void getDieRollTest() throws Exception {
    Hero character = new Hero();
    for (int i = 0; i < 100; i++) {
      assertTrue((character.getDieRoll() > 0) && (character.getDieRoll() < 7));
    }
  }
}