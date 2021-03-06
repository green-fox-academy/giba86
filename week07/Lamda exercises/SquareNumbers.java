import java.util.Arrays;
import java.util.List;

public class SquareNumbers {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    numbers
            .stream()
            .filter(i -> i > 0 && i * i > 20)
            .sorted()
            .forEach(System.out::println);
  }
}
