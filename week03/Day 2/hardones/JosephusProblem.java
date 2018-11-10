import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {

    public static void main(String[] args) {
        ArrayList<Integer> suiciders = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many people in the suicide circle: ");
        int circleSize = scan.nextInt();
        int counter = 0;
        int counterPlus = 0;
        int k = 2; // nth person or item removed from the list
        int steps = k - 1;
        int dead = 0; // how many people died or how many item removed
        for (int i = 1; i <= circleSize; i++) {  //fill the list
            suiciders.add(i);
        }
        while (suiciders.size() != 1){  // runs until 1 item in the list
            counter += steps;
            if(counter > suiciders.size() - 1){       //this statement should give 1 back
                counter = counter % suiciders.size(); //jumps to the first item if the 1 before the last one removed - it helps to remove the 1. element of the array
            }
            counterPlus += 1;
            dead = suiciders.get(counter);
            System.out.println("\n"+counterPlus+". dead is the "+dead+". person in the circle");
            suiciders.remove(suiciders.get(counter));
            System.out.println("Remaining people: " +suiciders);
        }
    }
}
