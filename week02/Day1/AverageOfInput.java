import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        int allNums = 5;
        int nums = 0, sum = 0;
        double avg;

        for (int i = 1; i <= allNums; i++) {
            Scanner imput = new Scanner(System.in);
            System.out.println("Enter the "+i+". number: ");
            nums = imput.nextInt();
            sum += nums;
        }
        avg = sum / allNums;
        System.out.println("Sum of the numbers: "+sum);
        System.out.println("Avg of the numbers: "+avg);
    }
}
