import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumbersTest {

  @Test
  public void testFor1() {
    assertEquals("I", RomanNumbers.convertRoman(1));
  }

  @Test
  public void testFor2() {
    assertEquals("II",RomanNumbers.convertRoman(2));
  }

  @Test
  public void testFor3() {
    assertEquals("III",RomanNumbers.convertRoman(3));
  }

  @Test
  public void testFor5() {
    assertEquals("V",RomanNumbers.convertRoman(5));
  }

  @Test
  public void testFor6() {
    assertEquals("VI",RomanNumbers.convertRoman(6));
  }

  @Test
  public void testFor7() {
    assertEquals("VII",RomanNumbers.convertRoman(7));
  }

  @Test
  public void testFor8() {
    assertEquals("VIII",RomanNumbers.convertRoman(8));
  }

  @Test
  public void testFor9() {
    assertEquals("IX",RomanNumbers.convertRoman(9));
  }

  @Test
  public void testFor10() {
    assertEquals("X",RomanNumbers.convertRoman(10));
  }

}