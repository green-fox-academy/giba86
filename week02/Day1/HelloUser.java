import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userka = name.nextLine();

        System.out.println("Hello, "+userka);
    }
}