import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a+b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if (c > b && c > a)
      return c;
    else
      return b;
  }

  int median(List<Integer> pool) {
    Collections.sort(pool);
    return pool.get((pool.size()-1)/2);
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
  }

  String translate(String hungarian) {
    String answer = "";
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        answer = answer + c + 'v' +c;
      } else {
        answer = answer + c;
      }
    }
    return answer;
  }
}