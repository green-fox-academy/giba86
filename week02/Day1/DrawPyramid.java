import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.println("Enter the size of Pyramid:");
        int sizeP = size.nextInt();
        for (int i = 0; i <= sizeP; i++) {
            for (int j = 0; j < sizeP - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
