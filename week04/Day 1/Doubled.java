import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        String fileLocation = "duplicates.txt";
        System.out.println(removeDuplicates(fileLocation));
    }
    public static String removeDuplicates(String filePath){
        ArrayList<String> text = new ArrayList<>();
        String text2 = "";
        try {
            for(String lines : Files.readAllLines(Paths.get(filePath))){
                text.add(lines);
            }
            for (String lines : text) {
                for (int j = 0; j < lines.length(); j += 2) {
                    text2 += lines.charAt(j);

                }
                text2 += "\n";
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return text2;
    }
}
