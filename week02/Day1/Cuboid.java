import java.util.Scanner;
public class Cuboid {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the length of the cuboid:");
        double l = p.nextDouble();
        System.out.println("Enter the breadth of the cuboid:");
        double b = p.nextDouble();
        System.out.println("Enter the height of the cuboid:");
        double h = p.nextDouble();

        double SurfaceArea = 2 * (l * b) + 2 * (l * h) + 2 * (b * h);
        double Volume = l * b * h;

        System.out.println("The Surface Area of the cuboid: "+SurfaceArea);
        System.out.println("The Volume of the cuboid: "+Volume);
    }
}
