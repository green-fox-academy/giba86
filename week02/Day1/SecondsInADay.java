public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remainingSeconds = (24 * 60 * 60) - (14 * 3600 + 34 * 60 + 42);
        System.out.println("remaining seconds of the day is "+remainingSeconds);
    }
}
