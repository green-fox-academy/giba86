import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

  @Test
  void getApple() {
    Apple myApple = new Apple("Green Apple");
    String result = myApple.getApple();

    assertEquals("Green Apple", result);
  }
}