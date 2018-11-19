public class Bunny1 {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    public static void main(String[] args) {
        System.out.println(bunny1(5));
    }
    public static int bunny1(int n) {
        if(n == 1) {
            return 2;
        }
        return 2 + bunny1(n - 1);
    }
}
