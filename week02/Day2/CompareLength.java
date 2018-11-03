public class CompareLength {
    public static void main(String[] args) {
        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5};
        compareLength(p1, p2);
    }
    public static void compareLength(int[] inp1, int[] inp2){
        if(inp1.length > inp2.length){
            System.out.println("first array has MORE elements than the second array");
        } else if (inp1.length < inp2.length){
            System.out.println("first array has LESS elements than the second array");
        } else {
            System.out.println("first array and the second array has same length");
        }
    }
}
