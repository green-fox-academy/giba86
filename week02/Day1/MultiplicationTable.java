import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int multiple = imput.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiple+" times "+i+" = "+(i * multiple));
        }
    }
}
