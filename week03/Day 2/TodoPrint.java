public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:
        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        // StringBuilder todoText2 = new StringBuilder(todoText).insert(todoText.length(), " - Download games\n\t- Diablo").insert(0, "My todo\n");
        System.out.println(new StringBuilder(todoText).insert(todoText.length(), " - Download games\n\t- Diablo").insert(0, "My todo\n"));
    }
}
