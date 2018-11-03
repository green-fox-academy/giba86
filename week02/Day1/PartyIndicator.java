import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner partyfaces = new Scanner(System.in);

        System.out.println("How many girs are coming to the party?");
        int girls = partyfaces.nextInt();
        System.out.println("How many boys are coming to the party?");
        int boys = partyfaces.nextInt();
        int participants = girls + boys;

        if (boys == girls && participants >= 20) {
            System.out.println("The party is excellent!");
        } else if (boys != girls && girls != 0 && participants >= 20) {
            System.out.println("Quite cool party!");
        } else if (girls != 0 && participants < 20) {
            System.out.println("Average party...");
        } else if (girls == 0) {
            System.out.println("Sausage party");
        }
    }
}
