import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  public void testFor1Book() {
    assertEquals(8, Main.getPrice(1, 0, 0, 0, 0));

  }

  @Test
  public void testFor2Books() {
    assertEquals(16, Main.getPrice(2, 0, 0, 0, 0));
  }

  @Test
  public void testFor3Books() {
    assertEquals(21.6, Main.getPrice(1, 1, 1, 0, 0));
  }

  @Test
  public void testFor4SimilarBooks() {
    double expected = 4 * 8 * 0.8 * 3;
    assertEquals(expected, Main.getPrice(3, 3, 3, 3, 0));
  }

  @Test
  public void testFor5DiscountedBooks() {
    assertEquals(75.2, Main.getPrice(3, 3, 2, 2, 2));
  }
}