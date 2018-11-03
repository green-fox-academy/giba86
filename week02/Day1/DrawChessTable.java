public class DrawChessTable {
    public static void main(String[] args) {
        int size = 8;
        for (int i = 1; i <=  size; i++) {
            for (int j = 1; j <= size / 2; j++) {
                if(i % 2 == 0){
                    System.out.print("% ");
                } else {
                    System.out.print(" %");
                }
            }
            System.out.println();
        }
    }
}

