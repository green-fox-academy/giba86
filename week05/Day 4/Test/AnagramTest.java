import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

  Anagram myAnnabanna = new Anagram("anna", "nana");

  @Test
  void getAnnagram() {
    boolean result = myAnnabanna.getAnnagram();
    assertEquals(true, result);
  }

}