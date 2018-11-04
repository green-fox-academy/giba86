import java.util.Scanner;

public class PalindromeBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word here: ");
        String inputWord = input.nextLine();
        PalindromeBuilder(inputWord);
    }
    public static void PalindromeBuilder(String pali){
        String reverse = "";
        for (int i = pali.length() - 1; i > 0; i--) {
            reverse += pali.charAt(i);
        }
        System.out.println(pali+reverse);
    }
}
