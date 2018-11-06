public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        StringBuilder str = new StringBuilder(quote).insert(20, "always takes longer than ");
        String str2 = quote.replace("It you", "It always takes longer than you");
        StringBuilder str3 = new StringBuilder(quote).insert(quote.indexOf(" you"), " always takes longer than"); //white spacing different from previous examples
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

    }
}
