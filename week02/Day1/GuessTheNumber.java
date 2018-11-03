import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(50);
        int attempt = 0;
        while(true){
            Scanner guess = new Scanner(System.in);
            System.out.println("Enter your guess: ");
            int guessNum = guess.nextInt();
            if(guessNum > number){
                System.out.println("Your guess is higher");
                attempt ++;
            } else if(guessNum < number) {
                System.out.println("Your guess is lower");
                attempt ++;
            } else {
                System.out.println("Great you found it!! from "+attempt+" attempts");
            }
        }

    }
}
