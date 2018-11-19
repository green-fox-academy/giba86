import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        String file = "reservedLines.txt";
        System.out.println(reservedLines(file));
    }
    public static String reservedLines(String fileName){
        String answer = "";
        try{
            List<String> text = Files.readAllLines(Paths.get(fileName));
            for (String lines : text) {
                for (int j = lines.length() - 1; j >= 0; j --) {
                    answer += lines.charAt(j);

                }
                answer += "\n";
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return answer;
    }

}