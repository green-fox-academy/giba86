import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {

        int[] side = {4, 5, 6, 7, 6, 5, 4}; // {4, 5, 6, 7, 6, 5, 4} , {5, 6, 7, 8, 9, 8, 7, 6, 5}
        int startingX = 10;
        int startingY = 120;
        int sideLength = 20;
        int heightHexa = 2 * sideLength;
        int distanceSides = (int) (Math.sqrt(3) * sideLength);
        int stepsX = sideLength + (sideLength / 2);
        int stepsY = distanceSides / 2;

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
                {startingX + sideLength / 2+ sideLength, startingY + (int) (Math.sqrt(3) / 2 * sideLength - distanceSides)},
                {startingX + sideLength / 2, startingY + (int) (Math.sqrt(3) / 2 * sideLength - distanceSides)}};
        int n = 6; // vertexes of hexagon
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < xy.length; i++) {
            x[i] = xy[i][0];
            y[i] = xy[i][1];
        }
        for (int all = 0; all < side.length; all++) {
            if(all <= side.length / 2){
                for (int i = 0; i < xy.length; i++) {
                    x[i] = xy[i][0] + (stepsX * all);
                    y[i] = xy[i][1] - (stepsY * all);
                }
            } else {
                for (int i = 0; i < xy.length; i++) {
                    x[i] = xy[i][0] + (stepsX * all);
                    y[i] = xy[i][1] + (stepsY * (all-side[side.length / 2 + 1]));
                }
            }
            for (int i = 0; i < side[all]; i++) {
                graphics.drawPolygon(x, y, n);
                for (int j = 0; j < n; j++) {
                    y[j] += distanceSides;
                }
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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