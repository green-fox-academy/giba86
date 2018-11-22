import java.util.HashMap;

public class CountLetters {

  public static HashMap<Character, Integer> sortItBuddy(String word) {

    HashMap<Character, Integer> hereUgoBuddy = new HashMap<>();
    char[] wordOfChars = word.toCharArray();

    for (int i = 0; i < wordOfChars.length; i++) {
      hereUgoBuddy.put(wordOfChars[i], hereUgoBuddy.getOrDefault(wordOfChars[i], 0) + 1);
    }
    return hereUgoBuddy;
  }
}

//m.put(c, m.getOrDefault()

//if (!hereUgoBuddy.containsKey(wordOfChars[i])) {
//        hereUgoBuddy.put(wordOfChars[i], 1);
//        } else {
//        int temp = hereUgoBuddy.get(wordOfChars[i]);
//        hereUgoBuddy.put(wordOfChars[i], temp + 1);
//        }