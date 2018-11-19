public class String2 {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    public static void main(String[] args) {
        System.out.println(string2("axbxcx*dx  exfxrxtx"));
    }
    public static String string2(String word) {
        if (word.length() == 0) {
            return word;
        } else {
            if (word.charAt(0) == 'x') {
                return "" + string2(word.substring(1));
            }
            return word.charAt(0) + string2(word.substring(1));
        }
    }
}
