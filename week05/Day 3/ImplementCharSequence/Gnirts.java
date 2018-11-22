package ImplementCharSequence;

public class Gnirts implements CharSequence {
  String theString;

  public Gnirts(String theString) {
    this.theString = theString;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
