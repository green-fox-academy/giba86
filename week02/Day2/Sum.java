import java.util.Random;

public class Sum {
    public static void main(String[] args) {
        int size = 10;
        sum(size);
        }

    public static void sum(int theSize) {
        int nums;
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < theSize; i++) {
            nums = rand.nextInt(50);
            sum += nums;
        }
        System.out.println("The sum of "+theSize+" random numbers is "+sum);
    }
}
