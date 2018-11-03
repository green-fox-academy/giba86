import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.println("Enter the size of the Triangle: ");
        int sizeT = size.nextInt();

        for (int i = 1; i <= sizeT; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
