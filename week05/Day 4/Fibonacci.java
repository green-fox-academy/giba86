public class Fibonacci {


  static int fibonacci(int index) {

    int fibi = 0;
    int temp = 1;

    for (int i = 0; i < index; i++) {
      int sumOfTwo = temp + fibi;
      fibi = temp;
      temp = sumOfTwo;

    }
    return fibi;
  }
}
