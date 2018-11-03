import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner imputs = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = imputs.nextInt();
        if(number % 2 == 0) {
            System.out.println("Number "+number+" is EVEN");
        } else {
            System.out.println("Number "+number+" is ODD");
        }
    }
}
