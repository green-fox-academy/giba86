//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GeneralExcercises {
    public static void main(String[] args) {
//        Path path = Paths.get("FileReader.iml");
//        Files.isReadable(path);
//        Files.isWritable(path);
//        Files.isDirectory(path);
        try {
           // List<String> lines = Files.readAllLines(path);
            for (String line : Files.readAllLines(Paths.get("FileReader.iml"))) { // Paths.get("FileReader.iml") make it no need the first 4 codes
                System.out.println(line);
            }
           // Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//    Scanner scan = new Scanner(System.in);
//
//    File file = new File("FileReader.iml");
//        System.out.println(file.exists());
//                System.out.println(file.canRead() + ", " + file.canWrite());
//
//                try{
//                Scanner anotherScan = new Scanner(file);
//                while(anotherScan.hasNext()) {
//                System.out.println(anotherScan.nextLine());
//                }
//                scan.close();
//                } catch (IOException ex) {
//
//                }
