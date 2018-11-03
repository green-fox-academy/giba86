public class ChangeElements {
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 8, 5, 6};
        s[3] = 4;
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
    }
}
