import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        String fileName = "reversedOrder.txt";
        System.out.println(reverseOrder(fileName));
    }
    public static String reverseOrder(String filePath){
        String answer = "";
        try {
            List<String> text = Files.readAllLines(Paths.get(filePath));
            for (int i = text.size() - 1; i >= 0; i--) {
                answer += text.get(i) + "\n";
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }
}