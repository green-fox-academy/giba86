public class AppendA {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};
        String append = "a";
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]+append+" ");
        }
    }
}
