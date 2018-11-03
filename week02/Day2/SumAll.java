public class SumAll {
    public static void main(String[] args) {
        int[] a1 = {3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < a1.length; i++) {
            sum += a1[i];
        }
        System.out.println(sum);
    }
}
