import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner strings = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String word1 = strings.nextLine();
        System.out.println("Enter the second word: ");
        String word2 = strings.nextLine();
        boolean equalStat;

        if(word1.length() == word2.length()){
            char[] c1 = word1.toLowerCase().toCharArray();
            char[] c2 = word2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            equalStat = Arrays.equals(c1, c2);
        }else{
            equalStat = false;
        }
        if(equalStat){
            System.out.println("The words are ANAGRAMS");
        }else{
            System.out.println("These words are NOT ANAGRAMS");
        }
    }

}
