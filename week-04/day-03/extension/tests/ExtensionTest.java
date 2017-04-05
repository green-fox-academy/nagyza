import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_3and3is6() {
    assertEquals(6, extension.add(3, 3));
  }

  @Test
  void testAdd_3and4is7() {
    assertEquals(7, extension.add(3, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(7, extension.maxOfThree(7, 5, 3));
  }

  @Test
  void testMaxOfThree_second() {
    assertEquals(11, extension.maxOfThree(7, 11, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(9, extension.maxOfThree(3, 4, 9));
  }

  @Test
  void testMedian_four() {
    assertEquals(7, extension.median(Arrays.asList(7,9,3,7)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(3,2,1,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_U() {
    assertTrue(extension.isVowel('U'));
  }

  @Test
  void testIsVowel_c() {
    assertFalse(extension.isVowel('f'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_megetteEndVowel() {
    assertEquals("mevegevetteve", extension.translate("megette"));
  }

  @Test
  void testTranslate_elveszitBeginVowel() {
    assertEquals("evelveveszivit", extension.translate("elveszit"));
  }

  @Test
  void testTranslate_etteBeginAndEndVowel() {
    assertEquals("evetteve", extension.translate("ette"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}
