import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

  @Test
  void Fibonacci() {
    int myResult = 5;

    assertEquals(myResult,Fibonacci.fibonacci(5));
  }

}