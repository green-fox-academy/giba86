import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Logs {
    public static void main(String[] args) {
        String filePath = "D:\\log.txt";
        System.out.println(uniqueIP(filePath));
        System.out.println(ratio(filePath));

    }

    public static ArrayList<String> uniqueIP(String path) {
        ArrayList<String> rawData = new ArrayList<>();
        ArrayList<String> ip = new ArrayList<>();

        try {
            for (String line : Files.readAllLines(Paths.get(path))) {
                rawData.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 1; i < rawData.size(); i++) {
            String temp = rawData.get(i).substring(27, 38);
            if (!(ip.contains(temp))) {
                ip.add(temp);
            }
        }
        return ip;
    }

    public static String ratio(String path) {
        ArrayList<String> rawData = new ArrayList<>();
        int post = 0;
        int get = 0;
        ArrayList<String> getPost = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(Paths.get(path))) {
                rawData.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 1; i < rawData.size(); i++) {
            String temp = rawData.get(i).substring(41, 45);
            if (temp.equals("POST")) {
                post++;
            } else if (temp.equals("GET ")) {
                get++;
            }
        }
        String ratio = "The ratio of POST and GET is " + post + " : " + get;
        return ratio;
    }
}
