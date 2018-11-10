import java.util.ArrayList;
import java.util.Scanner;

public class AmstrongNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int amstrong = scan.nextInt();
        int calculation = amstrong;
        int isequal = 0;
        ArrayList<Integer> numsReverse = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();

        while (calculation > 0) {
            numsReverse.add(calculation % 10);
            calculation = calculation / 10;
        }
//        for (int i = 0; i < numsReverse.size(); i++) {
//            nums.add(numsReverse.get(numsReverse.size() - 1 - i));
//        }
//        System.out.println(nums);
        for (int i = 0; i < numsReverse.size(); i++) {
            isequal += Math.pow(numsReverse.get(i), numsReverse.size());
        }
        System.out.println(isequal);
        if (isequal == amstrong) {
            System.out.println(amstrong + " is an Armstrong number");
        } else {
            System.out.println(amstrong + " is NOT an Armstrong number\n because it is not eaqual the sum of the nth powers of its digits");
        }
    }
}