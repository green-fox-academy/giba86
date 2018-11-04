import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
    }
    public static ArrayList<Integer> bubble(int[] bubiSimple){
        Arrays.sort(bubiSimple);
        ArrayList<Integer> bubi = new ArrayList<>();
        for (int i = 0; i < bubiSimple.length; i++) {
            bubi.add(bubiSimple[i]);
        }
        return bubi;
    }
    public static ArrayList<Integer> advancedBubble(int[] advBubi, boolean descending){
        ArrayList<Integer> advBubbArr = new ArrayList<>();
        Scanner orderType = new Scanner(System.in);
        System.out.println("Choose how you want your list back:\nType true if you want descending order\nType false if you want ascending order");

        do {
            try {
                descending = orderType.nextBoolean();
                break;
            } catch (InputMismatchException ignore) {
                System.out.println("Try again. Type \"true\" or \"false\".");
                orderType.next();
            }
        } while(true);

        if(descending){
            Arrays.sort(advBubi);
            for (int i = advBubi.length - 1; i >= 0; i--) {
                advBubbArr.add(advBubi[i]);
            }
        }else{
            return bubble(advBubi);
        }
        return advBubbArr;
    }
}
