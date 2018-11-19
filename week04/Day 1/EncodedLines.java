import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        String encoded = "encode.txt";
        System.out.println(decoder(encoded));
    }
    public static String decoder(String file){
        String answer = "";
        int ascii;
        try {
            List<String> text = Files.readAllLines(Paths.get(file));
            for (String lines : text) {
                for (int i = 0; i < lines.length(); i++) {
                    ascii = (int) lines.charAt(i);
                    if(ascii != 32) {
                        ascii--;
                    }
                    answer += (char) ascii;
                }
                answer += "\n";
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return answer;
    }
}