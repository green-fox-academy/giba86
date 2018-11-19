public class String3 {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    public static void main(String[] args) {
        System.out.println(string3("abc'uk£fu  nd*ally"));
    }
    public static String string3(String word) {
        if (word.length() == 1) {
            return word;
        }
        return word.charAt(0) + "*" + string3(word.substring(1));
    }
}
