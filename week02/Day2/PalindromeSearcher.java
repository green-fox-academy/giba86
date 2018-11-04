import java.util.Scanner;

public class PalindromeSearcher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = input.nextLine();
        PalidromeSearch(word);
    }
    public static boolean  CheckPalidrome(String paliCheck){
        if(paliCheck.length() >= 3){
            for (int i = 0; i < paliCheck.length(); i++) {
                if(paliCheck.charAt(i) == paliCheck.charAt(paliCheck.length() - i - 1)){
                    return true;
                }
                if(paliCheck.charAt(i) != paliCheck.charAt((paliCheck.length() - i - 1))){
                    return false;
                }
            }
        }
        return false;
    }
    public static void PalidromeSearch(String palika){
        for (int i = 0; i < palika.length(); i++) {
            for (int j = i; j < palika.length(); j++) {
                if(CheckPalidrome(palika.substring(i, j + 1))){
                    System.out.println(palika.substring(i, j + 1));
                }
            }
        }
    }
}
