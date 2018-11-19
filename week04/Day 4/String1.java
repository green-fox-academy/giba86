public class String1 {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    public static void main(String[] args) {
        System.out.println(string1("aximaxipaxixxiaxi"));
    }

    public static String string1(String word) {
        if (word.length() == 0) {
            return word;
        } else {
            if (word.charAt(0) == 'x') {
                return "y" + string1(word.substring(1));
            }
            return word.charAt(0) + string1(word.substring(1));
        }
    }
}


//        if (!(word.contains("x"))) {
//                return word;
//                }
//                return word.replace("x", "y");