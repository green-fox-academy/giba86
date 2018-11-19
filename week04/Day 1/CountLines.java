import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        try{
            Path filePath = Paths.get("D:\\vidi.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                lines.get(i);
            }
            System.out.println(lines.size());
        } catch (IOException e){
            System.out.println("Can't read the file");
        }

    }
}
