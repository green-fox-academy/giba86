import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PrintEachLine {
    public static void main(String[] args) {
        try{
            for (String line : Files.readAllLines(Paths.get("D:\\vidi.txt"))) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
