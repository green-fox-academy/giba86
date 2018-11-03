import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Enter the distance in Kilommeters: ");
        int kms = imput.nextInt();
        double miles = kms * 1.6;
        System.out.println(kms+"km is "+miles+" mi");
    }
}
