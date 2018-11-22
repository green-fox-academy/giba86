import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {

    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(4, 5, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,5,4,2,3)));
  }

  @Test
  void testIsVowel_a() {
    assertFalse(extension.isVowel('b'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('U'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("kivivivi", extension.translate("kivi"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavaavagovopuvus", extension.translate("laagopus"));
  }
}