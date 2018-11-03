import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = imput.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = imput.nextInt();
        if(num1 >= num2) {
            System.out.println("The second number should be bigger");
        } else if(num2 > num1){
            for (int i = num1; i < num2; i++) {
                System.out.print(i+" ");
            }
        }
    }
}
