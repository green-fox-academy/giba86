import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

  Sum mySum = new Sum(5);

  @Test
  void SummaryOfList() {
    int result = mySum.SummaryOfList();

    assertEquals(10,result );
  }

}