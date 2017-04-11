import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
  @Test
  public void getDieRollTest() throws Exception {
    Character character = new Character();
    for (int i = 0; i < 100; i++) {
      assertTrue((character.getDieRoll() > 0) && (character.getDieRoll() < 7));
    }
  }
}