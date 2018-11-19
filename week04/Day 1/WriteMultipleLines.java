import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        String filePath = "D:\\writeMultipleLines.txt";
        String theWord = "I am MohoJojo and I come to capture your world";
        int repeater = 5;
        writeFile(Paths.get(filePath), theWord, repeater);
    }
    public static void writeFile(Path path, String word, int number){
        List<String> text= new ArrayList<>();
        Path patha = Paths.get(String.valueOf(path));
        try {
            for (int i = 0; i < number; i++) {
                text.add(word);
            }
            Files.write(patha, text);
        } catch (IOException e){

        }
    }
}
