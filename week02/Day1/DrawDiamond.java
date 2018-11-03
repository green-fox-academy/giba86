import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Diamond:");
        int sizeFull = input.nextInt();
        if(sizeFull % 2 == 0){
            sizeFull --;
            System.out.println("Diamond size will be "+sizeFull+" instead of "+(sizeFull +1)+" in favour of better shape");
        }
        int size = sizeFull / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = size; i >= 0; i--) {
            for (int j = 0; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
