import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner legs = new Scanner(System.in);
        System.out.println("Enter the quantity of chickens: ");
        int chicken = legs.nextInt();
        System.out.println("Enter the quantity of pigs: ");
        int pigs = legs.nextInt();
        int totalLegs = chicken * 2 + pigs * 4;
        System.out.println("The total legs on the farm (exclude farmers) are "+totalLegs);
    }
}
