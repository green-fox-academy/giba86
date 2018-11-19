import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) {
        File fileSource = new File("D:\\vidi.txt");
        File fileDest = new File("D:\\gibagit/destfile.txt");

        copyFile(fileSource, fileDest);
    }
    public static boolean copyFile(File fileName, File fileDestination) {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream(fileName);
            fileOut = new FileOutputStream(fileDestination);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileIn.read(buffer)) > 0) {
                fileOut.write(buffer, 0, length);
            }
            fileIn.close();
            fileOut.close();
            System.out.println("File copy successful!");
            return true;
        } catch (IOException ioe){
            ioe.printStackTrace();
            return false;
        }
    }
}
