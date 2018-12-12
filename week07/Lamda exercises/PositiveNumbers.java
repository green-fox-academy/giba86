import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    numbers
            .stream()
            .filter(i -> i <= 0)
            .sorted(Collections.reverseOrder())
            .forEach(System.out::println);
  }
}
