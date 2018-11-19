import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        List<String> content = new ArrayList<>();
        content.add("The first line of my file");
        content.add("My name is Gaborka Molnar");
        try{
            Path filePath = Paths.get("D:\\myfile.txt");
            Files.write(filePath, content);
        }catch (Exception e){
            System.out.println("Can't reach and/or create the file");
        }
    }
}
