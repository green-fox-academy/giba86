import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagonAnySize {
    public static void mainDraw(Graphics graphics) {

        int startingX = 10;
        int startingY = 180;
        int sideLength = 20;
        int heightHexa = 2 * sideLength; // distance between the farthest vertexes
        int distanceSides = (int) (Math.sqrt(3) * sideLength); // distance between 2 sides
        int stepsX = sideLength + (sideLength / 2); //steps on X axis
        int stepsY = distanceSides / 2; // steps on Y axis

        // set up the size of SuperHexagon
        Scanner scan = new Scanner(System.in);
        System.out.println("How many hexagon do you want on each side: ");
        int size = scan.nextInt();
        int[] side = new int[2 * size - 1];         // size of the array has to be double of the side - 1
        for (int i = 0; i <= side.length / 2; i++) {
            side[i] = size + i;                     // add numbers from the beginning
            side[side.length - 1 - i] = size + i;   // add numbers from the end
        }
        for (int i = 0; i < side.length; i++) {
            System.out.print(side[i] + " ");
        }
        //coordinates of vertexes
        //int[] a = {startingX, startingY};
        //int[] b = {startingX + sideLength / 2, startingY + (int) (Math.sqrt(3) / 2 * sideLength)};
        //int[] c = {startingX + sideLength / 2 + sideLength, startingY + (int) (Math.sqrt(3) / 2 * sideLength)};
        //int[] d = {startingX + heightHexa, startingY};
        //int[] e = {startingX + sideLength / 2+ sideLength, startingY + (int) (Math.sqrt(3) / 2 * sideLength - distanceSides)};
        //int[] f = {startingX + sideLength / 2, startingY + (int) (Math.sqrt(3) / 2 * sideLength - distanceSides)};
        int[][] xy = {{startingX, startingY}, {startingX + sideLength / 2, startingY + (int) (Math.sqrt(3) / 2 * sideLength)},
                {startingX + sideLength / 2 + sideLength, startingY + (int) (Math.sqrt(3) / 2 * sideLength)},
                {startingX + heightHexa, startingY},
                {startingX + sideLength / 2 + sideLength, startingY + (int) (Math.sqrt(3) / 2 * sideLength - distanceSides)},
                {startingX + sideLength / 2, startingY + (int) (Math.sqrt(3) / 2 * sideLength - distanceSides)}};
        // vertexes of hexagon in 2 arrays (x and y coordinates)
        int n = 6;
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < xy.length; i++) {
            x[i] = xy[i][0];
            y[i] = xy[i][1];
        }
        for (int all = 0; all < side.length; all++) {  //loop goes from 0 to length of side array
            if(all <= side.length / 2){                //if statement spearates the drawing. This part draws the first half
                for (int i = 0; i < xy.length; i++) {
                    x[i] = xy[i][0] + (stepsX * all);
                    y[i] = xy[i][1] - (stepsY * all);
                }
            } else {                                   //else part draws the 2nd half of the Super Hexagon
                for (int i = 0; i < xy.length; i++) {
                    x[i] = xy[i][0] + (stepsX * all);
                    y[i] = xy[i][1] + (stepsY * (all-side[side.length / 2 + 1])); //the magic which change the shifting
                }
            }
            for (int i = 0; i < side[all]; i++) {       //this for loop is which actually draws the Super Hexagon
                graphics.drawPolygon(x, y, n);
                for (int j = 0; j < n; j++) {           //this for loop changes the Y coordinates in each column
                    y[j] += distanceSides;
                }
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}