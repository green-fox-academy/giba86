import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to use as divisor: ");
        int divisor = input.nextInt();
        try {
            int result = 12 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e){                             // why "e" is there??????
            System.out.println("Fail!, you can't divide by 0!");
        }
    }
}
