public class Counter {
    public static void main(String[] args) {
        counter(10);
    }
    private static int counter(int n) {
        System.out.print(n + " ");
        if(n == 1) {
            return 1;
        } else {
            return counter(n - 1);
        }
    }
}
