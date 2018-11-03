import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of number you want to add: ");
        int size = input.nextInt();
        double sum = 0;
        for (int i = 1; i <= size; i++) {
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the "+i+" number: ");
            int nums = num.nextInt();
            sum += nums;
        }
        double avg = sum / size;
        System.out.println("The sum of the numbers is: "+sum);
        System.out.println("The avg of the numbers is: "+avg);
    }
}
