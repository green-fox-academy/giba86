import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;


class CountLettersTest {

//  CountLetters myWord = new CountLetters("alma");

  @Test
  void sortItBuddy() {
    String text = "alma";
    HashMap<Character, Integer> test = new HashMap<>();
    test.put('a', 2);
    test.put('l', 1);
    test.put('m', 1);

//    HashMap<Character, Integer> result = myWord.sortItBuddy();
    assertEquals(test, CountLetters.sortItBuddy("alma"));

  }

}