//something is wrong!

public class PrintParams {
    public static void main(String[] args) {
        String[] params = {"first", "second", "third", "fourth", "fifth", "sixth"};
        int till = 3;
        PrintParams(params, till);
    }
    public static void PrintParams(String[] input, int nums){
        for (int i = 0; i < nums; i++) {
            System.out.println(input[i]);

        }
    }
}
