import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
        System.out.print(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    }
    public static ArrayList<Integer> unique(int[] test) {
        ArrayList<Integer> Lista = new ArrayList<>();
        for(int i = 0; i < test.length; i++) {
            if(!Lista.contains(test[i])) {
                Lista.add(test[i]);
            }
        }
        return Lista;
    }
}
