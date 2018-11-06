public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

       System.out.println(reverse(reversed));
        System.out.println(reverseTester(reversed));
    }
    public static String reverse(String normalStr){
        String rever = "";
        for (int i = normalStr.length() - 1; i >= 0; i--) {
            rever +=  normalStr.charAt(i);
        }
        return rever;
    }
    public static boolean reverseTester(String strTester){
        System.out.println("\nORIGINAL               : " + strTester);
        StringBuilder test = new StringBuilder(reverse(strTester)).reverse();
        System.out.println("original reversed twice: " + test);
        if(strTester.equals(test.toString())){
            return true;
        }
        return false;
    }
}
