import java.util.Arrays;

public class Anagram {

  String text1;
  String text2;
  boolean equalStat;

  public Anagram(String text1, String text2) {

    this.text1 = text1;
    this.text2 = text2;
  }

  public boolean getAnnagram() {
    if (text1.length() == text2.length()) {
      char[] c1 = text1.toLowerCase().toCharArray();
      char[] c2 = text2.toLowerCase().toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      equalStat = Arrays.equals(c1, c2);
      return true;
    } else {
      return false;
    }
  }
}
