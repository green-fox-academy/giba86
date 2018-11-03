import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner imputs = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = imputs.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = imputs.nextInt();
        if(num1 > num2){
            System.out.println(num1+" is higher than "+num2);
        } else if(num1 < num2){
            System.out.println((num1+" is smaller than "+num2));
        } else {
            System.out.println(num1+" and "+num2+" are equal");
        }
    }
}
