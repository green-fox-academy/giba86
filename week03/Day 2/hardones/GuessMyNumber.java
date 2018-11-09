import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int theNumber = rand.nextInt(99)+1;
        int lives = 8;

        while(true) {
            System.out.println("Enter your guess: ");
            int guess = scan.nextInt();
            if(guess == theNumber){
                System.out.println("!!!you win!!!\n the number is: "+guess);
                break;
            }else if( guess > theNumber){
                System.out.println("The number is smaller than your guess "+guess);
                lives --;
                System.out.println("you have "+lives+" lives left");
            }else if( guess < theNumber){
                System.out.println("The number is higher than your guess "+guess);
                lives --;
                System.out.println("you have "+lives+" lives left");
            }
            if(lives == 0){
                System.out.println("Loser");
                break;
            }
        }
    }
}
