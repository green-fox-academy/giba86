public class Factorio {
    public static void main(String[] args) {
        int input = 4;
        factorio(input);
    }
    public static void factorio(int theNumber){
        int factorka = 1;
        for (int i = 1; i <= theNumber; i++) {
            factorka *= i;

        }
        System.out.println("the factorial of "+theNumber+" is "+factorka);
    }
}
